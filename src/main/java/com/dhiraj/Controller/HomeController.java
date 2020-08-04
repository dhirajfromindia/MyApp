package com.dhiraj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhiraj.Repo.MyRepo;

@Controller
public class HomeController {

	@Autowired
	private MyRepo myRepo;

	@RequestMapping("/")
	public String index(ModelMap m) {
		m.addAttribute("list", myRepo.findAll());
		return "index";
	}


}
