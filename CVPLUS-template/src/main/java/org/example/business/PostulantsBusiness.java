package org.example.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.example.entities.Postulants;
import org.example.repository.PostulantsRepository;
@Named
public class PostulantsBusiness implements Serializable{

    private static final long serialVersionUID = 1L;


    @Inject
    private PostulantsRepository postulantsRepository;

    public List<Postulants> getAllPostulants()throws Exception{
        return postulantsRepository.findALL();

    }

    @Transactional
    public Long insert(Postulants postulants)throws Exception{
        return postulantsRepository.insert(postulants);
    }
    @Transactional
    public Long update(Postulants postulants)throws Exception{
        return postulantsRepository.update(postulants);
    }
    public List<Postulants> getAllPostulantsByName(String LastName)throws Exception{
        return postulantsRepository.findByName(LastName);

    }


}