package com.demini.fastjourney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FrontPage extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.front_page);

	}

	public void ShowCustomToast(View v) {
		LayoutInflater inflater = getLayoutInflater();
		View appearance = inflater.inflate(R.layout.custom_layout,
				(ViewGroup)findViewById(R.id.root_layout));
		Toast toast=new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.setView(appearance);
		toast.show();
		Intent i=new Intent(FrontPage.this,SecondPage.class);
		startActivity(i);
	}

}
