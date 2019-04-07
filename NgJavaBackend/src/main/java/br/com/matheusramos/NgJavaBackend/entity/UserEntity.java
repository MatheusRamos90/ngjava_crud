package br.com.matheusramos.NgJavaBackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

@Entity
@Table(name="ngj_users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="gender", nullable = false)
	private String gender;
	
	@Column(name="date_created", nullable = true)
	private String date_created;
	
	@Column(name="date_updated", nullable = true)
	private String date_updated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getDate_updated() {
		return date_updated;
	}

	public void setDate_updated(String date_updated) {
		this.date_updated = date_updated;
	}
	
}
