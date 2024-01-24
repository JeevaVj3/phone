package com.onesoft.phone;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PhoneService {
	
	private final PhoneDao phoneDao;

	public PhoneService(PhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}

	public String list(List<Phone> list) {
		return phoneDao.list(list);
	}

	public List<Phone> get() {
		return phoneDao.get();
	}

	public void post(Phone post) {
		phoneDao.post(post);
		
	}
	

}
