package xworkz.com.boot;

public class God {


		public String name;
		public boolean powerful;
		public String anotherName;

		public void initialVariable(String name, boolean powerful, String anotherName) {

			this.name = name;
			this.powerful = powerful;
			this.anotherName = anotherName;

		}

		public void display() {

			System.out.println("name:" + this.name);
			System.out.println("powerful:" + this.powerful);
			System.out.println("anotherName:" + this.anotherName);
		}

	}

