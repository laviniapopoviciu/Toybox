package db;



import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Kid;
import model.Toy;
import model.Toybox;


public class DatabaseCreator {
	public static void main(String[] args) {

		insertDummyData();
	}
		private static void createNewDatabase() {

		}

		private static void dropOldTable() {

		}

private static void insertDummyData() {

	
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ToyboxDBJPA");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();

		Kid kid = new Kid(0l,"Tudor", "Popoviciu");
		List<Toy> toys =List.of(new Toy (0l, "Lego","/Users/laviniapopoviciu/eclipse-workspace/ToyBoxBeta/src/images/congy-yuan-NKMtIVtMMG8-unsplash.jpg"),
				new Toy(1l, "car", "/Users/laviniapopoviciu/eclipse-workspace/ToyBoxBeta/src/images/elodie-oudot-TaEd6ndkRWM-unsplash.jpg"));
		Toybox toybox = new Toybox(0l,"Jucarii", toys , kid );
	
		
		
	    em.persist(toybox);
		
		et.commit();
		
		em.close();
		emf.close();
		
	}


}