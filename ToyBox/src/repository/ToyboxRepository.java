package repository;


import model.Toybox;

import java.util.List;
import java.util.Optional;



public interface ToyboxRepository {
	
	public void add(Toybox toybox);
	
	public Toybox update(Toybox toybox) ;

	public List<Toybox> getAll();

	public Optional<Toybox> get(long id);

	public void delete(Toybox toybox) ;
}