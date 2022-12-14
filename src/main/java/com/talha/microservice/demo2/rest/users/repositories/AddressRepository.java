package com.talha.microservice.demo2.rest.users.repositories;

import com.talha.microservice.demo2.rest.users.entities.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
