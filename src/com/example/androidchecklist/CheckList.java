package com.example.androidchecklist;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
public class CheckList extends TabActivity {
	Lista1 list1;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TabHost tabHost = getTabHost();

		// Tab de geral
		TabSpec geralspec = tabHost.newTabSpec("Geral");
		geralspec.setIndicator("Geral");
		Intent geralIntent = new Intent(this, Lista1.class);
		geralspec.setContent(geralIntent);
 
		// Tab de roupas
		TabSpec roupaspec = tabHost.newTabSpec("Roupas");
		roupaspec.setIndicator("Roupas");
		Intent roupasIntent = new Intent(this, Lista2.class);
		roupaspec.setContent(roupasIntent);

		// Tab de equipamentos
		TabSpec equipamentospec = tabHost.newTabSpec("Equipamentos");
		equipamentospec.setIndicator("Equipamentos");
		Intent equipamentosIntent = new Intent(this, Lista3.class);
		equipamentospec.setContent(equipamentosIntent);

		// Adicionando as tabs no TabHost
		tabHost.addTab(geralspec);
		tabHost.addTab(roupaspec);
		tabHost.addTab(equipamentospec);
	}
}