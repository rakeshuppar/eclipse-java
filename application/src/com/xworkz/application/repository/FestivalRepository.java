package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalRepository {

	public boolean save(FestivalDTO repo);

	default boolean isExist(FestivalDTO dto) {
		return false;

	}

	default int getTotalSaved() {
		return 0;

	}

}
