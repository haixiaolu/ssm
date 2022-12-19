package com.haixiaolu.service;

import com.haixiaolu.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean save(Book book);
    public boolean update(Book book);
    public boolean delete(Integer id);
    List<Book> getAll();
    Book getById(Integer id);

}
