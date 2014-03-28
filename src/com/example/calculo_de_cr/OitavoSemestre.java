package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OitavoSemestre extends Activity {
	
	public double notaGPI;
	public double notaPG2;
	public double notaOP6;
	public double notaOP7;
	public double notaOP8;
	public int valorOP6;
	public int valorOP7;
	public int valorOP8;
	public void guardaValores8S(){
		EditText texto1 = (EditText) findViewById(R.id.notaGPI); 
		EditText texto2 = (EditText) findViewById(R.id.notaPG2); 
		EditText texto3 = (EditText) findViewById(R.id.notaOP6); 
		EditText texto4 = (EditText) findViewById(R.id.notaOP7); 
		EditText texto5 = (EditText) findViewById(R.id.notaOP8); 
		EditText texto6 = (EditText) findViewById(R.id.valorOP6);
		EditText texto7 = (EditText) findViewById(R.id.valorOP7);
		EditText texto8 = (EditText) findViewById(R.id.valorOP8);
		notaGPI = Double.parseDouble(texto1.getText().toString()); 
		notaPG2 = Double.parseDouble(texto2.getText().toString());
		notaOP6 = Double.parseDouble(texto3.getText().toString()); 
		notaOP7 = Double.parseDouble(texto4.getText().toString());
		notaOP8 = Double.parseDouble(texto5.getText().toString()); 
		valorOP6 = Integer.parseInt(texto6.getText().toString());
		valorOP7 = Integer.parseInt(texto7.getText().toString());
		valorOP8 = Integer.parseInt(texto8.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_oitavo_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 
			 //guardaValores8S();
		 Intent i = new Intent(OitavoSemestre.this, SetimoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 	
			 //guardaValores8S();
		 Intent i = new Intent(OitavoSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.oitavo_semestre, menu);
		return true;
	}

}
