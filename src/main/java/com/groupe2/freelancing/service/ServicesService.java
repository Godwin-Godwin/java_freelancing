package com.groupe2.freelancing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupe2.freelancing.model.Services;
import com.groupe2.freelancing.repository.ServicesRepository;

@Service
public class ServicesService {

	 @Autowired
	 private ServicesRepository servRepo;
	 
	 public List<Services> getAllMicroservices(Long id){
		 List<Services> micservs = new ArrayList<>();
		servRepo.getServicesById(id).forEach(micservs::add);
		System.out.println(micservs.size());
		System.out.println(micservs.get(0).getStatus());
		/*
		 * System.out.println(micservs.size());
		 * System.out.println(micservs.get(0).getCategory());
		 * System.out.println(micservs.get(0).getDescription());
		 */
		return micservs;
	}
	
	public void addMicroservice(Services serv) {
		/*
		 * System.out.println(serv.getCategory());
		 * System.out.println(serv.getDescription());
		 */
		servRepo.save(serv);
	}
	
	public void updateMicroservice(Long id, Services serv) {
		//Services sv = servRepo.getByUserAndServiceId(id, serv.getId());
		servRepo.updateService(serv.getCategory(),
				serv.getServiceName(),
				serv.getDescription(), 
				serv.getRequirements(),
				serv.getPrice(),
				id);
		
	}
	
	public void deleteMicroservice(long id) {
		servRepo.deleteService("Unavailable", id);
	}
}
