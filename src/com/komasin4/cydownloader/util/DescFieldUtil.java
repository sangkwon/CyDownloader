package com.komasin4.cydownloader.util;

import javafx.application.Platform;
import javafx.scene.control.TextArea;

public class DescFieldUtil {
	
	private static boolean systemout = true;
	
	public static void AppendString(TextArea descField, String appendText)	{
		
		AppendString(descField, appendText, true);
		
	}

	public static void AppendString(TextArea descField, String appendText, boolean rtn)	{
		
		Platform.runLater(new Runnable() 
        {
            @Override
            public void run() 
            {
    			descField.appendText(appendText + (rtn?"\n":""));
    			if(systemout)
    				System.out.print(appendText + (rtn?"\n":""));
            }
        });
	}
}
