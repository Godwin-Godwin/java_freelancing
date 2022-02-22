package com.groupe2.freelancing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.groupe2.freelancing.model.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{
	
	@Query(value="Select * from services where provider_id = ?1 and status='Available'", nativeQuery = true)
	List<Services> getServicesById(Long Id);
	
	
	@Query(value="Select services s from services s where s.provider_id = ?1 and s.id = ?2", nativeQuery = true)
	public Services getByUserAndServiceId(Long Id, Long service_id);
	 
	
	@Modifying
	@Transactional
	@Query(value="Update services s set s.category = ?1, s.sevice_name = ?2, s.description = ?3, s.requirements = ?4, s.price = ?5 where s.id = ?6", nativeQuery = true)
	int updateService(String catg, String s_name, String desc, String req, float prc,  Long id);
	
	@Modifying
	@Transactional
	@Query(value="Update services s set s.status = ?1 where s.id = ?2", nativeQuery = true)
	void deleteService(String stat, Long id);
	
}
