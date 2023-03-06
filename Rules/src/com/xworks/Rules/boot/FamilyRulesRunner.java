package com.xworks.Rules.boot;

import com.xworks.Rules.link.FamilyRules;
import com.xworks.Rules.link.Members;

public class FamilyRulesRunner {

	public static void main(String[] args) {
		
		FamilyRules rule=new Members();
		String resp=rule.respect();
		System.out.println("respect:"+resp);
		String hon= rule.honest();
		System.out.println("honest:"+hon);
		double dinner=rule.dinnertime();
		System.out.println("dinnertime:"+dinner);
		String arg=rule.argue();
		System.out.println("argument:"+arg);
		String list=rule.listen();
		System.out.println("listen:"+list);
		boolean help=rule.helpEachother();
		System.out.println(help);
		double sleep=rule.sleepingTime();
		System.out.println("sleepingTime:"+sleep);
		boolean watch=rule.watchTvtogether();
		System.out.println("watching TV:"+watch);
		int drink=rule.drinkteaTime();
		System.out.println("Drink tea time:"+drink);
		String give=rule.forgive();
		System.out.println("forgive:"+give);
		String supp=rule.support();
		System.out.println("support:"+supp);
		String word=rule.words();
		System.out.println("words:"+word);
		String pra=rule.pray();
		System.out.println("pray:"+pra);
		String wor=rule.Work();
		System.out.println("Work:"+wor);
		boolean seek=rule.seekingPermission();
		System.out.println("seekingPermission:"+seek);
		
		
		System.out.println("---------------------------------");
		
		
		Members members=new Members();
		String resp1=members.respect();
		System.out.println(resp1);
		String hon1= members.honest();
		System.out.println(hon1);
		double dinner1=members.dinnertime();
		System.out.println(dinner1);
		String arg1=members.argue();
		System.out.println(arg1);
		String list1=members.listen();
		System.out.println(list1);
		boolean help1=members.helpEachother();
		System.out.println(help1);
		double sleep1=members.sleepingTime();
		System.out.println(sleep1);
		boolean watch1=members.watchTvtogether();
		System.out.println(watch1);
		int drink1=members.drinkteaTime();
		System.out.println(drink1);
		String give1=members.forgive();
		System.out.println(give1);
		String supp1=members.support();
		System.out.println(supp1);
		String word1=members.words();
		System.out.println(word1);
		String pra1=members.pray();
		System.out.println(pra1);
		String wor1=members.Work();
		System.out.println(wor1);
		boolean seek1=members.seekingPermission();
		System.out.println(seek1);
		
		System.out.println(rule.equals(members));
		System.out.println(rule.hashCode());
		

	}

}
