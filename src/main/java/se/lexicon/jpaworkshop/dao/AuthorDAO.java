package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entity.Author;

import java.util.Collection;

public interface AuthorDAO {

    Author findById(int authorId);
    Collection<Author> findAll();
    Author create(Author author);
    Author update(Author author);
    void delete(Author author);

}
