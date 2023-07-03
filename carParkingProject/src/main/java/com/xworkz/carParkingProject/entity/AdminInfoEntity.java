package com.xworkz.carParkingProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor

@Table(name = "admin_info")

@NamedQuery(name = "findByLocation", query = "select search from AdminInfoEntity as search where search.location like :nm")
@NamedQuery(name = "findByall", query = "select aa from AdminInfoEntity aa where aa.location=:lc and aa.type=:tp and aa.classfication=:cls and aa.days=:day")
public class AdminInfoEntity {

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;

	@Column(name = "location")
	private String location;

	@Column(name = "type")
	private String type;

	@Column(name = "classfication")
	private String classfication;

	@Column(name = "days")
	private int days;

	@Column(name = "price")
	private int price;

	@Column(name = "discount")
	private String discount;

}
