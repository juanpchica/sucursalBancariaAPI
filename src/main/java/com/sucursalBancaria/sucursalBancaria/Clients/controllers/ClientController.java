package com.sucursalBancaria.sucursalBancaria.Clients.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sucursalBancaria.sucursalBancaria.Clients.entity.models.Client;
import com.sucursalBancaria.sucursalBancaria.Clients.entity.services.IClientService;



@RestController
public class ClientController{
	
	@Autowired
	IClientService clientService;
	
	@GetMapping("/clients")
	public List<Client> getAllBicycles(){
		return clientService.getAll();
	}
	
	@GetMapping("/client/{id}")
	public Client getOne(@PathVariable(value = "id") long id) {
		return clientService.get(id);
	}
	
	@PostMapping("/client")
	public void add(Client client) {
		clientService.post(client);
	}
	
	@PutMapping("/client/{id}")
	public void update(Client client, @PathVariable(value = "id") long id) {
		clientService.put(client, id);
	}
	
	@DeleteMapping("/client/{id}")
	public void update(@PathVariable(value = "id") long id) {
		clientService.delete(id);
	}
}