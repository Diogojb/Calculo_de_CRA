package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OitavoSemestre extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_oitavo_semestre);

		Button anterior = (Button) findViewById(R.id.button1);
		anterior.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// guardaValores8S();
				Intent i = new Intent(OitavoSemestre.this, SetimoSemestre.class);
				Bundle params = new Bundle();
				i.putExtras(params);
				startActivity(i);
			}
		});
		Button calcula = (Button) findViewById(R.id.button3);
		calcula.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				EditText texto1 = (EditText) findViewById(R.id.notaGPI);
				EditText texto2 = (EditText) findViewById(R.id.notaPG2);
				EditText texto3 = (EditText) findViewById(R.id.notaOP6);
				EditText texto4 = (EditText) findViewById(R.id.notaOP7);
				EditText texto5 = (EditText) findViewById(R.id.notaOP8);
				EditText texto6 = (EditText) findViewById(R.id.valorOP6);
				EditText texto7 = (EditText) findViewById(R.id.valorOP7);
				EditText texto8 = (EditText) findViewById(R.id.valorOP8);
				double notaGPI = Double
						.parseDouble(texto1.getText().toString());
				double notaPG2 = Double
						.parseDouble(texto2.getText().toString());
				double notaOP6 = Double
						.parseDouble(texto3.getText().toString());
				double notaOP7 = Double
						.parseDouble(texto4.getText().toString());
				double notaOP8 = Double
						.parseDouble(texto5.getText().toString());
				int valorOP6 = Integer.parseInt(texto6.getText().toString());
				int valorOP7 = Integer.parseInt(texto7.getText().toString());
				int valorOP8 = Integer.parseInt(texto8.getText().toString());

				int cargaCumprida = (4 + 3 + valorOP6 + valorOP7 + valorOP8);
				double crSemestre = (notaGPI * 4 + notaPG2 * 3 + notaOP6
						* valorOP6 + notaOP7 * valorOP7 + valorOP8 * notaOP8)
						/ cargaCumprida;

				Intent i = new Intent(OitavoSemestre.this, Tela2.class);
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
		getMenuInflater().inflate(R.menu.oitavo_semestre, menu);
		return true;
	}

}
