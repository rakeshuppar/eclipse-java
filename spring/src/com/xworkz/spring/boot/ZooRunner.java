package com.xworkz.spring.boot;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.ZooConfiguration;
import com.xworkz.spring.things.Board;
import com.xworkz.spring.things.Bottle;
import com.xworkz.spring.things.Camera;
import com.xworkz.spring.things.Cap;
import com.xworkz.spring.things.Chair;
import com.xworkz.spring.things.Cloth;
import com.xworkz.spring.things.Dias;
import com.xworkz.spring.things.Fan;
import com.xworkz.spring.things.Key;
import com.xworkz.spring.things.Library;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Planet;
import com.xworkz.spring.things.Shoes;
import com.xworkz.spring.things.Table;
import com.xworkz.spring.things.Telephone;
import com.xworkz.spring.things.Umbrella;
import com.xworkz.spring.things.Vehical;
import com.xworkz.spring.things.Zoo;

public class ZooRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ZooConfiguration.class);

	}

}
