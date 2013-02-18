package com.makksi.androtest01;

import com.makksi.androtest.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.View.OnKeyListener;
import android.widget.TextView;
import android.util.Log;

public class TestActivity2 extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.layout01);
        View eventArea = (View) findViewById(R.id.eventArea);
        eventArea.setOnTouchListener(new OnTouchListener(){
        	public boolean onTouch(View view, MotionEvent event){
        		String action;
        		switch (event.getAction()){
        		case MotionEvent.ACTION_DOWN:
	    		action="DOWN";
	    		break;
        		case MotionEvent.ACTION_MOVE:
	    		action="MOVE";
	    		break;
        		case MotionEvent.ACTION_UP:
	    		action="UP";
	    		break;
        		default:
	    		action="OTHER";
	    		break;
        		}
        		float x = event.getX();
        		float y = event.getY();
        		log("tocco: " + action + " su (" + x + "," + y + ")");
        		return true;
        	}
        });
        eventArea.setOnKeyListener(new OnKeyListener() {
        	public boolean onKey(View view, int keyCode, KeyEvent event){
        		char c = event.getDisplayLabel();
        		String action;
        		switch (event.getAction()){
        		case KeyEvent.ACTION_DOWN:
        			action = "DOWN";
        			break;
        		case KeyEvent.ACTION_UP:
        			action = "UP";
        			break;
        		default:
        			action = "OTHER";
        			break;        			
        		}
         		log("Tasto: codice" + keyCode + " (" + c + "),azione " + action);
         		return true;
        	}
        });
	}        
	private void log(String text){
		Log.i("EVENT", text);
		TextView logArea = (TextView) findViewById(R.id.logArea);
		logArea.setText(text);
	}
}
	