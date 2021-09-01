package com.dao;

import com.bean.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午5:33
 * Version 1.0
 */
@Repository
public interface BookMapper {
	//增加一本书
	int addBook(Books books);
	//删除一本书
	int deleteBookById(@Param("bookId") Integer id);
	//更新一本书
	int updateBook(Books books);
	//查询一本书
	Books queryBookById(@Param("bookId")Integer id);
	//查询全部书
	List<Books> queryAllBooks();
	//根据书名查询
	Books queryBookByName(@Param("bookName") String bookName);
}
