package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Component
@ToString
public class Security {

	@Autowired
	private String name;

	@Autowired
	private Things things;

}
