package repository;

import java.util.List;
import java.util.Optional;


import application.DatabaseContext;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Toybox;

public class ToyboxRepositoryJPA implements ToyboxRepository {

	@Override
	public void add(Toybox toybox) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		em.persist(toybox);

		transaction.commit();

		System.out.println("Inserted Toybox: " + toybox.getId());

		
	}

	@Override
	public Toybox update(Toybox toybox) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Toybox mergedToybox = em.merge(toybox);

		transaction.commit();

		System.out.println("Updated Toybox: " + toybox.getId());

		return mergedToybox;
	}

	@Override
	public List<Toybox> getAll() {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read all Toyboxes");
		transaction.begin();

		@SuppressWarnings("unchecked")
		// check that query was UPDATED!!!
		List<Toybox> toyboxs = (List<Toybox>) em.createQuery("select t from Toybox t")
				.getResultList();

		transaction.commit();

		return toyboxs;
	}

	@Override
	public Optional<Toybox> get(long id) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read Toybox with id:" + id);
		transaction.begin();

		Toybox toybox = em.find(Toybox.class, id);

		transaction.commit();

		return Optional.ofNullable(toybox);

	}

	@Override
	public void delete(Toybox toybox) {

		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Delete Toybox: " + toybox.getId());
		transaction.begin();

		if (!em.contains(toybox))
			toybox = em.merge(toybox);

		em.remove(toybox);

		try {
			transaction.commit();
		} catch (RollbackException e) {
			
		}

	}

		
	}


