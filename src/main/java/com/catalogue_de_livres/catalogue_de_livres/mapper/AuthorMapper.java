package com.catalogue_de_livres.catalogue_de_livres.mapper;


import com.catalogue_de_livres.catalogue_de_livres.dto.AuthorDto;
import com.catalogue_de_livres.catalogue_de_livres.entity.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorDto toDto(Author author);
    Author toEntity(AuthorDto dto);

}
