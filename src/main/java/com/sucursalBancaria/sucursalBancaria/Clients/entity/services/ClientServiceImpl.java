package com.sucursalBancaria.sucursalBancaria.Clients.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sucursalBancaria.sucursalBancaria.Clients.entity.dao.IClientDao;
import com.sucursalBancaria.sucursalBancaria.Clients.entity.models.Client;

@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientDao clientDao;
	
	@Override
	public Client get(long id) {
		return clientDao.findById(id).get();
	}

	@Override
	public List<Client> getAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	public void post(Client client) {
		clientDao.save(client);
		
	}

	@Override
	public void put(Client client, long id) {
		clientDao.findById(id).ifPresent((x)->{
			client.setId(id);
			clientDao.save(client);
		});
	}

	@Override
	public void delete(long id) {
		clientDao.deleteById(id);
	}

}