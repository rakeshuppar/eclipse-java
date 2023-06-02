package com.xworkz.isckon.service;

import com.xworkz.isckon.dto.IsckonDTO;

public interface IsckonService {

	boolean validateThenSave(IsckonDTO dto);

	boolean findByGodName(String godName);
	boolean update(String godName);

}
