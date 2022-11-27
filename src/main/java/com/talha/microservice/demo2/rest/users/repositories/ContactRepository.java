package com.talha.microservice.demo2.rest.users.repositories;

import com.talha.microservice.demo2.rest.users.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
