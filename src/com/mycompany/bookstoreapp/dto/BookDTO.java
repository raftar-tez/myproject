package com.mycompany.bookstoreapp.dto;

public class BookDTO {
	 private long bookId;
	 private String name;
	 private String description;
	 private Double priceperQty;
	 private int availableQty;
	 private String authorName;
	 private String authorEmail;
	 public long getBookId() {
		 return bookId;
	 }
	 public void setBookId(long bookId) {
		 this.bookId = bookId;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public Double getPriceperQty() {
		 return priceperQty;
	 }
	 public void setPriceperQty(Double priceperQty) {
		 this.priceperQty = priceperQty;
	 }
	 public int getAvailableQty() {
		 return availableQty;
	 }
	 public void setAvailableQty(int availableQty) {
		 this.availableQty = availableQty;
	 }
	 public String getAuthorName() {
		 return authorName;
	 }
	 public void setAuthorName(String authorName) {
		 this.authorName = authorName;
	 }
	 public String getAuthorEmail() {
		 return authorEmail;
	 }
	 public void setAuthorEmail(String authorEmail) {
		 this.authorEmail = authorEmail;
	 }
	 
}
