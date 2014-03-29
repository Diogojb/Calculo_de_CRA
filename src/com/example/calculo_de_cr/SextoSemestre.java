package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
				// guardaValores6S();
				Intent i = new Intent(SextoSemestre.this, SetimoSemestre.class);
				Bundle params = new Bundle();
				i.putExtras(params);
				startActivity(i);
			}
		});
		Button calcula = (Button) findViewById(R.id.button3);
		calcula.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				EditText texto1 = (EditText) findViewById(R.id.notaPM);
				EditText texto2 = (EditText) findViewById(R.id.notaPCS_SGBD);
				EditText texto3 = (EditText) findViewById(R.id.notaADF);
				EditText texto4 = (EditText) findViewById(R.id.notaOP1);
				EditText texto5 = (EditText) findViewById(R.id.notaOP2);
				EditText texto6 = (EditText) findViewById(R.id.valorOP1);
				EditText texto7 = (EditText) findViewById(R.id.valorOP2);
				double notaPM = Double.parseDouble(texto1.getText().toString());
				double notaPCS_SGBD = Double.parseDouble(texto2.getText()
						.toString());
				double notaADF = Double
						.parseDouble(texto3.getText().toString());
				double notaOP1 = Double
						.parseDouble(texto4.getText().toString());
				double notaOP2 = Double
						.parseDouble(texto5.getText().toString());
				int valorOP1 = Integer.parseInt(texto6.getText().toString());
				int valorOP2 = Integer.parseInt(texto7.getText().toString());

				int cargaCumprida = (4 + 4 + 4 + valorOP1 + valorOP2);
				double crSemestre = (notaPM * 4 + notaPCS_SGBD * 4 + notaADF
						* 4 + notaOP1 * valorOP1 + notaOP2 * valorOP2)
						/ cargaCumprida;
				Intent i = new Intent(SextoSemestre.this, Tela2.class);
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
		getMenuInflater().inflate(R.menu.sexto_semestre, menu);
		return true;
	}

}
