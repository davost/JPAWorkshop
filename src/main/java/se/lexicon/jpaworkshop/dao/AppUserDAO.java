package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entity.AppUser;

import java.util.Collection;

public interface AppUserDAO {

    AppUser findById(int appUserId);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update(AppUser appUser);
    void delete(AppUser appUser);

}
