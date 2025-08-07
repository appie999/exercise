package com.catalogue_de_livres.catalogue_de_livres.controller;

import com.catalogue_de_livres.catalogue_de_livres.dto.AuthorDto;
import com.catalogue_de_livres.catalogue_de_livres.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping
    public AuthorDto saveAuthor(@RequestBody AuthorDto dto){
        return service.saveAuthor(dto);
    }

    @GetMapping
    public List<AuthorDto> getAllAuthors(){
        return service.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorDto getAuthorById(@PathVariable Long id){
        return service.getAuthorById(id);
    }
}
