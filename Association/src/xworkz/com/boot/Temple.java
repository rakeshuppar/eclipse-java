package xworkz.com.boot;

public class Temple {
		
		public String god;
		public String type ;
		public int numGate;
		public God tp=new God();
		
		
		public void initialVariable(String god, String type, int numGate) {
			
			this.god=god;
			this.type=type;
			this.numGate=numGate;
		}
		
		
		public void display() {
			
			System.out.println("god:"+this.god);
			System.out.println("type:"+this.type);
			System.out.println("numGate:"+this.numGate);
			this.tp.display();
		}



}
