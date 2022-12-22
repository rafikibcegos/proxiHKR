package org.formation.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Component
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	
 private int numeroCompte;


// @OneToOne(mappedBy = "compte")
// private Client client;x

private LocalDate dateOuverture;

private float solde;


@OneToOne(cascade = CascadeType.ALL)

@JoinColumn(name="client_id", updatable = false)
@JsonIgnore
private Client client;





public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public Compte() {
	
	
}



public int getNumeroCompte() {
	return numeroCompte;
}



public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}



public LocalDate getDateOuverture() {
	return dateOuverture;
}



public void setDateOuverture(LocalDate dateOuverture) {
	this.dateOuverture = dateOuverture;
}



public float getSolde() {
	return solde;
}



public void setSolde(float solde) {
	this.solde = solde;
}



public Client getClient() {
	return client;
}



public void setClient(Client client) {
	this.client = client;
}



public Compte(Long id, int numeroCompte, LocalDate dateOuverture, float solde, Client client) {
	super();
	this.id = id;
	this.numeroCompte = numeroCompte;
	this.dateOuverture = dateOuverture;
	this.solde = solde;
	this.client = client;
}



@Override
public String toString() {
	return "Compte [id=" + id + ", numeroCompte=" + numeroCompte + ", dateOuverture=" + dateOuverture + ", solde="
			+ solde + ", client=" + client + "]";
}




































	
	
	
	
}
	
	
	
	


