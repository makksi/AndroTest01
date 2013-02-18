package com.makksi.androtest01;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("Lancia SubActivity");
        button.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v) {
//        		startSubActivity();
            startTestActivity2();  
        	}
		});
        setContentView(button);
	}
	private void startSubActivity(){
		Intent intent = new Intent(this, SubActivity.class);
		startActivity(intent);
	}
	private void startTestActivity(){
		Intent intent = new Intent(this, TestActivity.class);
		startActivity(intent);
	}
	private void startTestActivity2(){
		Intent intent = new Intent(this, TestActivity2.class);
		startActivity(intent);
	}	
}



