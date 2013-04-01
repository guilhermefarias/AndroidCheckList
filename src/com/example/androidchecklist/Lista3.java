package com.example.androidchecklist;
 
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
 
public class Lista3 extends Activity implements OnCheckedChangeListener {
	CheckBox checkBox1;
	CheckBox checkBox2;
	CheckBox checkBox3;
	CheckBox checkBox4;
	CheckBox checkBox5;
	CheckBox checkBox6;
	CheckBox checkBox7;
	CheckBox checkBox8;
	CheckBox checkBox9;
	CheckBox checkBox10;
	CheckBox checkBox11;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lista3_layout);

		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
		checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
		checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
		checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
		checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
		checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
		checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
		checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
		checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
		checkBox1.setOnCheckedChangeListener(this);
		checkBox2.setOnCheckedChangeListener(this);
		checkBox3.setOnCheckedChangeListener(this);
		checkBox4.setOnCheckedChangeListener(this);
		checkBox5.setOnCheckedChangeListener(this);
		checkBox6.setOnCheckedChangeListener(this);
		checkBox7.setOnCheckedChangeListener(this);
		checkBox8.setOnCheckedChangeListener(this);
		checkBox9.setOnCheckedChangeListener(this);
		checkBox10.setOnCheckedChangeListener(this);
		checkBox11.setOnCheckedChangeListener(this);
	}
	
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (checkBox1.isChecked() && checkBox2.isChecked()
			&& checkBox3.isChecked() && checkBox4.isChecked()
			&& checkBox5.isChecked() && checkBox6.isChecked()
			&& checkBox7.isChecked() && checkBox8.isChecked()
			&& checkBox9.isChecked() && checkBox10.isChecked()
			&& checkBox11.isChecked()) {
				AlertDialog.Builder dialog = new AlertDialog.Builder(Lista3.this);
				dialog.setMessage("Todos os itens dessa lista estao ok!");
				dialog.setPositiveButton("OK", null);
				dialog.show();
		}
	}

	public void unCheckAll(){
		checkBox1.setChecked(false);
		checkBox2.setChecked(false);
		checkBox3.setChecked(false);
		checkBox4.setChecked(false);
		checkBox5.setChecked(false);
		checkBox6.setChecked(false);
		checkBox7.setChecked(false);
		checkBox8.setChecked(false);
		checkBox9.setChecked(false);
		checkBox10.setChecked(false);
		checkBox11.setChecked(false);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		unCheckAll();
		Toast t = Toast.makeText(getApplicationContext(),"Desmarcados com sucesso!",Toast.LENGTH_SHORT);
		t.show();
		return true;
	}
}