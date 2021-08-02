package service;

import java.util.List;

import model.Toy;
import repository.ToyRepository;
import repository.ToyRepositoryJPA;

public class ToyService {
	private ToyRepository repository = new ToyRepositoryJPA(); 

	public void add(Toy toy) {
		
		repository.add(toy);

	}


	public Toy update(Toy toy)  {

		return repository.update(toy);
	}

	public List<Toy> getAll()  {

		List<Toy> toyList = repository.getAll();
		return toyList;

	}

	
	public void delete(Toy toy)  {
		
		repository.delete(toy);
	}

}
