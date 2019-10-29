package com.komasin4.cydownloader.util;

public class StringUtil {
	public static String getVariable(String src, String var)	{
		String value = null;

		try	{

			int idx = src.indexOf(var);

			if(idx > -1)	{
				String s1 = src.substring(idx);
				String s2 = s1.substring(s1.indexOf("\"") + 1);
				value = s2.substring(0, s2.indexOf("\""));
			}
		} catch (Exception e)	{
			e.printStackTrace();
			System.out.println("error in getVariable:" + src + ":" + var);
		}

		return value;
	}

	public static String convertFilename(String orgnStr) {
	    String restrictChars = "|\\\\?*<\":>/";
	    String regExpr = "[" + restrictChars + "]+";

	    // 파일명으로 사용 불가능한 특수문자 제거
	    String tmpStr = orgnStr.replaceAll(regExpr, "");

	    // 공백문자 "_"로 치환
	    return tmpStr.replaceAll("[ ]", "_");
	}
}
