package org.formation.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CompteEpargne extends Compte {
	
	private Double taux =3d;

	public CompteEpargne() {
		
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	
	
	
	
	
	
}
