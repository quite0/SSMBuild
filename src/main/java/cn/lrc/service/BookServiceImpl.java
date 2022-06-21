package cn.lrc.service;

import cn.lrc.dao.BookMapper;
import cn.lrc.pojo.Books;

import java.util.List;

/**
 * @Title: BookServiceImpl
 * @Description TODO
 * @ProjectName: ssmbuild
 * @Author: lrc2020
 * @Date 2022/6/13 20:40
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
