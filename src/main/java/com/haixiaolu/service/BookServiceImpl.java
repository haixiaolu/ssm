package com.haixiaolu.service;

import com.haixiaolu.controller.Code;
import com.haixiaolu.dao.BookDao;
import com.haixiaolu.domain.Book;
import com.haixiaolu.exception.BusinessException;
import com.haixiaolu.exception.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }

    public Book getById(Integer id) {
        // 模拟业务异常， 包装成自定义异常
        if(id < 0){
            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术挑战我的耐心！");
        }
        return bookDao.getById(id);
    }
}
