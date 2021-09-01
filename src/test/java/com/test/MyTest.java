package com.test;

import com.bean.Books;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Description
 * Author AJAXXJ
 * Date 2021/08/30/下午9:10
 * Version 1.0
 */
public class MyTest {
	@Test
	public void test1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
		BookService bookServiceImpl =(BookService) context.getBean("bookServiceImpl");
		for (Books books:bookServiceImpl.queryAllBooks()
			 ) {
			System.out.println(books);
		}
	}
}
