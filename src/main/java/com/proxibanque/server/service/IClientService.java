package com.proxibanque.server.service;

import java.util.List;

import org.formation.entity.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



public interface IClientService {
	public void createClient(Client client);
	public List<Client> getClients();
	public Client updateClient(Client client);
	public void deleteClient(Long id);
//	public CompteCourant addCompteCourant(CompteCourant compteCourant);
//	public CompteEpargne addCompteEpargne(CompteEpargne  compteEpargne );
//	public CompteCourant updateCompteCourant(CompteCourant compteCourant);
//	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne);
//	public CompteCourant getCompteCourantById(Long id);
//	public CompteEpargne getCompteEpargneById(Long id);
	
}
