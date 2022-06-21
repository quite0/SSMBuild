package cn.lrc.service;

import cn.lrc.pojo.Books;

import java.util.List;

/**
 * @Title: BookService
 * @Description TODO
 * @ProjectName: ssmbuild
 * @Author: lrc2020
 * @Date 2022/6/13 20:37
 * @Version 1.0
 */
public interface BookService {
    public int addBook(Books books);

    public int deleteBookById(int id);

    public int updateBook(Books books);

    public Books queryBookById(int id);

    public List<Books> queryAllBook();
}
