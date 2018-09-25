package edu.chinna.kadira.books;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7865027846531797081L;

	String author;
	String country;
	String imageLink;
	String language;
	String link;
	int pages;
	String title;
	int year;

}
