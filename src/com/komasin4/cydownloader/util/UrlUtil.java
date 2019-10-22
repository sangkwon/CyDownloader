package com.komasin4.cydownloader.util;

public class UrlUtil {
	public static String getUrlFromStyle(String src)	{
		String var = ":url(";
		String value = null;

		try	{

			int idx = src.indexOf(var);

			if(idx > -1)	{
				String s1 = src.substring(idx);
				String s2 = s1.substring(s1.indexOf("'") + 1);
				value = s2.substring(0, s2.indexOf("'"));
			}
		} catch (Exception e)	{
			e.printStackTrace();
			System.out.println("error in getUrlFromStyle:" + src);
		}

		return value;
	}
}
