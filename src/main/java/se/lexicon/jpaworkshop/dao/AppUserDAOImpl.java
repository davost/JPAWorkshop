package se.lexicon.jpaworkshop.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.jpaworkshop.entity.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

// why is the "implements" commented public class AppUserDAOImpl /*implements AppUserDAO*/ {
@Repository
public class AppUserDAOImpl implements AppUserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public AppUser findById(int appUserId) {
        return entityManager.find(AppUser.class, appUserId);
    }

    @Override
    public Collection<AppUser> findAll() {
        Query query = entityManager.createQuery("SELECT s FROM AppUser s");
        return query.getResultList();
    }

    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    @Transactional
    public AppUser update(AppUser appUser) { return entityManager.merge(appUser); }

    @Override
    @Transactional
    public void delete(AppUser appUser) {
        if (appUser.getAppUserId() == 0) throw  new IllegalArgumentException("AppUser not found.");
        entityManager.remove(appUser);
    }

}
