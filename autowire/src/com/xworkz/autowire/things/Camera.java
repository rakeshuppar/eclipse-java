package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {

	@Autowired
	private String brand;

	@Autowired
	private Guide guide;

}
