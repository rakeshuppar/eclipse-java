package com.xworkz.tomarrow.service;

import com.xworkz.tomarrow.entity.TomarrowEntity;

public interface TomarrowService {

	default boolean validThenSave(TomarrowEntity service) {
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
