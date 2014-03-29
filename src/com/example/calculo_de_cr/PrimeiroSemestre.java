package com.example.calculo_de_cr;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrimeiroSemestre extends Activity {
	
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
				// guardaValores1S();
				Intent i = new Intent(PrimeiroSemestre.this,
						SegundoSemestre.class);
				Bundle params = new Bundle();
				i.putExtras(params);
				startActivity(i);
			}
		});

		Button calcula = (Button) findViewById(R.id.button3);
		calcula.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				EditText notaFsi = (EditText) findViewById(R.id.notaFSI);
				EditText notaTp1 = (EditText) findViewById(R.id.notaTP1);
				EditText notaDpw = (EditText) findViewById(R.id.notaDPW);
				EditText notaOc = (EditText) findViewById(R.id.notaOC);
				EditText notaMb = (EditText) findViewById(R.id.notaMB);
				EditText notaTpd = (EditText) findViewById(R.id.notaTPD);

				double fsi = Double.parseDouble(notaFsi.getText().toString());
				double tp1 = Double.parseDouble(notaTp1.getText().toString());
				double dpw = Double.parseDouble(notaDpw.getText().toString());
				double oc = Double.parseDouble(notaOc.getText().toString());
				double mb = Double.parseDouble(notaMb.getText().toString());
				double tpd = Double.parseDouble(notaTpd.getText().toString());

				int cargaCumprida = (4 + 6 + 4 + 6 + 2 + 3);

				double crSemestre = (fsi * 4 + tp1 * 6 + dpw * 4 + oc * 6 + mb
						* 2 + tpd * 3)
						/ cargaCumprida;

				Intent i = new Intent(PrimeiroSemestre.this, Tela2.class);
				Bundle params = new Bundle();
				String resposta ="CRA: " +crSemestre + "Carga Cumprida: " +cargaCumprida;
				params.putString("mensagem", resposta);
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
