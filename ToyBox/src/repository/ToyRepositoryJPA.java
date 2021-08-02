package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.RollbackException;

import application.DatabaseContext;
import model.Toy;


public class ToyRepositoryJPA implements ToyRepository {

	@Override
	public void add(Toy toy) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		em.persist(toy);

		transaction.commit();

		System.out.println("Inserted Toy: " + toy.getId());

		
	}

	@Override
	public Toy update(Toy toy) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Toy mergedToy = em.merge(toy);

		transaction.commit();

		System.out.println("Updated Toy: " + toy.getId());

		return mergedToy;
	}

	@Override
	public List<Toy> getAll() {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read all Toys");
		transaction.begin();

		@SuppressWarnings("unchecked")
		// check that query was UPDATED!!!
		List<Toy> toys = (List<Toy>) em.createQuery("select t from Toy t")
				.getResultList();

		transaction.commit();

		return toys;
	}

	@Override
	public Optional<Toy> get(long id) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Read Toy with id:" + id);
		transaction.begin();

		Toy toy = em.find(Toy.class, id);

		transaction.commit();

		return Optional.ofNullable(toy);
	}

	@Override
	public void delete(Toy toy) {
		EntityManager em = DatabaseContext.getEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Delete Toy: " + toy.getId());
		transaction.begin();

		if (!em.contains(toy))
			toy = em.merge(toy);

		em.remove(toy);

		try {
			transaction.commit();
		} catch (RollbackException e) {
			
		}
	}

}
