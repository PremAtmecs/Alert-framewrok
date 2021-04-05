package com.userinterface;

import com.utilities.Alert1;
import com.utilities.Xlsheetmethods;

public class ExecutableScript {
	public static void main(String[] args) {
		Xlsheetmethods xlsheet=new Xlsheetmethods();
		Alert1 a=new Alert1();
		xlsheet.GetXlSheet();
	a.webInspection();
	}

}
