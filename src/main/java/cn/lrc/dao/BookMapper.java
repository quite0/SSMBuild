package cn.lrc.dao;


import cn.lrc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Title: BookMapper
 * @Description TODO
 * @ProjectName: ssmbuild
 * @Author: lrc2020
 * @Date 2022/6/13 20:15
 * @Version 1.0
 */
public interface BookMapper {
    //增
    int addBook(Books books);

    //删
    int deleteBookById(@Param("bookId") int id);

    //改
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部
    List<Books> queryAllBook();
}
