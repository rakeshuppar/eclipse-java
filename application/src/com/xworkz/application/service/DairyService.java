package com.xworkz.application.service;

import com.xworkz.application.dto.DairyDTO;
import com.xworkz.application.exception.InvalidFestivalException;

public interface DairyService {

	public boolean validThenSave(DairyDTO dto) throws InvalidFestivalException;

	public boolean isExist(DairyDTO dto) throws InvalidFestivalException;

	public boolean find(DairyDTO dto) throws InvalidFestivalException;

	public DairyDTO findByName(String name);

	public double openFindByName(String name);

	public double openFindByNameAndClose(String name, double close);

	public DairyDTO findByNameorOpenorClose(String name, double open, double close);

	public DairyDTO[] findAll();

	int total();

}
