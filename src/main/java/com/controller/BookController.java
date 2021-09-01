package com.controller;

import com.bean.Books;
import com.service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午7:03
 * Version 1.0
 */
@Controller
public class BookController {
	@Autowired
	@Qualifier("bookServiceImpl")
	private BookServiceImpl bookService;
	//查询全部书籍并返回到一个书籍展示页面
	@RequestMapping("/queryAllBook")
	public String queryAllBook(Model model){
		List<Books> books = bookService.queryAllBooks();
		model.addAttribute("books",books);
		return "list";
	}
	//增加书籍
	@RequestMapping("/addBook")
	public String addBook(Books books){
		System.out.println(books);
		bookService.addBook(books);
		return "redirect:/queryAllBook";
	}
	//跳转到修改书籍页面
	@RequestMapping("/updateBookPage/{id}")
	public String updateBookPage(@PathVariable("id") String id,Model model){
		Books books = bookService.queryBookById(Integer.valueOf(id));
		model.addAttribute("books",books);
		return "updateBook";
	}
	//修改书籍
	@RequestMapping("/updateBook")
	public String updateBook(Books books){
		System.out.println(books);
		bookService.updateBook(books);
		return "redirect:/queryAllBook";
	}
	//删除书籍
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") String id){
		bookService.deleteBookById(Integer.valueOf(id));
		return "redirect:/queryAllBook";
	}
	//查询书籍
	@RequestMapping("/queryBookByName")
	public String queryBookByName(String bookName,Model model){
		Books book = bookService.queryBookByName(bookName);
		List<Books> books=new ArrayList<>();
		books.add(book);
		if (book==null){
			books=bookService.queryAllBooks();
			model.addAttribute("error","未查到");
		}
		model.addAttribute("books",books);
		return "list";
	}
}
