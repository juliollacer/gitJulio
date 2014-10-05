package com.example.proyecto01;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 
public class MainActivity extends Activity {
      
	private static final String TAG = "Primera Ventana";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        
            final  EditText text = (EditText)findViewById(R.id.editText1); 
            final Button btn = (Button) findViewById(R.id.button1);
            
           //  final Editable address = (text.getText());
       
              
            btn.setOnClickListener(new Button.OnClickListener(){
				
                  @Override
				 public void onClick(View v) {
					Intent mapa = new Intent(
					  android.content.Intent.ACTION_VIEW,
				      Uri.parse("geo:0,0?q=" +text.getText()));
					startActivity(mapa);	
		    	 }}); 
                
                
                
                
                Log.i(TAG, "On Create");
         }

   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	   final EditText text = (EditText)findViewById(R.id.editText1); 
	   if (requestCode == 1) {
    		  if (resultCode == RESULT_OK){
    			  String devolucion=data.getStringExtra("Lugar");
    			  text.setText(devolucion);
    			  
		        }
		        if (resultCode == RESULT_CANCELED) {
		        }}}
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
}
