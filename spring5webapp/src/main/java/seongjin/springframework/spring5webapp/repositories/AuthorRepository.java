package seongjin.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import seongjin.springframework.spring5webapp.model.Author;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
