package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.AddressDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.AddressRepoImp;
import com.xworkz.application.repository.AddressRepository;
import com.xworkz.application.service.AddressService;
import com.xworkz.application.service.AddressServiceImp;

public class AddressDTORunner {
	public static void main(String[] args) {

		AddressDTO dto = new AddressDTO("Badami", "Chikkadaapur", 587126, 3, 55556, "Ilkala", "Karnatakaa");
		AddressRepository repo = new AddressRepoImp();
		AddressService service = new AddressServiceImp(repo);

		AddressDTO dto1 = new AddressDTO("Karadi", "Chikk", 587125, 2, 55555, "Ilkalaa", "Karnataka");

		AddressDTO dto2 = new AddressDTO("Turamari", "adaapur", 587128, 4, 55558, "Ilkalaaa", "Karnatakaaa");

		AddressDTO dto3 = new AddressDTO("Nandawadagi", "adaapura", 587127, 5, 55556, "Ilkalaaaa", "Karnatakaaaa");

		AddressDTO dto4 = new AddressDTO("Lekkihal", "adaapuraa", 587129, 6, 55557, "Ilkalaaaaa", "Karnatakaaaaa");

		try {
			boolean saved = service.validthensave(dto);
			System.out.println("service is:" + saved);
			System.out.println("==================================");
			boolean saved1 = service.validthensave(dto1);
			System.out.println("service is:" + saved1);
			System.out.println("==================================");
			boolean saved2 = service.validthensave(dto2);
			System.out.println("service is:" + saved2);
			System.out.println("==================================");
			boolean saved3 = service.validthensave(dto3);
			System.out.println("service is:" + saved3);
			System.out.println("==================================");
			boolean saved4 = service.validthensave(dto4);
			System.out.println("service is:" + saved4);
			System.out.println("==================================");
			boolean fin = service.find(dto1);
			System.out.println("dto is find:" + fin);

		} catch (InvalidFestivalException e) {
			System.out.println("InvalidFestivalExceptivalidfestival:" + e.getMessage());
		}

		String city = service.findCityByNumberAndFloorAndStreetAndPincode(55555, 2, "Karadi", 587125);
		System.out.println("city by number floor street and pincode:" + city);

		System.out.println("----------------------------------------");

		AddressDTO add = service.findByCityAndState("Ilkalaa", "Karnataka");
		System.out.println("dto by city and state:" + add);

		System.out.println("----------------------------------------");

		AddressDTO pin = service.findByPinCode(587127);
		System.out.println("dto by pincode:" + pin);

		System.out.println("----------------------------------------");

		int app = service.findPincodeByNumber(55555);
		System.out.println("pincode by number:" + app);

		System.out.println("----------------------------------------");

		int floor = service.findFloorByNumber(55555);
		System.out.println("floor by number:" + floor);

		System.out.println("----------------------------------------");

		AddressDTO aa = service.findByStreetAndPinCodeAndArea(587125, "Chikk", "Karadi");
		System.out.println("dto by street pin area:" + aa);

		System.out.println("----------------------------------------");

		AddressDTO str = service.findByStreet("Karadi");
		System.out.println("dto by street:" + str);

		System.out.println("----------------------------------------");

		AddressDTO str1 = service.findByNumber(55555);
		System.out.println("dto by number:" + str1);

		System.out.println("----------------------------------------");

		System.out.println("=======================================");

		int total = service.total();
		System.out.println("total dto is:" + total);

		System.out.println("=======================================");

		service.findAll();

	}

}
