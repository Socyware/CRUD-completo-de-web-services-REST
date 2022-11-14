package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;

import dto.ClientDTO;
import entities.Client;
import repositories.ClientRepository;

public class ClientService {
	
	@Autowired
	private ClientRepository repository ;

	@GetMapping
	public Page <Client>  findAll (Pegeable pageable) {
		Page<Client> result = repository.findAll(pegeable);
		Page<ClientDTO> page = result.map( x -> ClientDTO (x));
		return page;

	}   
	
	
}
