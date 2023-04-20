package com.xworkz.application.dtoRunner;

import com.xworkz.application.constants.application1.LangaugeUsed;
import com.xworkz.application.constants.application1.OsTypeSupported;
import com.xworkz.application.constants.application1.Type;
import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.Application1Repository;
import com.xworkz.application.repository.Application1RepositoryImp;
import com.xworkz.application.service.ApplicationService1;
import com.xworkz.application.service.ApplicationServiceImp1;

import java.time.LocalDate;

public class ApplicationDTO1Runner {

	public static void main(String[] args) {

		ApplicationDTO1 app = new ApplicationDTO1("Instagram",11.2,LocalDate.of(2009, 4, 1),55,"John Koum",Type.SOCIALMEDIAAPP,90,LocalDate.of(2006, 2, 22),LocalDate.of(2018, 9, 22),LocalDate.of(2024, 7, 8),30,LangaugeUsed.JAVA,88,99,true,15,10,5,OsTypeSupported.WINDOWS);
		Application1Repository repo = new Application1RepositoryImp();
		ApplicationService1 service = new ApplicationServiceImp1(repo);
		
		ApplicationDTO1 apps1 = new ApplicationDTO1(null, 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		
		
		ApplicationDTO1 apps2 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		
		ApplicationDTO1 apps3 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		
		ApplicationDTO1 apps4 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		
		ApplicationDTO1 apps5 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		

		try {
			
		boolean saved = service.validThenSave(app);
		System.out.println("validThenSave:" + saved);
        System.out.println("=====================================================");

		boolean saved1 = service.validThenSave(apps1);
		System.out.println("validThenSave:" + saved1);
		System.out.println("=====================================================");	
		boolean saved2 = service.validThenSave(apps2);
		System.out.println("validThenSave:" + saved2);
		System.out.println("=====================================================");
		boolean saved3 = service.validThenSave(apps3);
		System.out.println("validThenSave:" + saved3);
		System.out.println("=====================================================");	
		boolean saved4 = service.validThenSave(apps4);
		System.out.println("validThenSave:" + saved4);
		System.out.println("=====================================================");		
		boolean saved5 = service.validThenSave(apps5);
		System.out.println("validThenSave:" + saved5);
	
	}catch(InvalidFestivalException e) {
	   System.out.println("Invalid Application Except valid application handled the exception");
	}
	}

}
