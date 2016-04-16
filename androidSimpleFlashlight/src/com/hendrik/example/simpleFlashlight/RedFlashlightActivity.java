package com.hendrik.example.simpleFlashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RedFlashlightActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button greenButton = (Button)findViewById(R.id.green_button);
       
        greenButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(v.getContext(), "Color changing...", 
						Toast.LENGTH_LONG).show();
				Intent intent = new Intent(
					RedFlashlightActivity.this,
					GreenFlashlightActivity.class
				);
				startActivity(intent);
			}
		});
    }
}