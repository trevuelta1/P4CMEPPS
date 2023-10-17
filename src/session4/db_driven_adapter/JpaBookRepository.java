package session4.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import session4.core.domain.Book;
import session4.core.domain.BookDoesNotExistException;
import session4.core.driven_ports.BookRepository;
import session4.db_driven_adapter.domain.*;
import session4.db_driven_adapter.jparepository.*;

@Component
public class JpaBookRepository implements BookRepository {

	@Autowired //enlaza repositorio y servicio
	private HAAJpaRepository haaJpaRepository;
	@Override
	public Book findById(Long id) {
		Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
		BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
		return bookEntity.toBook();
	}

}
