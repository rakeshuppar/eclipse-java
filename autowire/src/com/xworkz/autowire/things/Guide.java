package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@AllArgsConstructor
@ToString
public class Guide {

	@Autowired
	private int age;

	@Autowired
	private Security security;

}
