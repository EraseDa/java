package day19;

import java.util.ArrayList;

public class Book {

	
	private String title, writer, publisher, category, isbn;
	private int price;

	public Book(String title, String writer, String publisher, String category, String isbn, int price) {
		
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.category = category;
		this.isbn = isbn;
		this.price = price;

	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
	
	
}

