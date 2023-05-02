package com.xworkz.smart.configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.smart")
public class StudentConfiguration {

	@Bean
	public String name() {
		System.out.println("Running name method in StudentConfiguration");
		return "Rakesh";
	}

	@Bean
	public String graduation() {
		System.out.println("Running graduation method in StudentConfiguration");
		return "BE";
	}

	@Bean
	public String from() {
		System.out.println("Running from method in StudentConfiguration");
		return "Ilkal";
	}

	@Bean
	public String age() {
		System.out.println("Running age method in StudentConfiguration");
		return "Twentyfive";
	}

	@Bean
	public String gender() {
		System.out.println("Running gender method in StudentConfiguration");
		return "Male";
	}

	@Bean
	public String school() {
		System.out.println("Running school method in StudentConfiguration");
		return "vijay Mahantesh";
	}

	@Bean
	public String college() {
		System.out.println("Running college method in StudentConfiguration");
		return "Vastrad";
	}

	@Bean
	public String engineering() {
		System.out.println("Running engineering method in StudentConfiguration");
		return "BGMIT";
	}

	@Bean
	public String taluk() {
		System.out.println("Running taluk method in StudentConfiguration");
		return "Hungund";
	}

	@Bean
	public String district() {
		System.out.println("Running district method in StudentConfiguration");
		return "Bagalkot";
	}

	@Bean
	public String state() {
		System.out.println("Running state method in StudentConfiguration");
		return "Karnataka";
	}

	@Bean
	public String country() {
		System.out.println("Running country method in StudentConfiguration");
		return "India";
	}

	@Bean
	public String continent() {
		System.out.println("Running continent method in StudentConfiguration");
		return "Asia";
	}

	@Bean
	public Integer naturalNumber() {
		System.out.println("Running naturalNumber method in StudentConfiguration");
		return 12;
	}

	@Bean
	public Integer primeNumber() {
		System.out.println("Running primeNumber method in StudentConfiguration");
		return 3;
	}

	@Bean
	public Integer compositeNumber() {
		System.out.println("Running compositeNumber method in StudentConfiguration");
		return 8;
	}

	@Bean
	public Integer wholeNumber() {
		System.out.println("Running wholeNumber method in StudentConfiguration");
		return 1;
	}

	@Bean
	public Integer integers() {
		System.out.println("Running integers method in StudentConfiguration");
		return 1;
	}

	@Bean
	public Integer integers1() {
		System.out.println("Running integers1 method in StudentConfiguration");
		return 2;
	}

	@Bean
	public Integer naturalNumber2() {
		System.out.println("Running naturalNumber2 method in StudentConfiguration");
		return 3;
	}

	@Bean
	public Integer real() {
		System.out.println("Running real method in StudentConfiguration");
		return 1;
	}

	@Bean
	public Integer real1() {
		System.out.println("Running real1 method in StudentConfiguration");
		return 2;
	}

	@Bean
	public Boolean sanketHavePassport() {
		System.out.println("Running sanketHavePassport method in StudentConfiguration");
		return false;
	}

	@Bean
	public Boolean shivuHavePassport() {
		System.out.println("Running shivuHavePassport method in StudentConfiguration");
		return true;
	}

	@Bean
	public Boolean basuHavePassport() {
		System.out.println("Running basuHavePassport method in StudentConfiguration");
		return false;
	}

	@Bean
	public Boolean kavanHavePassport() {
		System.out.println("Running kavanHavePassport method in StudentConfiguration");
		return false;
	}

	@Bean
	public Boolean shrutiHavePassport() {
		System.out.println("Running shrutiHavePassport method in StudentConfiguration");
		return true;
	}

	@Bean
	public Boolean anneshHavePassport() {
		System.out.println("Running anneshHavePassport method in StudentConfiguration");
		return true;
	}

	@Bean
	public Boolean anitaHavePassport() {
		System.out.println("Running anitaHavePassport method in StudentConfiguration");
		return false;
	}

	@Bean
	public Boolean shubhangiHavePassport() {
		System.out.println("Running shubhangiHavePassport method in StudentConfiguration");
		return false;
	}

	@Bean
	public Boolean akshataHavePassport() {
		System.out.println("Running akshataHavePassport method in StudentConfiguration");
		return true;
	}

	@Bean
	public Byte afghanistanId() {
		System.out.println("Running afghanistanId method in StudentConfiguration");
		return 4;
	}

	@Bean
	public Byte albaniaId() {
		System.out.println("Running albaniaId method in StudentConfiguration");
		return 8;
	}

