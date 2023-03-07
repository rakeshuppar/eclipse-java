package com.xworks.Rules.link;

public class Programmer implements CodingRules {

	public Programmer() {
		System.out.println("calling programmer with no arg constructor");
	}

	@Override
	public String VariableName() {
		System.out.println("running VariableName");
		return "Should be Upper case letters";
	}

	@Override
	public int linesofCode() {
		System.out.println("running linesofcode");
		return 100;
	}

	@Override
	public int commentEvery() {
		System.out.println("running comment Every");
		return 5;
	}

	@Override
	public String identifiers() {
		System.out.println("running identifiers");
		return "descriptive names";
	}

	@Override
	public String className() {
		System.out.println("running className");
		return "Should be Uppercase letter";
	}

	@Override
	public boolean neat() {
		System.out.println("running neat");
		return true;
	}

	@Override
	public String packageName() {
		System.out.println("running packageName");
		return "Should be lowercase letter";
	}

	@Override
	public String MethodName() {
		System.out.println("running MethodName");
		return "Should be lowercase letter";
	}

	@Override
	public String operator() {
		System.out.println("running Operator");
		return "should surrounded by space character";

	}

	@Override
	public String secure() {
		System.out.println("running secure");
		return "It cant be hacked";
	}

	@Override
	public String toString() {
		System.out.println("running to string in programmer");
		return "Should be Upper case letters" + 100 + 5 + "descriptive names" + "Should be Uppercase letter" + true
				+ "Should be lowercase letter" + "Should be lowercase letter" + "should surrounded by space character"
				+ "It cant be hacked";
	}

}