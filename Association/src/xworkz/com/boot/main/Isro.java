package xworkz.com.boot.main;

public class Isro {

	public String[] locations;
	public int[] satelliteNo;
	public Scientist[] scientists;

	public void setLocation(String[] locations) {
		this.locations = locations;

	}

	public void setSatelliteNo(int[] satelliteNo) {
		this.satelliteNo = satelliteNo;

	}

	public void setScientist(Scientist[] scientists) {
		this.scientists = scientists;
	}

	public void display() {

		if (this.locations != null) {
			for (int seq = 0; seq < locations.length; seq++) {
				String element = this.locations[seq];
				System.out.println(element + "  at index " + seq);

			}
		} else
			System.err.println("this.location is null");

		if (this.satelliteNo != null) {
			for (int seq = 0; seq < this.satelliteNo.length; seq++) {
				int element = this.satelliteNo[seq];
				System.out.println(element + "  at index " + seq  );
			}
		} else
			System.err.println("this.satelliteNo is null");

		if (this.scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientist scientist = this.scientists[seq];
				System.out.println(seq);
				scientist.display();
			}
		} else {
			System.err.println();
		}

	}

}
