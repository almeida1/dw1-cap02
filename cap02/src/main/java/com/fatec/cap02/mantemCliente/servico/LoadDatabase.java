package com.fatec.cap02.mantemCliente.servico;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fatec.cap02.mantemCliente.model.Cliente;
import com.fatec.cap02.ports.ClienteRepository;

@Configuration
class LoadDatabase {
	@Bean
	CommandLineRunner initDatabase(ClienteRepository repository) {
		Logger log = LogManager.getLogger(this.getClass());
		return args -> {
			Cliente cliente1 = new Cliente("Miguel Soares", "10/02/1960", "M", "99504993052", "04280130", "2983");
			cliente1.setDataCadastro("22/02/2022");
			cliente1.setEndereco("Rua Frei Joao");
			log.info("Preloading " + repository.save(cliente1));

			Cliente cliente2 = new Cliente("Marcos Silva", "04/10/1974", "M", "43011831084", "08545160", "2983");
			cliente2.setDataCadastro("22/02/2022");
			cliente2.setEndereco("Av. Paulista");
			log.info("Preloading " + repository.save(cliente2));
		};
	}
}
