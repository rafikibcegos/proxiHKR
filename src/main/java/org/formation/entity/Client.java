 package org.formation.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
//@Table(name = "client")
@Component
public class Client extends Personne  {
	
	private String login;
	
	private String motDePasse;
	
	@Embedded
	private Adresse adresse;
	
	

	@ManyToOne
	private Conseiller conseiller;
	
	@OneToOne(mappedBy = "client", cascade = {CascadeType.ALL})
	private Compte compte;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "compte_id", referencedColumnName = "id")
//    private Compte compte;

	public Client() {}




	public Client(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}




	public Client(String login, String motDePasse, Adresse adresse, Conseiller conseiller, Compte compte) {
		this.login = login;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.conseiller = conseiller;
		this.compte = compte;
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




	public Conseiller getConseiller() {
		return conseiller;
	}




	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}




	public Compte getCompte() {
		return compte;
	}




	public void setCompte(Compte compte) {
		this.compte = compte;
	}




	@Override
	public String toString() {
		return "Client [login=" + login + ", motDePasse=" + motDePasse + ", adresse=" + adresse + ", conseiller="
				+ conseiller + ", compte=" + compte + "]";
	}

	







	

  
}
