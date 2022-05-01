package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.example.entities.Postulants;

@Named
public class PostulantsRepository implements Serializable{

    private static final long serialVersionUID = 1L;

    @PersistenceContext(unitName="demoWeb")
    private EntityManager em;


    public Long insert(Postulants postulants) throws Exception{
        em.persist(postulants);
        return postulants.getIdPostulant();
    }

    public Long update(Postulants postulants) throws Exception{
        em.merge(postulants);
        return postulants.getIdPostulant();
    }


    public List<Postulants> findALL()throws Exception{
        List<Postulants> postulants=new ArrayList<>();

        TypedQuery<Postulants> query=em.createQuery("SELECT p From Postulants p",Postulants.class);
        postulants=query.getResultList();
        return postulants;

    }

    public List<Postulants> findByName(String LastName)  throws Exception{
        List<Postulants> postulants=new ArrayList<>();
        TypedQuery<Postulants> query=em.createQuery("FROM Postulants p WHERE p.name LIKE ?1", Postulants.class);
        query.setParameter(1, "%"+LastName+"%");
        postulants=query.getResultList();
        return postulants;
    }


}