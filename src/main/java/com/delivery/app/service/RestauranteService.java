package com.delivery.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.app.entity.Restaurante;
import com.delivery.app.repository.IRestauranteRepository;

@Service
public class RestauranteService {

	@Autowired
	private IRestauranteRepository restauranteRepository;
	
	public List<Restaurante> listarRestaurantes() {
		
		return restauranteRepository.findAll();
		
	}
	
	public Restaurante findById(Long id) {
		Optional<Restaurante> restaurante = restauranteRepository.findById(id);
		
		if (restaurante.isPresent()) {
			return restaurante.get();
		}
		
		throw new RuntimeException("Restaurante não encontrado");
	}
	
}
