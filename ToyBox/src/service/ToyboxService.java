package service;

import java.util.List;

import model.Toybox;
import repository.ToyboxRepository;
import repository.ToyboxRepositoryJPA;

public class ToyboxService {
	private ToyboxRepository repository = new ToyboxRepositoryJPA(); 

	public void add(Toybox toybox) {
		
		repository.add(toybox);

	}


	public Toybox update(Toybox toybox)  {

		return repository.update(toybox);
	}

	public List<Toybox> getAll()  {

		List<Toybox> toyboxList = repository.getAll();
		return toyboxList;

	}

	
	public void delete(Toybox toybox)  {
		
		repository.delete(toybox);
	}

}

