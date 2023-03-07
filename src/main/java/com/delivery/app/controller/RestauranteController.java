package com.delivery.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.app.entity.Restaurante;
import com.delivery.app.service.RestauranteService;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

	@Autowired
	private RestauranteService restauranteService;
	
	@GetMapping
	@ResponseBody
	public List<Restaurante> listarRestaurantes() {
		return restauranteService.listarRestaurantes();
	}
	
	@GetMapping("/{id}")
	public Restaurante getRestaurante(@PathVariable Long id) {
		return restauranteService.findById(id);
	}
	
}
