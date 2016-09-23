package task0_Book;

public class Book {
	private String title;
	private String author;
	private String publishingName;
	private int year;
	private int pageNumber;
	private double price;
	private String bindingType;
	
	public Book(String title, String author, String publishingName, int year, int pageNumber, double price, String bindingType) {
		this.title=title;
		this.author=author;
		this.publishingName=publishingName;
		this.year=year;
		this.pageNumber=pageNumber;
		this.price=price;
		this.bindingType=bindingType;
	}
	public Book() {
		this.title="Война и мир";
		this.author="Л. Н. Толстой";
		this.publishingName="Лексика";
		this.year=1996;
		this.pageNumber=1274;
		this.price= 7000.0;
		this.bindingType="твердый";
	}
	
	
	public String getBindingType() {
		return bindingType;
	}
	public String getAuthor() {
		return author;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public double getPrice() {
		return price;
	}
	public String getPublishingName() {
		return publishingName;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setpublishingName(String publishingName) {
		this.publishingName = publishingName;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book: Название \""+ title+"\", "+
				"автор "+author+", "+"издательство: \""+publishingName+"\", "+"год издания "
				+ year+", "+pageNumber+" стр."+ ", cтоимость: "+price+ "грн.  "+bindingType+" переплет.";
	}
	// Каталог авторов
	public static String[] catalogAuthor(Book[]obj){
		String[]mas=new String[obj.length];
		int control=0;
		int k=0;
		for(int i=0;i<obj.length;i++){
			if(k!=0){
				for(int j=0;j<k;j++){
					if(obj[i].author==mas[j]){
						control++;
					}
				}
			}
			if (control==0){mas[k]=obj[i].author;k++;}
			control=0;
		}
		return mas;
	}
	//вывод книг одного автора
	public static void booksAuthor(Book [] mas, String author){
		for(int i=0; i<mas.length;i++){
			if(mas[i].author==author){
				System.out.println(mas[i].toString());
			}
		}
	}
	//список книг заданного издательства
	public static void booksPublishingName(Book [] mas, String publishingName){
		for(int i=0; i<mas.length;i++){
			if(mas[i].publishingName==publishingName){
				System.out.println(mas[i].toString());
			}
		}
	}
	//книги, выпущенные после заданного года
	public static void booksYear(Book [] mas, int year){
		for(int i=0; i<mas.length;i++){
			if(mas[i].year>year){
				System.out.println(mas[i].toString());
			}
		}
	}
}
