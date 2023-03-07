package com.xworks.Rules.link;

public class Members implements FamilyRules {

	public Members() {
		System.out.println("calling Members with no arg constructor");
	}

	@Override
	public String respect() {
		System.out.println("running respect");
		return "Respect each other";
	}

	@Override
	public String honest() {
		System.out.println("running  honest");
		return "Always tell truth to familymembers";
	}

	@Override
	public double dinnertime() {
		System.out.println("running DinnerTime");
		return 9.00d;
	}

	@Override
	public String argue() {
		System.out.println("running Argue");
		return "Dont argue with family members";
	}

	@Override
	public boolean helpEachother() {
		System.out.println("running HelpEachother");
		return true;
	}

	@Override
	public double sleepingTime() {
		System.out.println("running sleepingtime");
		return 9.30d;
	}

	@Override
	public boolean watchTvtogether() {
		System.out.println("running watchingfilm together");
		return true;
	}

	@Override
	public int drinkteaTime() {
		System.out.println("running drink tea");
		return 5;
	}

	@Override
	public String forgive() {
		System.out.println("running forgive");
		return "Make mistake and forgive each other";
	}

	@Override
	public String Work() {
		System.out.println("running Work");
		return "Sharing Work Each Other";
	}

	@Override
	public boolean seekingPermission() {
		System.out.println("running seekingPermission");
		return true;
	}

	@Override
	public String listen() {
		System.out.println("running listen");
		return "Listen each other";
	}

	@Override
	public String support() {
		System.out.println("running Support");
		return "Support each other";
	}

	@Override
	public String words() {
		System.out.println("running seekingPermission");
		return "Use kind and polite words";
	}

	@Override
	public String pray() {
		System.out.println("running seekingPermission");
		return "Pray together";
	}

	@Override
	public String toString() {
		System.out.println("running tostring in members");
		return "Respect each other" + " Always tell truth to familymembers" + 9.00d + " Dont argue with family members"
				+ true + 9.30d + true + 5 + " Make mistake and forgive each other" + " Sharing Work Each Other" + true
				+ " Listen each other" + " Support each other" + " Use kind and polite words" + " Pray together";
	}

}
