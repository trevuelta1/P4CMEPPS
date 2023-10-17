package session4.db_driven_adapter.domain;

import javax.persistence.*;

import session4.core.domain.*;

@Entity
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name")
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Book toBook(){
		return new Book(this.id, this.name);   
	}
}
