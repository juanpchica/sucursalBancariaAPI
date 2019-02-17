package com.sucursalBancaria.sucursalBancaria.Clients.entity.services;

import java.util.List;

import com.sucursalBancaria.sucursalBancaria.Clients.entity.models.Client;

public interface IClientService {
	public Client get(long id);
	public List<Client> getAll();
	public void post(Client client);
	public void put(Client client, long id);
	public void delete(long id);
}