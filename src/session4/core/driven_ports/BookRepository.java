package session4.core.driven_ports;

import session4.core.domain.*;

public interface BookRepository {
	Book findById(Long id);
}
