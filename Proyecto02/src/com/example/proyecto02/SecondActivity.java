package com.example.proyecto02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
	 
	private static final String TAG = "Segunda Ventana";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		

				final Button btnVlc = (Button) findViewById (R.id.button2);
				final Button btnBar = (Button) findViewById (R.id.button3);
				final Button btnVal = (Button) findViewById (R.id.button5);
				final Button btnBil = (Button) findViewById (R.id.button1);
			    final Button btnSev = (Button) findViewById (R.id.button4);
				final Button btnMad = (Button) findViewById (R.id.button6);
				
			       btnVlc.setOnClickListener (new devolverLugar());	
			       btnBar.setOnClickListener (new devolverLugar());
			       btnVal.setOnClickListener (new devolverLugar());
			       btnBil.setOnClickListener (new devolverLugar());
			       btnSev.setOnClickListener (new devolverLugar());
			       btnMad.setOnClickListener (new devolverLugar());
	   Log.i(TAG, "On Create");	
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
	
      class devolverLugar implements Button.OnClickListener{
			
		@Override
			public void onClick(View v) {
			
			final Button boton = (Button) findViewById(v.getId());
	             Intent devolucion = new Intent();
	               devolucion.putExtra ("Lugar", boton.getText());	
	        	   setResult ( RESULT_OK, devolucion);
	             finish();
	        
		}}
			      @Override
			  	protected void onStart() {
			  		super.onStart();
			  		Log.i(TAG, "onStart");
			  	}
			  	@Override
			  	protected void onResume() {
			  		super.onResume();
			  		Log.i(TAG, "onResume");
			  	}
			  	@Override
			  	protected void onPause() {
			  		super.onPause();
			  		Log.i(TAG, "onPause");
			  	}
			  	@Override
			  	protected void onStop() {
			  		super.onStop();
			  		Log.i(TAG, "onStop");
			  	}
			  	@Override
			  	protected void onRestart() {
			  		super.onRestart();
			  		Log.i(TAG, "onRestart");
			  	}
			  	@Override
			  	protected void onDestroy() {
			  		super.onDestroy();
			  		Log.i(TAG, "onDestroy");
			  	}
   }