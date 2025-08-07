package com.catalogue_de_livres.catalogue_de_livres.repository;

import com.catalogue_de_livres.catalogue_de_livres.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
