package org.formation.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Gerant extends Personne{
	

	
	@OneToMany
	private Set<Conseiller>conseillers = new HashSet<>();
	
	
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	public Gerant( String nom, String prenom, String telephone) {
	
	}
	
}
