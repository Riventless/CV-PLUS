package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Proyecto;
import org.example.repository.ProyectoRepository;


@Named
public class ProyectoBusiness implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Inject
    private ProyectoRepository proyectoRepository;
    
    @Transactional
    public Long insert(Proyecto proyecto)throws Exception{
    	return proyectoRepository.insert(proyecto);
    	
    }
    
    @Transactional
    public Long update(Proyecto proyecto)throws Exception{
    	return proyectoRepository.update(proyecto);
    	
    }
    
    public List<Proyecto>getAll()throws Exception{
    	return proyectoRepository.findAll();
    }
    
    public List<Proyecto>getProyectosByName(String Titulo_Proyecto)throws Exception{
    	return proyectoRepository.findByName(Titulo_Proyecto);
    }

}
