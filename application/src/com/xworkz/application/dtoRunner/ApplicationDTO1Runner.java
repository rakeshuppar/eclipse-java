package com.xworkz.application.dtoRunner;

import com.xworkz.application.constants.application1.LangaugeUsed;
import com.xworkz.application.constants.application1.OsTypeSupported;
import com.xworkz.application.constants.application1.Type;
import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.repository.Application1Repository;
import com.xworkz.application.repository.Application1RepositoryImp;
import com.xworkz.application.service.ApplicationService1;
import com.xworkz.application.service.ApplicationServiceImp1;

import java.time.LocalDate;

public class ApplicationDTO1Runner {

	public static void main(String[] args) {

		ApplicationDTO1 app = new ApplicationDTO1();
		app.setName("Whatsapp");
		app.setVersion(11.2);
		app.setCreateDate(LocalDate.of(2009, 4, 1));
		app.setSize(55);
		app.setDevelopedBy("John Koum");
		app.setType(Type.SOCIALMEDIAAPP);
		app.setPrice(90);
		app.setFirstVersionReleaseDate(LocalDate.of(2006, 2, 22));
		app.setCurrentVersionReleaseDate(LocalDate.of(2018, 9, 22));
		app.setNextVersionReleaseDate(LocalDate.of(2024, 7, 8));
		app.setTrailDays(30);
		app.setLanguageUsed(LangaugeUsed.JAVA);
		app.setMinProcessorSpeed(88);
		app.setRamSpeedRequired(99);
		app.setInternetNeeded(true);
		app.setAgeLimit(15);
		app.setNumDownloads(10);
		app.setRatings(5);
		app.setOsTypeSupported(OsTypeSupported.WINDOWS);
		System.out.println(app);

		Application1Repository repo = new Application1RepositoryImp();

		ApplicationService1 service = new ApplicationServiceImp1(repo);

		boolean saved = service.validThenSave(app);
		System.out.println("validThenSave:" + saved);

		System.out.println("=====================================================");

		ApplicationDTO1 apps1 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		System.out.println(apps1);

		ApplicationService1 service1 = new ApplicationServiceImp1(repo);
		boolean saved1 = service.validThenSave(apps1);

		System.out.println("=====================================================");

		ApplicationDTO1 apps2 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		System.out.println(apps2);

		ApplicationService1 service2 = new ApplicationServiceImp1(repo);
		boolean save2 = service.validThenSave(apps2);

		System.out.println("=====================================================");

		ApplicationDTO1 apps3 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		System.out.println(apps3);

		ApplicationService1 service3 = new ApplicationServiceImp1(repo);
		boolean saved3 = service.validThenSave(apps3);

		System.out.println("=====================================================");

		ApplicationDTO1 apps4 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		System.out.println(apps4);

		ApplicationService1 service4 = new ApplicationServiceImp1(repo);
		boolean saved4 = service.validThenSave(apps4);

		System.out.println("=====================================================");

		ApplicationDTO1 apps5 = new ApplicationDTO1("Instagram", 12.2, LocalDate.of(2009, 5, 22), 55, "John Koum",
				Type.GAMINGAPP, 80, LocalDate.of(2006, 7, 15), LocalDate.of(2018, 8, 12), LocalDate.of(2024, 2, 22), 30,
				LangaugeUsed.PYTHON, 88, 99, true, 15, 10, 5, OsTypeSupported.MAC);
		System.out.println(apps5);

		ApplicationService1 service5 = new ApplicationServiceImp1(repo);
		boolean saved5 = service.validThenSave(apps5);
	}

}
