package repository;

import java.util.List;
import java.util.Optional;

import model.Kid;

public interface KidRepository {
	public void add(Kid kid);

	public Kid update(Kid kid);

	public List<Kid> getAll();

	public Optional<Kid> get(long id);

	public void delete(Kid kid);
}
