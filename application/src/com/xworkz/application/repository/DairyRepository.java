package com.xworkz.application.repository;

import com.xworkz.application.dto.DairyDTO;

public interface DairyRepository {

	public boolean save(DairyDTO dto);

	public boolean isExist(DairyDTO dto);

	public boolean find(DairyDTO dto);

	public DairyDTO findByName(String name);

	public double openFindByName(String name);

	public double openFindByNameAndClose(String name, double close);

	public DairyDTO findByNameorOpenorClose(String name, double open, double close);

	public DairyDTO[] findAll();

	int total();

}
