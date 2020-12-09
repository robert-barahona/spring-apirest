package com.barahona.backend.models.entities;

import java.io.Serializable;
import javax.persistence.*;

@Table(name="Subjects")
@Entity
public class Subject implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_subject")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idSubject;
	
	@Column(name="name")
	private String name;
	
	@Column(name="hours")
	private int hours;
	
	@JoinColumn(name = "fk_category", referencedColumnName = "id_category")
	@ManyToOne
	private Category category;

	public Long getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	
}
