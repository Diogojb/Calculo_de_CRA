package com.example.calculo_de_cr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private void checaMatricula(String matricula){
		if(new File(matricula+".txt").exists()){
			try {
				 FileReader arq = new FileReader(matricula+".txt"); 
				 BufferedReader lerArq = new BufferedReader(arq); 
			}catch (IOException e) 
				 { 
				 System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage()); 
				 } 
		}			
		else{
			try {
			BufferedWriter br = new BufferedWriter(new FileWriter(new File(matricula+".txt"))); 
			}catch (IOException e) 
			 { 
			 System.err.printf("Erro na criação do arquivo: %s.\n", e.getMessage()); 
			 } 
		}
}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button botao = (Button) findViewById(R.id.button1); 
		 botao.setOnClickListener(new View.OnClickListener() { 
		 public void onClick(View v) { 
		EditText texto1 = (EditText) findViewById(R.id.nMatricula);
		 String matricula = texto1.getText().toString();
		 if(matricula!=null){
			checaMatricula(matricula); 
		 }
		 Intent i = new Intent(MainActivity.this, Tela2.class); 
		 Bundle params = new Bundle(); 
		 i.putExtras(params); 
		 startActivity(i); 
		 	} 
		 }); 
	} 


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
