package com.example.workflow;

import java.util.regex.*;

public class RegularExpressionDemo2 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher("a1b7 @zA#");
		while (m.find()) {
			System.out.println(m.start() + "-------" + m.group());
		}
	}
}
