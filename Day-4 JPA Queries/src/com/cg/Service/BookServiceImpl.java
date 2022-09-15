package com.cg.Service;

import java.util.List;

import com.cg.Dao.BookDao;
import com.cg.Dao.BookDaoImpl;
import com.cg.Entities.Book;

public class BookServiceImpl implements BookService{
	
	private BookDao dao;
	

	public BookServiceImpl() {
		super();
		dao=new BookDaoImpl();
	}

	@Override
	public Book getBookById(Integer id) {
		return dao.getBookById(id);
		
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksRange(Double low, Double high) {
		// TODO Auto-generated method stub
		return dao.getBooksRange(low, high);
	}

}