	@Bean
	public Byte algeriaId() {
		System.out.println("Running algeriaId method in StudentConfiguration");
		return 12;
	}

	@Bean
	public Byte angolaId() {
		System.out.println("Running angolaId method in StudentConfiguration");
		return 24;
	}

	@Bean
	public Byte argentineId() {
		System.out.println("Running argentineId method in StudentConfiguration");
		return 32;
	}

	@Bean
	public Byte australiaId() {
		System.out.println("Running australiaId method in StudentConfiguration");
		return 36;
	}

	@Bean
	public Byte bangldeshId() {
		System.out.println("Running bangldeshId method in StudentConfiguration");
		return 50;
	}

	@Bean
	public Byte belgiumId() {
		System.out.println("Running belgiumId method in StudentConfiguration");
		return 56;
	}

	@Bean
	public Byte bhutanId() {
		System.out.println("Running bhutanId method in StudentConfiguration");
		return 64;
	}

	@Bean
	public Long anneshPin() {
		System.out.println("Running anneshPin method in StudentConfiguration");
		return (long) 587126;
	}

	@Bean
	public Long sanketPin() {
		System.out.println("Running sanketPin method in StudentConfiguration");
		return (long) 587135;
	}

	@Bean
	public Long kavanPin() {
		System.out.println("Running kavanPin method in StudentConfiguration");
		return (long) 584669;
	}

	@Bean
	public Long anitaPin() {
		System.out.println("Running anitaPin method in StudentConfiguration");
		return (long) 587128;
	}

	@Bean
	public Long basavarajPin() {
		System.out.println("Running basavarajPin method in StudentConfiguration");
		return (long) 587131;
	}

	@Bean
	public Long shrutiPin() {
		System.out.println("Running shrutiPin method in StudentConfiguration");
		return (long) 587133;
	}

	@Bean
	public Long rakeshPin() {
		System.out.println("Running rakeshPin method in StudentConfiguration");
		return (long) 587150;
	}

	@Bean
	public Long shivuPin() {
		System.out.println("Running shivuPin method in StudentConfiguration");
		return (long) 587144;
	}

	@Bean
	public Long dinakarPin() {
		System.out.println("Running dinakarPin method in StudentConfiguration");
		return (long) 587105;
	}

	@Bean
	public Float anneshCgpa() {
		System.out.println("Running anneshCgpa method in StudentConfiguration");
		return (float) 7.35;
	}

	@Bean
	public Float rakeshCgpa() {
		System.out.println("Running rakeshCgpa method in StudentConfiguration");
		return (float) 8.5;
	}

	@Bean
	public Float sanketCgpa() {
		System.out.println("Running sanketCgpa method in StudentConfiguration");
		return (float) 8.35;
	}

	@Bean
	public Float antitaCgpa() {
		System.out.println("Running antitaCgpa method in StudentConfiguration");
		return (float) 7.5;
	}

	@Bean
	public Float basavarajCgpa() {
		System.out.println("Running basavarajCgpa method in StudentConfiguration");
		return (float) 5.50;
	}

	@Bean
	public Float kavanCgpa() {
		System.out.println("Running kavanCgpa method in StudentConfiguration");
		return (float) 6.35;
	}

	@Bean
	public Float shivuCgpa() {
		System.out.println("Running shivuCgpa method in StudentConfiguration");
		return (float) 9.66;
	}

	@Bean
	public Float dinakarCgpa() {
		System.out.println("Running dinakarCgpa method in StudentConfiguration");
		return (float) 8.33;
	}

	@Bean
	public Float shubangiCgpa() {
		System.out.println("Running shubangiCgpa method in StudentConfiguration");
		return (float) 6.32;
	}

	@Bean
	public Double sanketPercentage() {
		System.out.println("Running percentage method in StudentConfiguration");
		return 45.0;
	}

	@Bean
	public Double dinakarPercentage() {
		System.out.println("Running dinakarpercentage method in StudentConfiguration");
		return 55.50;
	}

	@Bean
	public Double basavarsjPercentage() {
		System.out.println("Running basavarsjPercentage method in StudentConfiguration");
		return 78.0;
	}

	@Bean
	public Double kavanPercentage() {
		System.out.println("Running kavanPercentage method in StudentConfiguration");
		return 87.50;
	}

	@Bean
	public Double rakeshPercentage() {
		System.out.println("Running rakeshPercentage method in StudentConfiguration");
		return 92.8;
	}

	@Bean
	public Double anitPpercentage() {
		System.out.println("Running anitPpercentage method in StudentConfiguration");
		return 95.0;
	}

