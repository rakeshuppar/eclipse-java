package com.xworks.Rules.boot;

import com.xworks.Rules.link.CodingRules;
import com.xworks.Rules.link.Programmer;

public class CodingRulesRunner {

	public static void main(String[] args) {

		CodingRules rule = new Programmer();
		String variable = rule.VariableName();
		System.out.println("variableName:" + variable);
		String method = rule.MethodName();
		System.out.println("MethodName:" + method);
		int line = rule.linesofCode();
		System.out.println("lines of Code:" + line);
		int comment = rule.commentEvery();
		System.out.println("commentEveery:" + comment);
		String identify = rule.identifiers();
		System.out.println("identifiers:" + identify);
		String name = rule.className();
		System.out.println("className:" + name);
		boolean nea = rule.neat();
		System.out.println("neat:" + nea);
		String packag = rule.packageName();
		System.out.println("package name:" + packag);
		String opera = rule.operator();
		System.out.println("opearators:" + opera);
		String sec = rule.secure();
		System.out.println("secure:" + sec);

		System.out.println(rule.equals(rule));
		System.out.println(rule.hashCode());
		System.out.println(rule.toString());

		System.out.println("----------------------------------");

		Programmer pro = new Programmer();
		String variable1 = pro.VariableName();
		System.out.println(variable1);
		String method1 = pro.MethodName();
		System.out.println(method1);
		int line1 = pro.linesofCode();
		System.out.println(line1);
		int comment1 = pro.commentEvery();
		System.out.println(comment1);
		String identify1 = pro.identifiers();
		System.out.println(identify1);
		String name1 = pro.className();
		System.out.println(name1);
		boolean nea1 = pro.neat();
		System.out.println(nea1);
		String packag1 = pro.packageName();
		System.out.println(packag1);
		String opera1 = pro.operator();
		System.out.println(opera1);
		String sec1 = pro.secure();
		System.out.println(sec1);

		System.out.println(pro.equals(pro));
		System.out.println(pro.hashCode());
		System.out.println(pro.toString());

	}

}
