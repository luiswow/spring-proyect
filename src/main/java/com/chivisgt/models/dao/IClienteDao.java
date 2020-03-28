package com.chivisgt.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.chivisgt.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}
