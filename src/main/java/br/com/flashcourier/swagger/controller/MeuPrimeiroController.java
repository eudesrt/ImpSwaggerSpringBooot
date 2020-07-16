package br.com.flashcourier.swagger.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@CrossOrigin(origins = "*")
@RestController

@RequestMapping(value="/api")
@Api(tags = {"CONSULTA MUNDO2"} , description = "Consulta o mundo ")

public class MeuPrimeiroController {
	
	
	@ApiOperation(value="Retorna uma lista de Produtos")
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Retorna a lista de pessoa"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
		})
	@GetMapping(value="/mundo")
	public String mundo() {
		
		
		return "ola Mundo";
	}

}
