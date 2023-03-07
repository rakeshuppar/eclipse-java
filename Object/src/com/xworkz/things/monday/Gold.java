package com.xworkz.things.monday;

public class Gold {

	private String type;
	private int cost;
	private boolean costly;
	private int carat;

	public Gold() {
		System.out.println("calling gold with no arg constructor");
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setCostly(boolean costly) {
		this.costly = costly;
	}

	public void setCarat(int carat) {
		this.carat = carat;
	}

	@Override
	public int hashCode() {
		return 486554;
	}

	@Override
	public String toString() {
		System.out.println("Running toString in Gold");
		return "type:" + this.type + "  cost:" + this.cost + " costly:" + this.costly + " carat:" + this.carat;
	}

}
