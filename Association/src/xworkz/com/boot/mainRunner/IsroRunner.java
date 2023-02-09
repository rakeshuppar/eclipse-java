package xworkz.com.boot.mainRunner;

import xworkz.com.boot.main.Isro;

import xworkz.com.boot.main.Scientist;

public class IsroRunner {

	public static void main(String[] args) {

		Isro isro = new Isro();
		String[] loc= { "Bangalore", "Mysore", "Hasan" };
		isro.setLocation(loc);

		int[] num= { 12, 16, 15, 22 };
		isro.setSatelliteNo(num);
		isro.display();

		Scientist scientist1=new Scientist();
		Scientist scientist2=new Scientist();
		
		
		scientist1.setName("AbdulKalam");
		scientist1.setDesignation("Director");
		
		scientist2.setName("SatishDhawan");
		scientist2.setDesignation("Chief");
		
		Scientist[] scientists= {scientist1,scientist2};
				isro.setScientist(scientists);
		        isro.display();
}
}