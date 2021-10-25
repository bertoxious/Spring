package com.racloop.SpringWebApp.bootstrap;

import com.racloop.SpringWebApp.domain.Author;
import com.racloop.SpringWebApp.domain.Book;
import com.racloop.SpringWebApp.domain.Publisher;
import com.racloop.SpringWebApp.repositories.AuthorRepository;
import com.racloop.SpringWebApp.repositories.BookRepository;
import com.racloop.SpringWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");


        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("London");
        publisher.setState("New York");

        Publisher saved = publisherRepository.save(publisher);

        System.out.println("Publisher Repository Count: "+publisherRepository.count());
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1233456");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(saved);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","23412411234");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(saved);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of books: "+ bookRepository.count());
        System.out.println("Publisher Number of Books: "+publisher.getBooks().size());

    }
}
