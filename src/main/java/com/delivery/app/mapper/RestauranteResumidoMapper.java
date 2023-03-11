package com.delivery.app.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.delivery.app.dto.RestauranteResumidoDTO;
import com.delivery.app.entity.Restaurante;

@Component
public class RestauranteResumidoMapper {
	
	@Autowired
	private ModelMapper mapper;

	public RestauranteResumidoDTO map(Restaurante restaurante) {
		
//		RestauranteResumidoDTO dto = new RestauranteResumidoDTO();
//		dto.setId(restaurante.getId());
//		dto.setNome(restaurante.getNome());
		
		RestauranteResumidoDTO dto = mapper.map(restaurante, RestauranteResumidoDTO.class);

		return dto;
	}

	public List<RestauranteResumidoDTO> map(List<Restaurante> restaurantes) {

		return restaurantes.stream().map(restaurante -> map(restaurante)).toList();

	}

}
