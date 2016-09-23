package task0_Customer;

//import java.util.Random;


public class Customer implements Comparable<Customer>{
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private int creditCardNumber;
	private int bankAccountNumber;
	

public  Customer (String surname, String name, String patronymic, String adress, int creditCardNumber,int bankAccountNumber){
	this.surname=surname;
	this.name=name;
	this.patronymic=patronymic;
	this.adress=adress;
	this.creditCardNumber=creditCardNumber;
	this.bankAccountNumber=bankAccountNumber;
	}
public Customer() {
	this.surname="Kanevska";
	this.name="Ann";
	this.patronymic="Grigorievna";
	this.adress="str. Kosmichna 67";
	this.creditCardNumber= (int)(Math.random()*1000000000+1);
	this.bankAccountNumber=(int)(Math.random()*1000000000+1);
}

public String getAdress() {
	return adress;
}
public double getBankAccountNumber() {
	return bankAccountNumber;
}
public double getCreditCardNumber() {
	return creditCardNumber;
} 
public String getName() {
	return name;
}
public String getPatronymic() {
	return patronymic;
}
public String getSurname() {
	return surname;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public void setBankAccountNumber(int bankAccountNumber) {
	this.bankAccountNumber = bankAccountNumber;
}
public void setCreditCardNumber(int creditCardNumber) {
	this.creditCardNumber = creditCardNumber;
}
public void setName(String name) {
	this.name = name;
}
public void setPatronymic(String patronymic) {
	this.patronymic = patronymic;
}
public void setSurname(String surname) {
	this.surname = surname;
}

@Override
public String toString() {

	return "Student: ФИО "+ surname+" "+name+" "+patronymic+", "+
			"Адрес "+adress+","+"Номер кредитной карточки "+creditCardNumber+", "+"Номер банковского счета "+ bankAccountNumber;
}
//для вывода в алфавитном порядке
public int compareTo(Customer obj) {
	return this.surname.compareTo(obj.surname);
}
// покупатели, номер карточки из промежутка
public static void numberFromGap(long a,long b, Customer [] mas){
	for(int i=0;i<mas.length;i++){
		if(mas[i].creditCardNumber<b && mas[i].creditCardNumber>a){
		System.out.println(mas[i].toString());
		}
		
	}
}



}