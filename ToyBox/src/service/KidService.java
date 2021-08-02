package service;

import java.util.List;

import model.Kid;
import repository.KidRepository;
import repository.KidRepositoryJPA;

public class KidService {
	private KidRepository repository = new KidRepositoryJPA(); 

	public void add(Kid kid) {
		
		repository.add(kid);

	}


	public Kid update(Kid kid)  {

		return repository.update(kid);
	}

	public List<Kid> getAll()  {

		List<Kid> kidList = repository.getAll();
		return kidList;

	}

	
	public void delete(Kid kid)  {
		
		repository.delete(kid);
	}

}


