package com.delivery.app.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.delivery.app.dto.RestauranteInputDTO;
import com.delivery.app.entity.Restaurante;

@Component
public class RestauranteInputMapper {

	@Autowired
	private ModelMapper mapper;

	public Restaurante map(RestauranteInputDTO dto) {

		Restaurante restaurante  = mapper.map(dto, Restaurante.class);

		return restaurante;
	}

	public List<Restaurante> map(List<RestauranteInputDTO> dtos) {

		return dtos.stream().map(dto -> map(dto)).toList();

	}

}
