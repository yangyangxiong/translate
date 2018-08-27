package com.translate.utils;

public class Enchutils {
	public static char toLower(char ch) {
		if (ch <= 'Z' && ch >= 'A') {
			return (char) (ch - 'A' + 'a');
		}
		return ch;
	}

	public static char toUpper(char ch) {
		if (ch <= 'z' && ch >= 'a') {
			return (char) (ch - 32);
		}
		return ch;
	}

	public static String lowerto(String word) {
		StringBuffer buf = new StringBuffer(word.length());
		for (int i = 0; i < word.length(); i++) {

			buf.append(toLower(word.charAt(i)));
		}

		return buf.toString();
	}

	public static String upperto(String word) {
		StringBuffer buf = new StringBuffer(word.length());
		for (int i = 0; i < word.length(); i++) {
			buf.append(toUpper(word.charAt(i)));
		}
		return buf.toString();
	}

}
