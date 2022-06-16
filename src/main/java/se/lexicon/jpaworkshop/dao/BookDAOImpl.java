package se.lexicon.jpaworkshop.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//import se.lexicon.jpaworkshop.entity.AppUser;
import se.lexicon.jpaworkshop.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class BookDAOImpl implements BookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book findById(int bookId) { return entityManager.find(Book.class, bookId); }

    @Override
    public Collection<Book> findAll() {
        Query query = entityManager.createQuery("SELECT s FROM Book s");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Book create(Book book) {
        entityManager.persist(book);
        return book;
    }

    @Override
    @Transactional
    public Book update(Book book) { return entityManager.merge(book); }

    @Override
    @Transactional
    public void delete(Book book) {
        if (book.getBookId() == 0) throw new IllegalArgumentException("Book not found");
        entityManager.remove(book);
    }
}
