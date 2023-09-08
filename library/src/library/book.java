package library;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class book {

	private String title;
	private String author;
	private String publication_year;
	private String ISBN;
	
	@Id
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(String publication_year) {
		this.publication_year = publication_year;
	}
	
	@Override
	public String toString() {
		return "Book [Title=" + title + ", author=" + author + ", publication_year=" + publication_year + ", ISBN="
				+ ISBN + "]";
	}
	
}
