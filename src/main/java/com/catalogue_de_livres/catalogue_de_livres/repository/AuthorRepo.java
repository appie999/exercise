package com.catalogue_de_livres.catalogue_de_livres.repository;

import com.catalogue_de_livres.catalogue_de_livres.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Long> {
}
