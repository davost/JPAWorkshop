package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entity.Details;

import java.util.Collection;

public interface DetailsDAO {

    Details findById(int detailsId);
    Collection<Details> findAll();
    Details create(Details details);
    Details update(Details details);
    void delete(Details details);

    }
