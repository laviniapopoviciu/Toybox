package repository;

import java.util.List;
import java.util.Optional;

import model.Toy;

public interface ToyRepository {
	public void add(Toy toy);

	public Toy update(Toy toy);

	public List<Toy> getAll();

	public Optional<Toy> get(long id);

	public void delete(Toy toy);
}
