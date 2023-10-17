package session4.core.driver_ports;

import session4.core.domain.Book;
import session4.core.driven_ports.*;

public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;
	public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
	}
	@Override
	public Book getBook(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

}
