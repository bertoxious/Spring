package com.racloop.SpringWebApp.repositories;

import com.racloop.SpringWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
