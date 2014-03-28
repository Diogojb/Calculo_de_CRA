package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetimoSemestre extends Activity {

	public double notaPS;
	public double notaPG1;
	public double notaOP3;
	public double notaOP4;
	public double notaOP5;
	public int valorOP3;
	public int valorOP4;
	public int valorOP5;
	public void guardaValores7S(){
		EditText texto1 = (EditText) findViewById(R.id.notaPS); 
		EditText texto2 = (EditText) findViewById(R.id.notaPG1); 
		EditText texto3 = (EditText) findViewById(R.id.notaOP3); 
		EditText texto4 = (EditText) findViewById(R.id.notaOP4); 
		EditText texto5 = (EditText) findViewById(R.id.notaOP5); 
		EditText texto6 = (EditText) findViewById(R.id.valorOP3);
		EditText texto7 = (EditText) findViewById(R.id.valorOP4);
		EditText texto8 = (EditText) findViewById(R.id.valorOP5);
		notaPS = Double.parseDouble(texto1.getText().toString()); 
		notaPG1 = Double.parseDouble(texto2.getText().toString());
		notaOP3 = Double.parseDouble(texto3.getText().toString()); 
		notaOP4 = Double.parseDouble(texto4.getText().toString());
		notaOP5 = Double.parseDouble(texto5.getText().toString()); 
		valorOP3 = Integer.parseInt(texto6.getText().toString());
		valorOP4 = Integer.parseInt(texto7.getText().toString());
		valorOP5 = Integer.parseInt(texto8.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setimo_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(SetimoSemestre.this, SextoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) {
			 //guardaValores7S();
		 Intent i = new Intent(SetimoSemestre.this, OitavoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 	
			 //guardaValores7S();
		 Intent i = new Intent(SetimoSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.setimo_semestre, menu);
		return true;
	}

}
