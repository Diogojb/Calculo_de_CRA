package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SegundoSemestre extends Activity {

	public double notaTP2;
	public double notaILC;
	public double notaAEA;
	public double notaCalc1;
	public double notaAl;
	public double notaEletiva1;
	public int valorEletiva1;
	public void guardaValores2S(){
		EditText texto1 = (EditText) findViewById(R.id.notaTP2); 
		EditText texto2 = (EditText) findViewById(R.id.notaILC); 
		EditText texto3 = (EditText) findViewById(R.id.notaAEA); 
		EditText texto4 = (EditText) findViewById(R.id.notaCalc1); 
		EditText texto5 = (EditText) findViewById(R.id.notaAL); 
		EditText texto6 = (EditText) findViewById(R.id.notaEletiva1);
		EditText texto7 = (EditText) findViewById(R.id.valorEletiva1);
		notaTP2 = Double.parseDouble(texto1.getText().toString()); 
		notaILC = Double.parseDouble(texto2.getText().toString());
		notaAEA = Double.parseDouble(texto3.getText().toString()); 
		notaCalc1 = Double.parseDouble(texto4.getText().toString());
		notaAl = Double.parseDouble(texto5.getText().toString()); 
		notaEletiva1 = Double.parseDouble(texto6.getText().toString());
		valorEletiva1 = Integer.parseInt(texto7.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segundo_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(SegundoSemestre.this, PrimeiroSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 	
		 //guardaValores2S();
		 Intent i = new Intent(SegundoSemestre.this, TerceiroSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 	
		 //guardaValores2S();
		 Intent i = new Intent(SegundoSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segundo_semestre, menu);
		return true;
	}

}
