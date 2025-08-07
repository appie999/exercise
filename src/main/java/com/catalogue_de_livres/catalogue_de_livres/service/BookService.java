package com.catalogue_de_livres.catalogue_de_livres.service;

import com.catalogue_de_livres.catalogue_de_livres.dto.BookDto;
import com.catalogue_de_livres.catalogue_de_livres.entity.Book;
import com.catalogue_de_livres.catalogue_de_livres.mapper.BookMapper;
import com.catalogue_de_livres.catalogue_de_livres.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    @Autowired
    private BookMapper mapper;


    public BookDto saveBook(BookDto dto){
        return mapper.toDto(repo.save(mapper.toEntity(dto)));
    }

    public List<BookDto> getAllBooks(){
        return repo.findAll().stream().map(book -> mapper.toDto(book)).toList();
    }

    public BookDto getBookById(Long id){
        return mapper.toDto(repo.findById(id).orElseThrow(()->new RuntimeException("book not found")));
    }

    public void deleteBook(Long id){
        repo.deleteById(id);
    }

    public BookDto editBookInfo(Long id , BookDto dto){
        Book book = repo.findById(id).get();
        book.setId(dto.getId());
        book.setTitle(dto.getTitle());
        book.setIsbn(book.getIsbn());

        return mapper.toDto(repo.save(book));
    }
}
