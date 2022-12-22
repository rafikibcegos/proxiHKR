package com.proxibanque.server.service;

import java.util.List;

import org.formation.entity.Conseiller;


public interface IConseillerService {
	public Conseiller addConseiller(Conseiller conseiller);
	public List<Conseiller> getConseillers();
	public Conseiller updateConseiller(Conseiller conseiller);
	public void deleteConseiller(Long id);
}
