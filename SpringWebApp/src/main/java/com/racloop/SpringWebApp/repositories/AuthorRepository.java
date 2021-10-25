package com.racloop.SpringWebApp.repositories;

import com.racloop.SpringWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
