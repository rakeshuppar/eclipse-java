package com.xworkz.boot.MachineRunner;

import com.xworkz.things.Machine.MiniProject;
import com.xworkz.things.Machine.Project;

public class ProjectRunner {

	public static void main(String[] args) {

		Project project = new MiniProject();
		project.type();
		project.duration();
		project.members();
		
		System.out.println("-------------------------");

		MiniProject project1 = new MiniProject();
		project1.type();
		project1.duration();
		project1.members();
	}

}
