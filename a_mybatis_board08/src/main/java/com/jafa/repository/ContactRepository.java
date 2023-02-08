package com.jafa.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jafa.domain.ContactVO;

public interface ContactRepository {
	
	List<ContactVO> contacList();
	
	void addContact(@Param("contactList") List<ContactVO> contactList); 

}
