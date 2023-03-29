package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalRepository {

	public boolean save(FestivalDTO repo) throws RuntimeException;

}
