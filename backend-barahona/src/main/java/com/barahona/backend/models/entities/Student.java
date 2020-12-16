package com.barahona.backend.models.entities;

import java.util.Calendar;
import java.util.List;
import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "Students")
@Table
public class Student extends Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_student")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idStudent;
	
	@Column(name = "address", length = 200)
	private String address;
	
	@Column(name = "start_from")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar startFrom;
	
	//Cardinalidad uno a varios
	@OneToMany(mappedBy="student",fetch=FetchType.LAZY) //mappedBy apunta al atributo en la clase de Subscription
	private List<Subscription> subscriptions;
	
	public Student() {
		super();
	}

	public Student(Long idStudent) {
		super();
		this.idStudent = idStudent;
	}

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public Calendar getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(Calendar startFrom) {
		this.startFrom = startFrom;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
}
