package task0_Car;

import task0_Book.Book;

public class Car {
private int id;
private String brand;
private String model;
private int year;
private String color;
private  int price;
private String number;

public Car() {
	id=1;
	brand="honda";
	model="civic";
	year=2013;
	color="черный";
	price=625000;
	number="AX9999AX";
			}

public Car(int id,String brand, String model,int year,String color,int price,String number) {
	this.id=id;
	this.brand=brand;
	this.model=model;
	this.year=year;
	this.color=color;
	this.price=price;
	this.number=number;
}

@Override
public String toString(){
	return  "Car: Id "+id +brand+" "+model+". Год выпуска "+ year+". Цвет "+color+". Стоимость "+price+" грн. Номер "+number;
}


public String getBrand() {
	return brand;
}
public String getColor() {
	return color;
}
public int getId() {
	return id;
}
public String getModel() {
	return model;
}
public String getNumber() {
	return number;
}
public int getPrice() {
	return price;
}
public int getYear() {
	return year;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public void setColor(String color) {
	this.color = color;
}
public void setId(int id) {
	this.id = id;
}
public void setModel(String model) {
	this.model = model;
}
public void setNumber(String number) {
	this.number = number;
}
public void setPrice(int price) {
	this.price = price;
}
public void setYear(int year) {
	this.year = year;
}


public static void CarBrand(Car [] mas, String brand){
	for(int i=0; i<mas.length;i++){
		if(mas[i].brand==brand){
			System.out.println(mas[i].toString());
		}
	}
}
public static void CarBrandYear(Car [] mas, String brand, int n){
	for(int i=0; i<mas.length;i++){
		if(mas[i].brand==brand && (2016-mas[i].year)>n){
			System.out.println(mas[i].toString());
		}
	}
}
public static void CarPriceYear(Car [] mas, int year, int price){
	for(int i=0; i<mas.length;i++){
		if(mas[i].year==year && mas[i].price>price){
			System.out.println(mas[i].toString());
		}
	}
}




}
