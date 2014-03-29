package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuintoSemestre extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quinto_semestre);

		Button anterior = (Button) findViewById(R.id.button1);
		anterior.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(QuintoSemestre.this, QuartoSemestre.class);
				Bundle params = new Bundle();
				i.putExtras(params);
				startActivity(i);
			}
		});
		Button proximo = (Button) findViewById(R.id.button2);
		proximo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// guardaValores5S();
				Intent i = new Intent(QuintoSemestre.this, SextoSemestre.class);
				Bundle params = new Bundle();
				i.putExtras(params);
				startActivity(i);
			}
		});
		Button calcula = (Button) findViewById(R.id.button3);
		calcula.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText texto1 = (EditText) findViewById(R.id.notaPCS);
				EditText texto2 = (EditText) findViewById(R.id.notaBD2);
				EditText texto3 = (EditText) findViewById(R.id.notaAA);
				EditText texto4 = (EditText) findViewById(R.id.notaRedes2);
				EditText texto5 = (EditText) findViewById(R.id.notaEMP);
				EditText texto6 = (EditText) findViewById(R.id.notaEletiva4);
				EditText texto7 = (EditText) findViewById(R.id.valorEletiva4);
				double notaPCS = Double
						.parseDouble(texto1.getText().toString());
				double notaBD2 = Double
						.parseDouble(texto2.getText().toString());
				double notaAA = Double.parseDouble(texto3.getText().toString());
				double notaRedes2 = Double.parseDouble(texto4.getText()
						.toString());
				double notaEMP = Double
						.parseDouble(texto5.getText().toString());
				double notaEletiva4 = Double.parseDouble(texto6.getText()
						.toString());
				int valorEletiva4 = Integer.parseInt(texto7.getText()
						.toString());

				int cargaCumprida = (valorEletiva4 + 4 + 4 + 4 + 4 + 4);
				double crSemestre = (notaPCS * 4 + notaBD2 * 4 + notaAA * 4
						+ notaRedes2 * 4 + notaEMP * 4 + notaEletiva4
						* valorEletiva4)
						/ cargaCumprida;
				Intent i = new Intent(QuintoSemestre.this, Tela2.class);
				Bundle params = new Bundle();
				String resposta = "CRA: " + crSemestre + "Carga Cumprida: "
						+ cargaCumprida;
				// params.putString("mensagem", resposta);
				i.putExtras(params);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quinto_semestre, menu);
		return true;
	}

}
