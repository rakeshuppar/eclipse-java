package com.xworkz.isckon.boot;

import com.xworkz.isckon.dto.IsckonDTO;
import com.xworkz.isckon.repository.IsckonRepoImp;
import com.xworkz.isckon.repository.IsckonRepository;
import com.xworkz.isckon.service.IsckonService;
import com.xworkz.isckon.service.IsckonServiceImp;

public class IsckonRunner {
	public static void main(String[] args) {

		IsckonDTO isckondto = new IsckonDTO("Krishna", "Mahalakshmi", 23.4, 40, true);
		IsckonRepository repo = new IsckonRepoImp();
		IsckonService service = new IsckonServiceImp(repo);

		boolean save = service.validateThenSave(isckondto);
		System.out.println("saves:" + save);
		boolean opt = service.findByGodName("Krishna");
		System.out.println(opt);
		System.out.println("update");
		boolean update=service.update("Shiva");
		System.out.println(update);

	}

}