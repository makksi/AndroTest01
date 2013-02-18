package com.makksi.androtest01;

import com.makksi.androtest.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TestActivity extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button01 = (Button) findViewById(R.id.button_save);
        Button button02 = (Button) findViewById(R.id.button_cancel);     
        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
	}    
    public void onClick(View v){
    	String message;
    	if (v.getId() == R.id.button_cancel){
    		message = "You clicked CANCEL!";
    	}
    	else if (v.getId() == R.id.button_save){
    		message = "You clicked SAVE!";
    	}
    	else{
    		message = "Unknown widget!";
    	}    	
    Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
    toast.show();
    }
}
