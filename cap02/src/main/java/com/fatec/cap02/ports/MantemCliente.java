package com.fatec.cap02.ports;

import java.util.List;
import java.util.Optional;

import com.fatec.cap02.mantemCliente.model.Cliente;

public interface MantemCliente {
	List<Cliente> consultaTodos();
	Optional<Cliente> consultaPorCpf(String cpf);
	Optional<Cliente> consultaPorId(Long id);
	Cliente save(Cliente cliente);
	void delete (Long id);
	Cliente altera ( Cliente cliente);
}
