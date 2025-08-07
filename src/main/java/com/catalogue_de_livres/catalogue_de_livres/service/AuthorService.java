package com.catalogue_de_livres.catalogue_de_livres.service;

import com.catalogue_de_livres.catalogue_de_livres.dto.AuthorDto;
import com.catalogue_de_livres.catalogue_de_livres.mapper.AuthorMapper;
import com.catalogue_de_livres.catalogue_de_livres.repository.AuthorRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorMapper mapper;

    private final AuthorRepo repo;

    public AuthorService(AuthorMapper mapper, AuthorRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }

    public AuthorDto saveAuthor ( AuthorDto dto){
        return mapper.toDto(repo.save(mapper.toEntity(dto)));
    }

    public List <AuthorDto> getAllAuthors(){
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    public AuthorDto getAuthorById(Long id){
        return mapper.toDto(repo.findById(id).orElseThrow(()->new RuntimeException("author not found")));
    }

}
