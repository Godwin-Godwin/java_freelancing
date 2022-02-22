package com.groupe2.freelancing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.groupe2.freelancing.service.ServicesService;
import com.groupe2.freelancing.model.Services;
import com.groupe2.freelancing.model.Users;

@Controller
public class ServicesController {

	@Autowired
	private ServicesService serv;
	
	@GetMapping("/addservice")
    public String addService(Model model){
		Services service = new Services();
		model.addAttribute("service", service);
		return "providers/addservice";
        
    }
	
	
	@GetMapping("/services/{user_id}")
	public List<Services> getServices(@PathVariable Long user_id){
		return serv.getAllMicroservices(user_id);
	}
	
	@PostMapping(value="/addservice")
    public String addService(@ModelAttribute("service") Services service, @ModelAttribute("currentUser") Users user){
        service.setProvider_id(Long.toString(user.getId()));
		serv.addMicroservice(service);
        return "redirect:/dashboard";
    }
	
	@PutMapping(value="/services/{id}")
    public void updateService(@PathVariable Long id , @RequestBody Services service) {
        serv.updateMicroservice(id, service);
    }
	
	@PutMapping(value="/deleteService/{id}")
    public void deleteService(@PathVariable Long id) {
        serv.deleteMicroservice(id);
    } 
}
