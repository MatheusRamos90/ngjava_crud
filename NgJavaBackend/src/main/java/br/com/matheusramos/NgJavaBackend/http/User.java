package br.com.matheusramos.NgJavaBackend.http;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

@XmlRootElement
public class User {
	
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String date_created;
	private String date_updated;
	
	public User() {
		
	}
	
	public User(Integer id,String name,String email,String gender,String date_created,String date_updated) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.date_created = date_created;
		this.date_updated = date_updated;
	}

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
