package com.xworkz.application.dtoRunner;

import com.xworkz.application.constants.application1.LangaugeUsed;
import com.xworkz.application.constants.application1.OsTypeSupported;
import com.xworkz.application.constants.application1.Type;
import com.xworkz.application.dto.ApplicationDTO1;
import com.xworkz.application.service.ApplicationImp1;
import com.xworkz.application.service.ApplicationService1;

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

		System.out.println(app.toString());

		ApplicationService1 service1 = new ApplicationImp1();
		System.out
				.println("Hashcode :" + service1.hashCode() + " Original HasCode:" + System.identityHashCode(service1));
		System.out.println("Application1 is equals to Application1:" + service1.equals(service1));
		boolean saved1 = service1.validThenSave(app);
		System.out.println("validThenSave:" + saved1);

	}

}
