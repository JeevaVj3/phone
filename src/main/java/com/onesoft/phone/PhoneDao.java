package com.onesoft.phone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PhoneDao {
	
	private final PhoneRepository phoneRepository;

	public PhoneDao(PhoneRepository phoneRepository) {
		this.phoneRepository = phoneRepository;
	}

	public String list(List<Phone> list) {
		phoneRepository.saveAll(list);
		return "Mobile List Saved";
	}

	public List<Phone> get() {
		return phoneRepository.findAll();
	}

	public void post(Phone post) {
		phoneRepository.save(post);
		
	}
	

}
