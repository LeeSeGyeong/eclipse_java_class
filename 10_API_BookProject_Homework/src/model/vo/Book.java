package model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Boram
 *
 */
public class Book {
	
	private String title;		// ����
	private String author;		// ����
	private String publisher;	// ���ǻ�
	private Date publishDate;	// ������
	private int price;			// ����
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, Date publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		// publishDate�ʵ忡 ��� Date��ü "yyyy�� MM�� dd��" �������� ���� ������� �ϴ��� �ּ��� �ݿ���Ű�ÿ�
		Date date1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��"); 
		String simpledate = sdf.format(date1);
		
		// �ڵ� �ۼ�
		
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate="
				+ simpledate + ", price=" + price + "]";
	}

}