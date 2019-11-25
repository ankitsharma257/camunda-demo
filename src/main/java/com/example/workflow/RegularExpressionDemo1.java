package com.example.workflow;

import java.util.regex.*;

public class RegularExpressionDemo1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("a1b7@z#A");
		while (m.find()) {
			System.out.println(m.start() + "-------" + m.group());
		}
	}
}
