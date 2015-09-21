package com.example.produkty2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button lista;
	private Button dodaj;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lista = (Button) findViewById(R.id.lista);
		dodaj = (Button) findViewById(R.id.dodaj);
		
		
		lista.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				reakcjaLista();
			}
		});
		
		dodaj.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				reakcjaDodaj();
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	public void reakcjaLista(){
		Intent  i = new Intent(this,ListaActivity.class);
		startActivity(i);
	}
	
	public void reakcjaDodaj(){
		Intent  i = new Intent(this,DodajActivity.class);
		startActivity(i);
	}
	
}
