package org.example.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.example.entities.Proyecto;

@Named
public class ProyectoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "demoWeb")
	private EntityManager em;

	public Long insert(Proyecto proyecto) throws Exception {
		em.persist(proyecto);
		return proyecto.getIdProyecto();

	}

	public Long update(Proyecto proyecto) throws Exception {
		em.merge(proyecto);
		return proyecto.getIdProyecto();

	}

	public List<Proyecto> findAll() throws Exception {

		List<Proyecto> proyectos = new ArrayList<>();

		TypedQuery<Proyecto> query = em.createQuery("FROM Proyecto pro", Proyecto.class);
		proyectos = query.getResultList();
		return proyectos;

	}
	public List<Proyecto> findByName(String Titulo_Proyect) throws Exception {

		List<Proyecto> proyectos = new ArrayList<>();

		TypedQuery<Proyecto> query = em.createQuery("FROM Proyecto pro WHERE pro.Titulo_Proyect LIKE ?1", Proyecto.class);
		query.setParameter(1,"%"+Titulo_Proyect+"%");
		proyectos = query.getResultList();
		return proyectos;

	}
	
	
	

}
