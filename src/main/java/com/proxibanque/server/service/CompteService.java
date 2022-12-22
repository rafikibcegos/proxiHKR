package com.proxibanque.server.service;

import org.formation.entity.Client;
import org.formation.entity.Compte;
import org.formation.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.proxibanque.server.entity.Client;
//import com.proxibanque.server.entity.Compte;
//import com.proxibanque.server.repository.ICompteCourantRepository;
//import com.proxibanque.server.repository.ICompteEpargneRepository;
//import com.proxibanque.server.repository.ICompteRepository;


@Service
public class CompteService implements ICompteService {

	
	@Autowired
	CompteRepository compteRepository;
	
	
	
	
	@Autowired
	ClientService clientService;
	
//	@Override
//	public CompteCourant getCompteCourantById(Long id) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.findById(id).get();
//	}
//
//	@Override
//	public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.save(compteCourant);
//	}
//
//	@Override
//	public CompteEpargne getCompteEpargneById(Long id) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.findById(id).get();
//	}
//
//	@Override
//	public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}
//
//	@Override
//	public void deleteCompteCourant(Long id) {
//		// TODO Auto-generated method stub
//		compteCourantRepository.deleteById(id);
//		//compteRepository.deleteById(id);
//	}
//
//	@Override
//	public void deleteCompteEpargne(Long id) {
//		// TODO Auto-generated method stub
//		//compteRepository.deleteById(id);
//		compteEpargneRepository.deleteById(id);
//	}
//
//	@Override
//	public CompteCourant addCompteCourant(CompteCourant compteCourant) {
//		// TODO Auto-generated method stub
//		return compteCourantRepository.save(compteCourant);
//	}
//
//	@Override
//	public CompteEpargne addCompteEpargne(CompteEpargne compteEpargne) {
//		// TODO Auto-generated method stub
//		return compteEpargneRepository.save(compteEpargne);
//	}

	@Override
	public Compte addCompte(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public Compte geCompteById(Long id) {
		return compteRepository.findById(id).get();
	}

//	@Override
//	public Compte updateCompte(Client client) {
		// TODO Auto-generated method stub
		
//		return compteRepository.save(client.get
//	}

	@Override
	public void deleteCompte(Long id) {
		compteRepository.deleteById(id);
	}

}
