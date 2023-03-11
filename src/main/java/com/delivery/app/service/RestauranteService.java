package com.delivery.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.app.entity.Restaurante;
import com.delivery.app.exception.NotFoundException;
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

		if (restaurante.isEmpty()) {
			throw new NotFoundException("Restaurante não encontrado");
		}

		return restaurante.get();
	}

	public Restaurante create(Restaurante restaurante) {

		return restauranteRepository.save(restaurante);

	}

}
