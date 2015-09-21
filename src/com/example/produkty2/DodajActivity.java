package com.example.produkty2;

import java.io.IOException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.produkty2.produktyendpoint.Produktyendpoint;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;


@SuppressLint("NewApi")
public class DodajActivity extends Activity {

	private TextView name;
	private TextView price;
	private TextView count_product;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dodaj);
		//zmiana uprawnien
		StrictMode.enableDefaults();
		name = (TextView)findViewById(R.id.name);
		price = (TextView)findViewById(R.id.price);
		count_product = (TextView)findViewById(R.id.count_product);
		
		Button button = (Button)findViewById(R.id.wyslij);
		
	
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("backgroud", "doInBackground");
		    	Produktyendpoint.Builder builder = new Produktyendpoint.Builder(AndroidHttp.newCompatibleTransport(),new JacksonFactory(),null);
				builder = CloudEndpointUtils.updateBuilder(builder);
				
				Produktyendpoint endpoint = builder.build();
				Log.d("wiadomosc","ok");			
				try {

	
					com.example.produkty2.produktyendpoint.model.Produkty wiad = new com.example.produkty2.produktyendpoint.model.Produkty();
					wiad.setId((long) 112);
					wiad.setNazwa(name.getText().toString());
					wiad.setCena(price.getText().toString());
					wiad.setIloscproduktow(count_product.getText().toString());
			        
					endpoint.insertProdukty(wiad).execute();
				} catch (IOException e) {
					Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
					//e.printStackTrace();
				}
				reakcja();
			
				
			}
		});
		
	
		
		
	}
	
	public void reakcja(){
		Intent  i = new Intent(this,MainActivity.class);
		startActivity(i);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.dodaj, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
