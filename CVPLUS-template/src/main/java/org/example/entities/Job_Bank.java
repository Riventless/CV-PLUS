package org.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Job_Bank")
public class Job_Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdJobBank;
	

	@Column(name = "Sector", length = 50, nullable = false)
	private String Sector;
	
	
	@ManyToOne
	@JoinColumn(name="IdJob",nullable=false)
	private Job job;
	
	@ManyToOne
	@JoinColumn(name="Id_Curriculum",nullable=false)
	private Curriculums curriculums;

	public Long getIdJobBank() {
		return IdJobBank;
	}

	public void setIdJobBank(Long idJobBank) {
		IdJobBank = idJobBank;
	}

	public String getSector() {
		return Sector;
	}

	public void setSector(String sector) {
		Sector = sector;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Curriculums getCurriculums() {
		return curriculums;
	}

	public void setCurriculums(Curriculums curriculums) {
		this.curriculums = curriculums;
	}


	
	
	
}