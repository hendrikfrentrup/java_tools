package com.hendrik.example.simpleFlashlight;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GreenFlashlightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.green);
		Button redButton = (Button)findViewById(R.id.red_button);
		redButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
			finish();	
			}
		});
	}

}
