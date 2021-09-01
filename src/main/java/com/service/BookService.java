package com.service;

import com.bean.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午5:52
 * Version 1.0
 */
public interface BookService {
	//增加一本书
	int addBook(Books books);
	//删除一本书
	int deleteBookById(Integer id);
	//更新一本书
	int updateBook(Books books);
	//查询一本书
	Books queryBookById(Integer id);
	//查询全部书
	List<Books> queryAllBooks();
	//根据书名查询
	Books queryBookByName(String bookName);
}
