package com.xworkz.isckon.repository;

import com.xworkz.isckon.dto.IsckonDTO;

public interface IsckonRepository {

	boolean save(IsckonDTO dto);

	boolean findByGodName(String godName);

	boolean update(String godName);

}
