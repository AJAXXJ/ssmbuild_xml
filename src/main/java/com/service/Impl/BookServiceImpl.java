package com.service.Impl;

import com.bean.Books;
import com.dao.BookMapper;
import com.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午5:53
 * Version 1.0
 */
@Service
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
	public int deleteBookById(Integer id) {
		return bookMapper.deleteBookById(id);
	}

	@Override
	public int updateBook(Books books) {
		return bookMapper.updateBook(books);
	}

	@Override
	public Books queryBookById(Integer id) {
		return bookMapper.queryBookById(id);
	}

	@Override
	public List<Books> queryAllBooks() {
		return bookMapper.queryAllBooks();
	}

	@Override
	public Books queryBookByName(String bookName) {
		return bookMapper.queryBookByName(bookName);
	}

}