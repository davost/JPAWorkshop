package se.lexicon.jpaworkshop.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.jpaworkshop.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class AuthorDAOImpl implements AuthorDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Author findById(int authorId) { return (entityManager.find(Author.class, authorId)); }

    @Override
    public Collection<Author> findAll() {
        Query query = entityManager.createQuery("SELECT s from Author s");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Author create(Author author) {
       entityManager.persist(author);
       return author;
    }

    @Override
    @Transactional
    public Author update(Author author) { return entityManager.merge(author); }

    @Override
    @Transactional
    public void delete(Author author) {
    if (author.getAuthorId() == 0 ) throw new IllegalArgumentException("Author not found.");
    entityManager.remove(author);
    }
}
