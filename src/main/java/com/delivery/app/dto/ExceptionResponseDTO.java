package com.delivery.app.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ExceptionResponseDTO {
    
    private Integer status;

    private String mensagem;
    
    private List<Erro> validacoes;
    
    @Data
    public static class Erro {
    	
    	private String campo;
    	
    	private String erro;
    	
    }

}
