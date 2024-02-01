package com.xworkz.tomarrow.repository;

import com.xworkz.tomarrow.entity.TomarrowEntity;

public interface TomarrowRepository {
	
	default boolean save(TomarrowEntity repo) {
		return false;
	}
	
	default boolean update(TomarrowEntity repo) {
		return false;
	}
	
	default boolean findbyId(TomarrowEntity repo) {
		return false;
	}
	
	default boolean remove(TomarrowEntity repo) {
		return false;
	}

}
