package com.xworkz.boot.equal;

public class ChiefMinister {

	private String name;
	private String state;
	private double salary;
	private String residence;
	private String abbreviation;
	private String appointedBy;
	private int term;
	private int requireAge;
	private String type;
	private String memberOf;
	private String reportsTo;
	private String nominator;
	private boolean indian;

	public ChiefMinister() {
		System.out.println("calling CM with no arg constructor");
	}

	public ChiefMinister(String name, String state, double salary, String residence, String abbreviation,
			String appointedBy, int term, int requireAge, String type, String memberOf, String reportsTo,
			String nominator, boolean indian) {
		this.name = name;
		this.state = state;
		this.salary = salary;
		this.residence = residence;
		this.abbreviation = abbreviation;
		this.appointedBy = appointedBy;
		this.term = term;
		this.requireAge = requireAge;
		this.type = type;
		this.memberOf = memberOf;
		this.reportsTo = reportsTo;
		this.nominator = nominator;
		this.indian = indian;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in CM:" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("obj is CM");

				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister left = this;
				ChiefMinister right = casted;
				if (left.name.equals(name) && (left.state.equals(state)) && (left.salary == right.salary)
						&& (left.residence.equals(residence)) && (left.abbreviation.equals(abbreviation))
						&& (left.appointedBy.equals(appointedBy)) && (left.term == right.term)
						&& (left.requireAge == right.requireAge) && (left.type.equals(type))
						&& (left.memberOf.equals(memberOf)) && (left.reportsTo.equals(reportsTo))
						&& left.nominator.equals(nominator) && (left.indian == right.indian)) {
					System.out.println("left is equal to right");
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not a CM");
			}
		} else {
			System.err.println("obj is null");
		}

		return true;
	}

	@Override
	public String toString() {
		System.out.println("running toString inCm");
		return "name:" + this.name + " state:" + this.state + " salary:" + this.salary + " residence:" + this.residence
				+ " abbareviation:" + this.abbreviation + " appointedBy:" + this.appointedBy + " term:" + this.term
				+ "requireAge:" + this.requireAge + "type:" + this.type + "memberOf:" + this.memberOf + "reportsTo:"
				+ this.reportsTo + " nominator:" + this.nominator + " indian:" + this.indian;
	}

}
