package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuartoSemestre extends Activity {
	
	public double notaAS;
	public double notaEDD2;
	public double notaIHC;
	public double notaLFA;
	public double notaEstatistica;
	public double notaRedes1;
	public double notaEletiva3;
	public int valorEletiva3;
	public void guardaValores4S(){
		EditText texto1 = (EditText) findViewById(R.id.notaAS); 
		EditText texto2 = (EditText) findViewById(R.id.notaEDD2); 
		EditText texto3 = (EditText) findViewById(R.id.notaIHC); 
		EditText texto4 = (EditText) findViewById(R.id.notaLFA); 
		EditText texto5 = (EditText) findViewById(R.id.notaEstatistica); 
		EditText texto6 = (EditText) findViewById(R.id.notaRedes1);
		EditText texto7 = (EditText) findViewById(R.id.notaEletiva3);
		EditText texto8 = (EditText) findViewById(R.id.valorEletiva3);
		notaAS = Double.parseDouble(texto1.getText().toString()); 
		notaEDD2 = Double.parseDouble(texto2.getText().toString());
		notaIHC = Double.parseDouble(texto3.getText().toString()); 
		notaLFA = Double.parseDouble(texto4.getText().toString());
		notaEstatistica = Double.parseDouble(texto5.getText().toString()); 
		notaRedes1 = Double.parseDouble(texto6.getText().toString());
		notaEletiva3 = Double.parseDouble(texto7.getText().toString());
		valorEletiva3 = Integer.parseInt(texto8.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quarto_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(QuartoSemestre.this, TerceiroSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 
			 //guardaValores4S();
		 Intent i = new Intent(QuartoSemestre.this, QuintoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 	
			 //guardaValores4S();
		 Intent i = new Intent(QuartoSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quarto_semestre, menu);
		return true;
	}

}
