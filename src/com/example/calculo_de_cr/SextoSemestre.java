package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class SextoSemestre extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sexto_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(SextoSemestre.this, QuintoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(SextoSemestre.this, SetimoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(SextoSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sexto_semestre, menu);
		return true;
	}

}
