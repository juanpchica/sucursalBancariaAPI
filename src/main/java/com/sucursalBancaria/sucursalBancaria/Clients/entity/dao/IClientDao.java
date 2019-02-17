package com.sucursalBancaria.sucursalBancaria.Clients.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.sucursalBancaria.sucursalBancaria.Clients.entity.models.Client;

public interface IClientDao extends CrudRepository<Client, Long> {
	
}