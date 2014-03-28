package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TerceiroSemestre extends Activity {

	public double notaBD1;
	public double notaEDD1;
	public double notaSO;
	public double notaEDC;
	public double notaCalc2;
	public double notaProb;
	public double notaEletiva2;
	public int valorEletiva2;
	public void guardaValores3S(){
		EditText texto1 = (EditText) findViewById(R.id.notaBD1); 
		EditText texto2 = (EditText) findViewById(R.id.notaEDD1); 
		EditText texto3 = (EditText) findViewById(R.id.notaSO); 
		EditText texto4 = (EditText) findViewById(R.id.notaEDC); 
		EditText texto5 = (EditText) findViewById(R.id.notaCalc2); 
		EditText texto6 = (EditText) findViewById(R.id.notaProb);
		EditText texto7 = (EditText) findViewById(R.id.notaEletiva2);
		EditText texto8 = (EditText) findViewById(R.id.valorEletiva2);
		notaBD1 = Double.parseDouble(texto1.getText().toString()); 
		notaEDD1 = Double.parseDouble(texto2.getText().toString());
		notaSO = Double.parseDouble(texto3.getText().toString()); 
		notaEDC = Double.parseDouble(texto4.getText().toString());
		notaCalc2 = Double.parseDouble(texto5.getText().toString()); 
		notaProb = Double.parseDouble(texto6.getText().toString());
		notaEletiva2 = Double.parseDouble(texto7.getText().toString());
		valorEletiva2 = Integer.parseInt(texto8.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terceiro_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(TerceiroSemestre.this, SegundoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 
			 //guardaValores3S();
		 Intent i = new Intent(TerceiroSemestre.this, QuartoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) {
			 //guardaValores3S();
		 Intent i = new Intent(TerceiroSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.terceiro_semestre, menu);
		return true;
	}

}
