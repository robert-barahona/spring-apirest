package com.barahona.backend.models.entities;

import java.util.Calendar;
import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "Subscriptions")
@Entity
public class Subscription implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_subscription")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idSubscription;
	
	@Column(name = "from_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar from;
	
	@Column(name = "to_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar to;
	
	@Column(name = "grade")
	private String grade;
	
	@JoinColumn(name = "fk_student", referencedColumnName = "id_student")
	@ManyToOne
	private Student student;
	
	@JoinColumn(name = "fk_club", referencedColumnName = "id_club")
	@ManyToOne
	private Club club;

	public Subscription() {
		super();
	}

	public Subscription(Long idSubscription) {
		super();
		this.idSubscription = idSubscription;
	}

	public Long getIdSubscription() {
		return idSubscription;
	}

	public void setIdSubscription(Long idSubscription) {
		this.idSubscription = idSubscription;
	}

	public Calendar getFrom() {
		return from;
	}

	public void setFrom(Calendar from) {
		this.from = from;
	}

	public Calendar getTo() {
		return to;
	}

	public void setTo(Calendar to) {
		this.to = to;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
