package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrimeiroSemestre extends Activity {

	public double notaFSI;
	public double notaTP1;
	public double notaDPW;
	public double notaOC;
	public double notaMB;
	public double notaTPD;
	public void guardaValores1S(){
		EditText texto1 = (EditText) findViewById(R.id.notaFSI); 
		EditText texto2 = (EditText) findViewById(R.id.notaTP1); 
		EditText texto3 = (EditText) findViewById(R.id.notaDPW); 
		EditText texto4 = (EditText) findViewById(R.id.notaOC); 
		EditText texto5 = (EditText) findViewById(R.id.notaMB); 
		EditText texto6 = (EditText) findViewById(R.id.notaTPD); 
		notaFSI = Double.parseDouble(texto1.getText().toString()); 
		notaTP1 = Double.parseDouble(texto2.getText().toString());
		notaFSI = Double.parseDouble(texto3.getText().toString()); 
		notaTP1 = Double.parseDouble(texto4.getText().toString());
		notaFSI = Double.parseDouble(texto5.getText().toString()); 
		notaTP1 = Double.parseDouble(texto6.getText().toString());

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primeiro_semestre);
		
		Button anterior = (Button) findViewById(R.id.button1); 
		 anterior.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 Intent i = new Intent(PrimeiroSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button proximo = (Button) findViewById(R.id.button2); 
		 proximo.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
	     //guardaValores1S();
		 Intent i = new Intent(PrimeiroSemestre.this, SegundoSemestre.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
		 Button calcula = (Button) findViewById(R.id.button3); 
		 calcula.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 		 
		 //guardaValores1S();
		 Intent i = new Intent(PrimeiroSemestre.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.primeiro_semestre, menu);
		return true;
	}

}
