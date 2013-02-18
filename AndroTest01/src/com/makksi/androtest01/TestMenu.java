package com.makksi.androtest01;

import android.app.Activity;
import android.view.Menu;

public class TestMenu extends Activity{
	@Override
	public boolean onCreateOptionsMenu (Menu menu) {
		menu.add(Menu.NONE, 1, 1, "Command 01");
		menu.add(Menu.NONE, 2, 2, "Command 02");
		menu.add(Menu.NONE, 3, 3, "Command 03");
		menu.add(Menu.NONE, 4, 4, "Command 04");
		menu.add(Menu.NONE, 5, 5, "Command 05");
		menu.add(Menu.NONE, 6, 6, "Command 06");
		menu.add(Menu.NONE, 7, 7, "Command 07");
		menu.add(Menu.NONE, 8, 8, "Command 08");
		menu.add(Menu.NONE, 9, 9, "Command 09");
		menu.add(Menu.NONE, 10, 10, "Command 10");
		menu.add(Menu.NONE, 11, 11, "Command 11");
		menu.add(Menu.NONE, 12, 12, "Command 12");		
		return true;
	}
}	
	