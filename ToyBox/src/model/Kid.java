package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Kid {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String firstName;
	
	@Column
	private String lastName;

	@OneToMany(mappedBy = "kid")
	private Toybox toybox;
	
	

	public Kid(long id, String firstName, String lastName, Toybox toybox) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.toybox = toybox;
	}
	

	public Kid(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Kid(String firstName, String lastName, Toybox toybox) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.toybox = toybox;
	}


	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Toybox getToybox() {
		return toybox;
	}

	public void setToybox(Toybox toybox) {
		this.toybox = toybox;
	}


	
	
}
