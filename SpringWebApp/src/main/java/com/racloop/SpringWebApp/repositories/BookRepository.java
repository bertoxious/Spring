package com.racloop.SpringWebApp.repositories;

import com.racloop.SpringWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
