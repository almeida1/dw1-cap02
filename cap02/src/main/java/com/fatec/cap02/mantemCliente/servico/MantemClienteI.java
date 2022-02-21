package com.fatec.cap02.mantemCliente.servico;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.cap02.mantemCliente.model.Cliente;
import com.fatec.cap02.ports.ClienteRepository;
import com.fatec.cap02.ports.MantemCliente;

@Service
public class MantemClienteI implements MantemCliente {
	@Autowired
	ClienteRepository repository;
	Logger logger = LogManager.getLogger(this.getClass());
	public List<Cliente> consultaTodos() {
		logger.info(">>>>>> servico consultaTodos chamado");
		return repository.findAll();
	}
	@Override
	public Optional<Cliente> consultaPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Cliente> consultaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cliente altera(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
}
