package com.xworkz.application.dtoRunner;

import com.xworkz.application.dto.ApplicationDTO;
import com.xworkz.application.repository.ApplicationRepoImp;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImp;
import java.time.LocalDate;

public class ApplicationDTORunner {

	public static void main(String[] args) {

		ApplicationDTO apps = new ApplicationDTO();
		apps.setName("Whatsapp");
		apps.setSize(20);
		apps.setVersion(1.22);
		apps.setDevelopedBy("Rekhesh");
		apps.setCreatedDate(LocalDate.of(2022, 6, 01));
		System.out.println(apps);
		
		ApplicationRepository repo=new ApplicationRepoImp();
		
		ApplicationService service=new ApplicationServiceImp(repo);
		boolean saved = service.validThenSave(apps);
		System.out.println("service is:" + saved);
		
		System.out.println("============================================================");
		
		
		ApplicationDTO apps1=new ApplicationDTO("Instagram",13,"brahma",99,LocalDate.of(2021, 5, 22));
		System.out.println(apps1);

        ApplicationRepository repo1=new ApplicationRepoImp();
		
		ApplicationService service1=new ApplicationServiceImp(repo1);
		boolean saved1 = service.validThenSave(apps1);
		System.out.println("service is:" + saved1);
		
		System.out.println("============================================================");


		ApplicationDTO apps2=new ApplicationDTO("Instagram",21,"brahma",70,LocalDate.of(2021, 7, 22));
		System.out.println(apps2);

        ApplicationRepository repo2=new ApplicationRepoImp();
		
		ApplicationService service2=new ApplicationServiceImp(repo2);
		boolean saved2 = service.validThenSave(apps2);
		System.out.println("service is:" + saved2);
		
		System.out.println("============================================================");


		ApplicationDTO apps3=new ApplicationDTO("Instagram",21,"brahma",88,LocalDate.of(2021, 11, 22));
		System.out.println(apps3);

        ApplicationRepository repo3=new ApplicationRepoImp();
		
		ApplicationService service3=new ApplicationServiceImp(repo3);
		boolean saved3 = service.validThenSave(apps3);
		System.out.println("service is:" + saved3);
		
		System.out.println("============================================================");


		ApplicationDTO apps4=new ApplicationDTO("Instagram",21,"brahma",60,LocalDate.of(2022, 1, 22));
		System.out.println(apps4);

        ApplicationRepository repo4=new ApplicationRepoImp();
		
		ApplicationService service4=new ApplicationServiceImp(repo4);
		boolean saved4 = service.validThenSave(apps4);
		System.out.println("service is:" + saved4);
		
		System.out.println("============================================================");


		ApplicationDTO apps5=new ApplicationDTO("Instagram",21,"brahma",98,LocalDate.of(2022, 2, 10));
		System.out.println(apps5);

        ApplicationRepository repo5=new ApplicationRepoImp();
		
		ApplicationService service5=new ApplicationServiceImp(repo5);
		boolean saved5 = service.validThenSave(apps5);
		System.out.println("service is:" + saved5);
		
		System.out.println("============================================================");
	
		
	}
}
