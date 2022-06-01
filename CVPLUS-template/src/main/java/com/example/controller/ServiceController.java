package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.Servicio;
import com.example.service.ServicioXAdviserService;


@Controller
@RequestMapping("/advisors")
public class ServiceController {
	

	private ServicioXAdviserService servicio_serviceAdv;
//	private List<Servicio> servicioAsesorList = new ArrayList<>();

    public ServiceController(ServicioXAdviserService servicio_serviceAdv) {
        this.servicio_serviceAdv = servicio_serviceAdv;
        
    }
    //http://localhost:8080/
    @GetMapping
    public String showAllServices_Advisors(Model model) {
    	//Model carga y pinta la lista de estudiantes, y lo llamamos students
        model.addAttribute("serviceAdv_collection", servicio_serviceAdv.getAllSxA());
        return "students/list_services_advisers";
    }
    
    

}
