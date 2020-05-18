package repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.ServiceEntity;

//import net.javaguides.springboot.tutorial.entity.Student;

@Repository
public interface ServiceRepo extends  CrudRepository <ServiceEntity, Long>{
	
	List<ServiceEntity> findByName(String ServiceName); 

}
