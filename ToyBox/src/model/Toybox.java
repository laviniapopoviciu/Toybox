package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Toybox {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String name;
	
	@OneToMany(mappedBy = "toybox")
	private List <Toy> toys;
	
	@ManyToOne
	@JoinColumn(name = "kid_id")
	private Kid kid;

	
	
	public Toybox(String name, List<Toy> toys, Kid kid) {
		super();
		this.name = name;
		this.toys = toys;
		this.kid = kid;
	}


	public Toybox(long id, String name, List<Toy> toys, Kid kid) {
		super();
		this.id = id;
		this.name = name;
		this.toys = toys;
		this.kid = kid;
	}


	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Toy> getToys() {
		return toys;
	}

	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}

	public Kid getKid() {
		return kid;
	}

	public void setKid(Kid kid) {
		this.kid = kid;
	}
	
	
}
