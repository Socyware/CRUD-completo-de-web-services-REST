package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;

import dto.ClientDTO;
import services.ClientService;

public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public Page<ClientDTO> indAll(Pegeable pegeable){
		return service.findAll(pegeable);
		
	} 

	
}
