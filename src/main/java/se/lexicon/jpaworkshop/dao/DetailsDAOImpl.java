package se.lexicon.jpaworkshop.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.jpaworkshop.entity.Details;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class DetailsDAOImpl implements DetailsDAO {
    @Override
    public Details findById(int detailsId) {
        return null;
    }

    @Override
    public Collection<Details> findAll() {
        return null;
    }

    @Override
    public Details create(Details details) {
        return null;
    }

    @Override
    public Details update(Details details) {
        return null;
    }

    @Override
    public void delete(Details details) {

    }

//public class DetailsDAOImpl /*implements DetailsDAO*/ {
/*
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Details create(Details details) {
        entityManager.persist(details);
        return details;
    }
    @Override
    @Transactional
    public Details findById(int detailsId) {
        Details details = entityManager.find(Details.class, detailsId);
        return details;
    }

    @Override
    public Collection<Details> findAll() {
        return null;
    }

    @Override
    public Details create() {
        return null;
    }

    @Override
    public Details update() {
        return null;
    }

    @Override
    public void delete() {

    }*/
}
