package com.fatec.cap02.mantemCliente.servico;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fatec.cap02.mantemCliente.model.Cliente;
import com.fatec.cap02.ports.MantemCliente;

@Configuration
class LoadDatabase {
	@Bean
	CommandLineRunner initDatabase(MantemCliente mantemCliente) {
		Logger log = LogManager.getLogger(this.getClass());
		return args -> {
			Cliente cliente1 = new Cliente("Miguel Soares", "10/02/1960", "M", "99504993052", "04280130", "2983");
			log.info("Preloading " + mantemCliente.save(cliente1));

			Cliente cliente2 = new Cliente("Marcos Silva", "04/10/1974", "M", "43011831084", "08545160", "2983");
			log.info("Preloading " + mantemCliente.save(cliente2));
		};
	}
}
