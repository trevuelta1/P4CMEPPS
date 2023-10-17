package session4;
import org.springframework.context.annotation.*;

import session4.core.driven_ports.BookRepository;
import session4.core.driver_ports.BookService;
import session4.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
        }
}
