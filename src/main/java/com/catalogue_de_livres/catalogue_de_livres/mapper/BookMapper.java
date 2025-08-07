package com.catalogue_de_livres.catalogue_de_livres.mapper;


import com.catalogue_de_livres.catalogue_de_livres.dto.BookDto;
import com.catalogue_de_livres.catalogue_de_livres.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto toDto(Book book);
    Book toEntity(BookDto dto);
}
