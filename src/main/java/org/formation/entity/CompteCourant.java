package org.formation.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {
	
	
	private Double seuil = 1000d;

	public CompteCourant() {
		
	}

	public CompteCourant(Double seuil) {
		super();
		this.seuil = seuil;
	}

	public Double getSeuil() {
		return seuil;
	}

	public void setSeuil(Double seuil) {
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		return "CompteCourant [seuil=" + seuil + "]";
	}

	

	
}
