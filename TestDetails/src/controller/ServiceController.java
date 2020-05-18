package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.ServiceEntity;
import repo.ServiceRepo;

@Controller
@RequestMapping("/services/")
public class ServiceController {
	
	private final ServiceRepo serviceRepo;
	
	@Autowired
	public ServiceController(ServiceRepo serviceRepo) {
		this.serviceRepo = serviceRepo;
	}
	
	@GetMapping("/addservices")
    public String addServicesDetails(ServiceEntity serviceEntity) {
        return "add-service";
    }
	
	@GetMapping("list")
    public String showUpdateDetails(Model model) {
        model.addAttribute("services", serviceRepo.findAll());
        return "index";
    }
	
	@PostMapping("add")
    public String addService(@Valid ServiceEntity serviceEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-service";
        }

        serviceRepo.save(serviceEntity);
        return "redirect:list";
    }
	
	@GetMapping("edit/{id}")
    public String showUpdateDetails(@PathVariable("id") long id, Model model) {
		ServiceEntity serviceEntity = serviceRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid service Id:" + id));
            //.orElseThrow(() - > new IllegalArgumentException("Invalid service Id:" + id));
        model.addAttribute("serviceEntity", serviceEntity);
        return "update-service";
    }
	
	@PostMapping("update/{id}")
    public String updateService(@PathVariable("id") long id, @Valid ServiceEntity serviceEntity, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
        	serviceEntity.setId(id);
            return "update-service";
        }

        serviceRepo.save(serviceEntity);
        model.addAttribute("services", serviceRepo.findAll());
        return "index";
    }

}
