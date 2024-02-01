package com.xworkz.tomarrow.runner;

import com.xworkz.tomarrow.entity.TomarrowEntity;
import com.xworkz.tomarrow.repository.TomarrowRepository;
import com.xworkz.tomarrow.repository.TomarrowRepositoryImp;
import com.xworkz.tomarrow.service.TomarrowService;
import com.xworkz.tomarrow.service.TomarrowServiceImp;

public class EntityRunner {

	public static void main(String[] args) {

		TomarrowEntity tn = new TomarrowEntity();

		TomarrowRepository repo = new TomarrowRepositoryImp();

		TomarrowService service = new TomarrowServiceImp(repo);
		boolean saved = service.remove(tn);
		System.out.println(saved);
		
		

	}
}