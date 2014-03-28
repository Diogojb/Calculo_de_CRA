package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(Tela2.this, MainActivity.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button incluiNota = (Button) findViewById(R.id.button2); 
		 incluiNota.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(Tela2.this, PrimeiroSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela2, menu);
		return true;
	}

}
