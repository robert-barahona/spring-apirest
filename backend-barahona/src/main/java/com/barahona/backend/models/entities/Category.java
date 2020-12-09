package com.barahona.backend.models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name="Categories")
@Entity
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_category")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCategory;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	//Cardinalidad uno a varios
	@OneToMany(mappedBy="category",fetch=FetchType.LAZY) //mappedBy apunta al atributo en la clase de Subscription
	private List<Subject> subjects;
	
	public Category() {
		super();
	}
	
	public Category(Long id) {
		super();
		this.idCategory = id;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
