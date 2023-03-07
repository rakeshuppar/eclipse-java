package inheritance.com.xworkz.castingRunner;

import inheritance.com.xworkz.Casting.newCasting.ButterRoti;
import inheritance.com.xworkz.Casting.newCasting.JowarRoti;
import inheritance.com.xworkz.Casting.newCasting.Kulcha;
import inheritance.com.xworkz.Casting.newCasting.Naan;
import inheritance.com.xworkz.Casting.newCasting.OnionMasalaRagiRoti;
import inheritance.com.xworkz.Casting.newCasting.OnionRagiRoti;
import inheritance.com.xworkz.Casting.newCasting.RagiRoti;
import inheritance.com.xworkz.Casting.newCasting.Roti;

public class RotiRunner {

	public static void main(String[] args) {

		Roti roti = new Roti();
		roti.getShape();

		Roti roti1 = new RagiRoti();
		RagiRoti roti11 = new RagiRoti();

		roti11.getShape();

		double calories = roti11.getCalories();

		if (roti1 instanceof RagiRoti) {
			RagiRoti cast = (RagiRoti) roti1;
			cast.getCalories();
			System.out.println("calories:" + calories);
		} else {
			System.err.println("roti1 is exception");

			Roti roti2 = new OnionRagiRoti();
			RagiRoti roti22 = new OnionRagiRoti();
			OnionRagiRoti roti222 = new OnionRagiRoti();

			roti222.getShape();
			roti222.getWeight();

			double weight = roti222.getWeight();
			roti222.getShape();

			if (roti2 instanceof OnionRagiRoti) {
				OnionRagiRoti cast1 = (OnionRagiRoti) roti2;
				cast1.getWeight();
				System.out.println("weight:" + weight);
			} else {
				System.err.println("roti2 is exception");
			}

			if (roti22 instanceof OnionRagiRoti) {
				OnionRagiRoti cast2 = (OnionRagiRoti) roti22;
				cast2.getWeight();
				System.out.println("weight:" + weight);

			} else {
				System.err.println("roti2 is exception");
			}

			Roti roti3 = new OnionMasalaRagiRoti();
			RagiRoti roti33 = new OnionMasalaRagiRoti();
			OnionRagiRoti roti333 = new OnionMasalaRagiRoti();
			OnionMasalaRagiRoti roti3333 = new OnionMasalaRagiRoti();

			roti3333.getWeight();
			roti3333.getShape();
			roti3333.getCalories();
			roti3333.getThickness();

			double thickness = roti3333.getThickness();

			roti3333.getThickness();

			if (roti3 instanceof OnionMasalaRagiRoti) {
				OnionMasalaRagiRoti cast3 = (OnionMasalaRagiRoti) roti3;
				cast3.getThickness();
				System.out.println("Thickness:" + thickness);
			} else {
				System.err.println("roti3 is exception");
			}

			if (roti33 instanceof OnionMasalaRagiRoti) {
				OnionMasalaRagiRoti cast4 = (OnionMasalaRagiRoti) roti33;
				cast4.getThickness();
				System.out.println("Thickness:" + thickness);
			} else {
				System.err.println("roti3 is exception");
			}

			if (roti333 instanceof OnionMasalaRagiRoti) {
				OnionMasalaRagiRoti cast5 = (OnionMasalaRagiRoti) roti333;
				cast5.getThickness();
				System.out.println("Thickness:" + thickness);
			} else {
				System.err.println("roti3 is exception");
			}

			Roti roti4 = new ButterRoti();
			ButterRoti roti44 = new ButterRoti();

			roti44.getLength();
			roti44.getShape();

			String length = roti44.getLength();

			if (roti4 instanceof ButterRoti) {
				ButterRoti cast6 = (ButterRoti) roti44;
				cast6.getLength();
				System.out.println("length:" + length);
			} else {
				System.err.println("roti4 is exception");
			}

			Roti roti5 = new JowarRoti();
			ButterRoti roti55 = new JowarRoti();
			JowarRoti roti555 = new JowarRoti();

			roti555.getLength();
			roti555.getShape();
			roti555.getPrice();

			double price = roti555.getPrice();

			if (roti5 instanceof JowarRoti) {
				JowarRoti cast7 = (JowarRoti) roti5;
				cast7.getPrice();
				System.out.println("price:" + price);
			} else {
				System.err.println("roti5 is exception");
			}

			if (roti55 instanceof JowarRoti) {
				JowarRoti cast8 = (JowarRoti) roti55;
				cast8.getPrice();
				System.out.println("price:" + price);
			} else {
				System.err.println("roti5 is exception");
			}

			Roti roti6 = new Naan();
			ButterRoti roti66 = new Naan();
			Naan roti666 = new Naan();

			roti666.getShape();
			roti666.getLength();
			roti666.getPrice();

			double price1 = roti666.getPrice();

			if (roti6 instanceof Naan) {
				Naan cast9 = (Naan) roti6;
				cast9.getPrice();
				System.out.println("price1:" + price1);
			} else {
				System.err.println("roti6 is exception");
			}

			if (roti66 instanceof Naan) {
				Naan cast9 = (Naan) roti66;
				cast9.getPrice();
				System.out.println("price1:" + price1);
			} else {
				System.out.println("roti6 is exception");
			}

			Roti roti7 = new Kulcha();
			ButterRoti roti77 = new Kulcha();
			Naan roti777 = new Kulcha();
			Kulcha roti7777 = new Kulcha();

			roti7777.getShape();
			roti7777.getLength();
			roti7777.getPrice();
			roti7777.getType();

			String type = roti7777.getType();

			if (roti7 instanceof Kulcha) {
				Kulcha cast10 = (Kulcha) roti7;
				cast10.getType();
				System.out.println("Type:" + type);
			} else {
				System.err.println("roti7 is exception");
			}

			if (roti77 instanceof Kulcha) {
				Kulcha cast11 = (Kulcha) roti77;
				cast11.getType();
				System.out.println("Type:" + type);
			} else {
				System.err.println("roti7 is exception");
			}

			if (roti777 instanceof Kulcha) {
				Kulcha cast12 = (Kulcha) roti777;
				cast12.getType();
				System.out.println("Type:" + type);
			} else {
				System.err.println("roti7 is exception");
			}

		}

	}
}
