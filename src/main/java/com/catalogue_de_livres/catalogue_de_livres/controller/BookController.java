package com.catalogue_de_livres.catalogue_de_livres.controller;

import com.catalogue_de_livres.catalogue_de_livres.dto.BookDto;
import com.catalogue_de_livres.catalogue_de_livres.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public BookDto saveBook(@RequestBody BookDto dto){
        return service.saveBook(dto);
    }

    @GetMapping
    public List<BookDto> getAllBook(){
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id){
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
    @PutMapping("/{id}")
    public BookDto editBook(@PathVariable Long id, @RequestBody BookDto dto){
        return service.editBookInfo(id, dto);
    }
}
