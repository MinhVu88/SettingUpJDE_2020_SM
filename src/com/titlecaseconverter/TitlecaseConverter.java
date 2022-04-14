package com.titlecaseconverter;

public class TitlecaseConverter {
	public static String convert(String input) {
		StringBuilder strBuilder = new StringBuilder();

		for (String word : input.split("\\s")) {
			if(word.length() < 4) {
				strBuilder.append(word.toLowerCase());
			}else {
				strBuilder.append(word.substring(0, 1).toUpperCase());

				strBuilder.append(word.substring(1).toLowerCase());
			}

			strBuilder.append(" ");
		}

		return strBuilder.toString();
	}
}
