package session4.ui_driver_adapter;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import session4.core.domain.BookDoesNotExistException;
import session4.core.driver_ports.*;

@RestController
public class BookController {
	@Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ResponseEntity getBook(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(bookService.getBook(id));
        } catch (BookDoesNotExistException e){
            return ResponseEntity.ok("We don't have this book!");
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