	@Bean
	public Double shrutiPercentage() {
		System.out.println("Running shrutiPercentage method in StudentConfiguration");
		return 72.5;
	}

	@Bean
	public Double anneshPercentage() {
		System.out.println("Running anneshPercentage method in StudentConfiguration");
		return 65.7;
	}

	@Bean
	public Double shivuPercentage() {
		System.out.println("Running shivuPercentage method in StudentConfiguration");
		return 80.0;
	}

	@Bean
	public Character anneshGrade() {
		System.out.println("Running anneshGrade method in StudentConfiguration");
		return 'A';
	}

	@Bean
	public Character rakeshGrade() {
		System.out.println("Running rakeshGrade method in StudentConfiguration");
		return 'B';
	}

	@Bean
	public Character basavarajGrade() {
		System.out.println("Running basavarajGrade method in StudentConfiguration");
		return 'C';
	}

	@Bean
	public Character kavanGrade() {
		System.out.println("Running kavanGrade method in StudentConfiguration");
		return 'A';
	}

	@Bean
	public Character shivuGrade() {
		System.out.println("Running shivuGrade method in StudentConfiguration");
		return 'C';
	}

	@Bean
	public Character dinakarGrade() {
		System.out.println("Running dinakarGrade method in StudentConfiguration");
		return 'A';
	}

	@Bean
	public Character sanketGrade() {
		System.out.println("Running sanketGrade method in StudentConfiguration");
		return 'B';
	}

	@Bean
	public Character shrutiGrade() {
		System.out.println("Running shrutiGrade method in StudentConfiguration");
		return 'A';
	}

	@Bean
	public Character shubhangiGrade() {
		System.out.println("Running shubhangiGrade method in StudentConfiguration");
		return 'C';
	}

	@Bean
	public Short anneshYear() {
		System.out.println("Running anneshYear method in StudentConfiguration");
		return 2000;
	}

	@Bean
	public Short dinakarYear() {
		System.out.println("Running dinakarYear method in StudentConfiguration");
		return 2002;
	}

	@Bean
	public Short shivuYear() {
		System.out.println("Running shivuYear method in StudentConfiguration");
		return 2000;
	}

	@Bean
	public Short kavanYear() {
		System.out.println("Running kavanYear method in StudentConfiguration");
		return 1996;
	}

	@Bean
	public Short basavarajYear() {
		System.out.println("Running basavarajYear method in StudentConfiguration");
		return 1998;
	}

	@Bean
	public Short rakeshYear() {
		System.out.println("Running rakeshYear method in StudentConfiguration");
		return 1998;
	}

	@Bean
	public Short sanketYear() {
		System.out.println("Running sanketYear method in StudentConfiguration");
		return 1999;
	}

	@Bean
	public Short shrutiYear() {
		System.out.println("Running shrutiYear method in StudentConfiguration");
		return 1998;
	}

	@Bean
	public Short shubhangiYear() {
		System.out.println("Running shubhangiYear method in StudentConfiguration");
		return 1999;
	}

	@Bean
	public List<String> adress() {
		List<String> adress = new ArrayList<String>();
		adress.add("ilkal");
		adress.add("bagalkot");
		adress.add("Mudhol");
		adress.add("Banglore");
		adress.add("Rajajinagar");
		return adress;
	}

	@Bean
	public List<String> email() {
		List<String> email = new LinkedList<>();
		email.add("rakesh@gmail.com");
		email.add("basavaraj@gmail.com");
		email.add("annesh@gmail.com");
		email.add("sanket@gmail.com");
		email.add("kavan@gamil.com");
		return email;

	}

	@Bean
	public Set<String> wineTypes() {
		Set<String> wine = new HashSet<>();
		wine.add("Red Wine");
		wine.add("White Wine");
		wine.add("Port Wine");
		wine.add("Rose Wine");
		wine.add("Desert Wine ");
		return wine;

	}

	@Bean
	public Set<String> laptops() {
		Set<String> laps = new LinkedHashSet<>();
		laps.add("HP");
		laps.add("Lenovo");
		laps.add("Dell");
		laps.add("Acer");
		laps.add("Apple");
		return laps;
	}

	@Bean
	public Set<String> course() {
		Set<String> itCourser = new TreeSet<>();
		itCourser.add("Java");
		itCourser.add("Python");
		itCourser.add("Data Analytics");
		itCourser.add("Cyber Security");
		itCourser.add("Testing");
		return itCourser;
	}

}