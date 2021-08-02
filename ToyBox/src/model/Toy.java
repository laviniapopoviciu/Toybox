package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Toy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String description;

	@Column
	private String photoURL;
	
	@ManyToOne
	@JoinColumn(name = "toybox_id")
	private Toybox toybox;

	
	
	public Toy(String description, String photoURL, Toybox toybox) {
		super();
		this.description = description;
		this.photoURL = photoURL;
		this.toybox = toybox;
	}

	
	
	public Toy(long id, String description, String photoURL) {
		super();
		this.id = id;
		this.description = description;
		this.photoURL = photoURL;
	}



	public Toy(long id, String description, String photoURL, Toybox toybox) {
		super();
		this.id = id;
		this.description = description;
		this.photoURL = photoURL;
		this.toybox = toybox;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public Toybox getToybox() {
		return toybox;
	}

	public void setToybox(Toybox toybox) {
		this.toybox = toybox;
	}

	
}
