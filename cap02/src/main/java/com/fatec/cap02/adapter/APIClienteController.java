package com.fatec.cap02.adapter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.cap02.mantemCliente.model.Cliente;
import com.fatec.cap02.ports.MantemCliente;

@RestController
@RequestMapping("/api/v1/clientes")
public class APIClienteController {
	Logger logger = LogManager.getLogger(this.getClass());
	@Autowired
	MantemCliente servico;

	@GetMapping
	public ResponseEntity<List<Cliente>> consultaTodos() {
		logger.info(">>>>>> controller consulta todos chamado");
		List<Cliente> listaDeClientes = new ArrayList<Cliente>();
		servico.consultaTodos().forEach(listaDeClientes::add);
		if (listaDeClientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(listaDeClientes, HttpStatus.OK);
	}
}
