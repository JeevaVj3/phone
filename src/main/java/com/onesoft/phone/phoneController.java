package com.onesoft.phone;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/phoneDetails")
public class phoneController {
	
	private final PhoneService phoneService;

	public phoneController(PhoneService phoneService) {
		this.phoneService = phoneService;
	}
	
	@PostMapping("/post/list")
	public String list(@RequestBody List<Phone> list) {
		return phoneService.list(list);
	}
	
	@GetMapping("getall")
	public List<Phone> get(){
		return phoneService.get();
	}
	
	@PostMapping("/post/detail")
	public void post(@RequestBody Phone post) {
		phoneService.post(post);
	}
	

}
