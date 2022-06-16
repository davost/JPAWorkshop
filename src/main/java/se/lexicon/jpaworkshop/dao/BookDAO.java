package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entity.Book;

import java.util.Collection;

public interface BookDAO {

    Book findById(int bookId);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void delete(Book book);
}
