package com.example.produkty2;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.produkty2.produktyendpoint.Produktyendpoint;
import com.example.produkty2.produktyendpoint.Produktyendpoint.GetProdukty;
import com.example.produkty2.produktyendpoint.model.CollectionResponseProdukty;
import com.example.produkty2.produktyendpoint.model.Produkty;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;

public class ListaActivity extends Activity {
	
	private int id_prod;
	private TextView name;
	private TextView price;
	private TextView count_product;
	private Button button;
	protected ArrayList<ElementList> listNew;
	
	protected Object item;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);
		
		new PersonTask(this).execute();
		
	}
	

	public void reakcja(){
		Intent  i = new Intent(this,ListaActivity.class);
		startActivity(i);
	}
	
	
	private class PersonTask extends AsyncTask<Void,Void,CollectionResponseProdukty>{
		
		Exception exceptionThrown = null;	
		
		protected ListView listview;
	
		
		protected Activity ActivityParent;
		
		
	    public PersonTask(Activity activity) {
	        this.ActivityParent = activity;
	        Log.d("activity","activity");
	      }
		
		 @Override
		    protected void onPreExecute() {
		        super.onPreExecute();
		        Log.d("onPreExecute","onPreExecute");
		    }


			@Override
		    protected CollectionResponseProdukty doInBackground(Void... arg0) {
		    		
				try {
			    	Log.d("doInBackground","doInBackground");
			        //do code here 
			    	Produktyendpoint.Builder builder = new Produktyendpoint.Builder(AndroidHttp.newCompatibleTransport(),new JacksonFactory(),null);
					builder = CloudEndpointUtils.updateBuilder(builder);
					Produktyendpoint endpoint = builder.build();		
					CollectionResponseProdukty produkty = endpoint.listProdukty().execute();	
					
					
					 listNew = new ArrayList<ElementList>();
					 Log.d("lista","start");
					 for(Produkty message : produkty.getItems()) {
				          ElementList elementList = new ElementList(message.getId(), message.getNazwa());
				          elementList.setCountProduct(message.getIloscproduktow());
				          elementList.setPrice(message.getCena());
				          listNew.add(elementList);
				         
				     }
					 return produkty;
				
				} catch (IOException e) {
					exceptionThrown = e;
					Log.d("return","null");
					return null;
				}
		    }
			protected void onPostExecute(CollectionResponseProdukty result){
				Log.d("onPostExecute","onPostExecute");
				if (exceptionThrown == null) {
					Log.d("lista","po dodaniu");
					listview = (ListView) findViewById(R.id.listview);
					Log.d("lista","listview");
					ArrayAdapter adapter = new ArrayAdapter(ActivityParent,android.R.layout.simple_list_item_1, listNew);
					listview.setAdapter(adapter);
					
					listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

						@Override
						public void onItemClick(AdapterView<?> parent, View view,
								int position, long id) {
							 String value = listNew.get(position).getName();
							 Log.d("name","name"+value);
							
							try {
								createWindow(position);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
								//e.printStackTrace();
							}
							
							
						}
					});
					
							
				}else{
					Toast.makeText(getApplicationContext(), exceptionThrown.getMessage(), Toast.LENGTH_LONG).show();
				}
				
			}
			
			protected void onPostExecute2(CollectionResponseProdukty result) {
		        // Dismiss the progress dialog
		    	Log.d("onPostExecute",exceptionThrown.getMessage());
		    	if (exceptionThrown != null) {
		    		
		            Log.e(ListaActivity.class.getName(), 
		                    "Exception when listing Messages", exceptionThrown);
		    		
		    		
		    	}else if(result != null){
					 listNew = new ArrayList<ElementList>();
					 Log.d("lis4l4ta","start");
					 for(Produkty message : result.getItems()) {
				          ElementList elementList = new ElementList(message.getId(), message.getNazwa());
				          elementList.setCountProduct(message.getIloscproduktow());
				          elementList.setPrice(message.getCena());
				          listNew.add(elementList);
				         
				     }
					 Log.d("lista","po dodaniu");
					 Log.d("lista","listview");
				 
		    	}
		        
				 

		    }
	}
	
	
	
	public void createWindow(int id) throws IOException{
		Dialog dialog = new Dialog(this);
		dialog.setContentView(R.layout.activity_edycja);
		dialog.setTitle("Mariusz "+id);
		id_prod = id;
		
    	Produktyendpoint.Builder builder = new Produktyendpoint.Builder(AndroidHttp.newCompatibleTransport(),new JacksonFactory(),null);
		builder = CloudEndpointUtils.updateBuilder(builder);
		Produktyendpoint endpoint = builder.build();
		//GetProdukty produkty = endpoint.getProdukty(id_prod);
		name = (TextView)dialog.findViewById(R.id.name_edit);
		price = (TextView)dialog.findViewById(R.id.price_edit);
		count_product = (TextView)dialog.findViewById(R.id.count_product_edit);
		

		button = (Button)dialog.findViewById(R.id.wyslij_edit);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Log.d("wiadomosc","ok");			
				try {
					Produktyendpoint.Builder builder = new Produktyendpoint.Builder(AndroidHttp.newCompatibleTransport(),new JacksonFactory(), null);
					builder = CloudEndpointUtils.updateBuilder(builder);
					
					Produktyendpoint endpoint = builder.build();
					
					com.example.produkty2.produktyendpoint.model.Produkty wiad = new com.example.produkty2.produktyendpoint.model.Produkty();
					wiad.setNazwa(name.getText().toString());
					wiad.setCena(price.getText().toString());
					wiad.setIloscproduktow(count_product.getText().toString());
					ElementList elementList = listNew.get(id_prod);
					wiad.setId(elementList.getId());
					endpoint.updateProdukty(wiad).execute();
					Log.d("poszlo","ok");
					reakcja();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					Log.d("error",e.getMessage());
					Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
					//e.printStackTrace();
				}
				
				
				
			}
		});
		//prod
		//Produkt deviceList = (Produkt)produkty.getAttribute("produkt");
		ElementList elementList = listNew.get(id_prod);
		name.setText(elementList.getName());
		price.setText(elementList.getPrice());
		count_product.setText(elementList.getCountProduct());
		dialog.show();
		
		
	}

}
