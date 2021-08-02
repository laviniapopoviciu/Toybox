package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;

import application.DatabaseContext;
import model.Kid;

public class KidRepositoryJPA implements KidRepository {

	@Override
	public void add(Kid kid) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		em.persist(kid);

		transaction.commit();

		System.out.println("Inserted Kid: " + kid.getId());
		
	}

	@Override
	public Kid update(Kid kid) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Kid mergedKid = em.merge(kid);

		transaction.commit();

		System.out.println("Updated Kid: " + kid.getId());

		return mergedKid;
	}

	@Override
	public List<Kid> getAll() {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read all Kids");
		transaction.begin();

		@SuppressWarnings("unchecked")
		// check that query was UPDATED!!!
		List<Kid> kids = (List<Kid>) em.createQuery("select k from Kid k")
				.getResultList();

		transaction.commit();

		return kids;
	}

	@Override
	public Optional<Kid> get(long id) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read Kid with id:" + id);
		transaction.begin();

		Kid kid = em.find(Kid.class, id);

		transaction.commit();

		return Optional.ofNullable(kid);
	}

	@Override
	public void delete(Kid kid) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Delete Kid: " + kid.getId());
		transaction.begin();

		if (!em.contains(kid))
			kid = em.merge(kid);

		em.remove(kid);

		try {
			transaction.commit();
		} catch (RollbackException e) {
			
		}
		
	}

}
