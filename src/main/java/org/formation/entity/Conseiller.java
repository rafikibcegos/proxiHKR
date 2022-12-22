package org.formation.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller extends Personne {
	
	
     private String login;
	
	private String motDePasse;
	
	@Embedded
	private Adresse adresse;


	@OneToMany(mappedBy = "conseiller", cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Set<Client> clients = new HashSet<>();
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Gerant gerant;
	
	
	
	public Conseiller() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}




	
	
	
	

}
