package br.com.matheusramos.NgJavaBackend.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.matheusramos.NgJavaBackend.DateHelper;
import br.com.matheusramos.NgJavaBackend.entity.UserEntity;

/**
 * Created by: Matheus Ramos - https://matheusramos.com/
 * */

public class UserRepository {

	private final EntityManagerFactory entityManagerFactory;
	
	private final EntityManager entityManager;
	
	public UserRepository() {
		
		/* CRIANDO O NOSSO EntityManagerFactory COM AS PROPRIEDADES DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_ngjava");
		
		this.entityManager = this.entityManagerFactory.createEntityManager();
		
	}
	
	/**
	 * Create
	 * */
	public void create(UserEntity userEntity) {
		
		this.entityManager.getTransaction().begin();
		Query query = this.entityManager.createQuery("insert into UserEntity (name,email,gender,date_created) select ?1,?2,?3,?4 from UserEntity u")
				.setParameter(1, userEntity.getName())
				.setParameter(2, userEntity.getEmail())
				.setParameter(3, userEntity.getGender())
				.setParameter(4, new DateHelper().getDateTimeZone());
		query.executeUpdate();
		this.entityManager.getTransaction().commit();
	}

	/**
	 * GetAll
	 * */
	@SuppressWarnings("unchecked")
	public List<UserEntity> getAll(){
		return this.entityManager.createQuery("SELECT p FROM UserEntity p ORDER BY p.name").getResultList();
	}
	
	/**
	 * Update User
	 * */
	public void updateUser(UserEntity userEntity) {
		
		this.entityManager.getTransaction().begin();
		Query query = this.entityManager.createQuery("update UserEntity u set u.name = ?1,u.email = ?2,u.gender = ?3,u.date_updated = ?4 where u.id = ?5")
				.setParameter(1, userEntity.getName())
				.setParameter(2, userEntity.getEmail())
				.setParameter(3, userEntity.getGender())
				.setParameter(4, new DateHelper().getDateTimeZone())
				.setParameter(5, userEntity.getId());
		query.executeUpdate();
		this.entityManager.getTransaction().commit();
		
	}
	
	/**
	 * GetById
	 * */
	public UserEntity getById(Integer id) {
		return this.entityManager.find(UserEntity.class, id);
	}
	
	/**
	 * Delete
	 * */
	public void delete(Integer id) {
		UserEntity user = this.getById(id);
		
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(user);
		this.entityManager.getTransaction().commit();
	}	
	
}
