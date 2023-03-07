package com.xworks.Rules.boot;

import com.xworks.Rules.link.HospitalRules;
import com.xworks.Rules.link.Public;

public class HospitalRuleRunner {

	public static void main(String[] args) {

		HospitalRules rule = new Public();
		String nois = rule.noise();
		System.out.println("noise:" + nois);
		String sta = rule.stay();
		System.out.println("stay:" + sta);
		String par = rule.park();
		System.out.println("parking:" + par);
		int visit = rule.visitor();
		System.out.println("visitors:" + visit);
		int call = rule.RestrictCallat();
		System.out.println("Restrict call after:" + call);
		boolean smo = rule.smoke();
		System.out.println("smoke:" + smo);
		boolean mas = rule.mask();
		System.out.println("mask:" + mas);
		String spi = rule.spill();
		System.out.println("spill:" + spi);
		double time = rule.doctorRoundstime();
		System.out.println("DoctorRounding time:" + time);
		String bag = rule.bags();
		System.out.println("bags:" + bag);

		System.out.println(rule.equals(rule));
		System.out.println(rule.hashCode());
		System.out.println(rule.toString());

		System.out.println("--------------------------");

		Public pub = new Public();
		String nois1 = pub.noise();
		System.out.println(nois1);
		String sta1 = pub.stay();
		System.out.println(sta1);
		String par1 = pub.park();
		System.out.println(par1);
		int visit1 = pub.visitor();
		System.out.println(visit1);
		int call1 = pub.RestrictCallat();
		System.out.println(call1);
		boolean smo1 = pub.smoke();
		System.out.println(smo1);
		boolean mas1 = pub.mask();
		System.out.println(mas1);
		String spi1 = pub.spill();
		System.out.println(spi1);
		double time1 = pub.doctorRoundstime();
		System.out.println(time1);
		String bag1 = pub.bags();
		System.out.println(bag1);

		System.out.println(pub.equals(pub));
		System.out.println(pub.hashCode());
		System.out.println(pub.toString());

	}

}
