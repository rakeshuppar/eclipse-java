package com.xworkz.tomarrow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity

@Table(name = "tomarrowtable")
public class TomarrowEntity {

	@Id

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

}
