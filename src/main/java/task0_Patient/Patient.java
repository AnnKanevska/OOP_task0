package task0_Patient;

//import java.util.Date;
import java.util.Scanner;



public class Patient {
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private int number;
	private int medicalRecordNumber;
	private String diagnosis;
	
public Patient() {
	surname="Gdanov";
	name="Roman";
	patronymic="Vasilevna";
	adress="av. Lenina 78";
	number=7109639;
	medicalRecordNumber=123456;
	diagnosis="cold";
}
public  Patient (String surname, String name, String patronymic, String adress, int number, int medicalRecordNumber,String diagnosis) {
	this.surname=surname;
	this.name=name;
	this.patronymic=patronymic;
	this.adress=adress;
	this.number=number;
	this.medicalRecordNumber=medicalRecordNumber;
	this.diagnosis=diagnosis;
}
public String getAdress() {
	return adress;
}

public String getDiagnosis() {
	return diagnosis;
}  

public int getMedicalRecordNumber() {
	return medicalRecordNumber;
}
public String getName() {
	return name;
}
public int getNumber() {
	return number;
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
public void setDiagnosis(String diagnosis) {
	this.diagnosis = diagnosis;
}
public void setMedicalRecordNumber(int medicalRecordNumber) {
	this.medicalRecordNumber = medicalRecordNumber;
}
public void setName(String name) {
	this.name = name;
}
public void setNumber(int number) {
	this.number = number;
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
			"Адрес "+adress+","+"Телефон "+number+", "+"Номер медицинской карты "+medicalRecordNumber+", Диагноз "+ diagnosis;
}
// номер карты из промежутка
public static void numberFromGap(int a,int b, Patient [] mas){
	for(int i=0;i<mas.length;i++){
		if(mas[i].medicalRecordNumber<b && mas[i].medicalRecordNumber>a){
		System.out.println(mas[i].toString());
		}	
	}
}
//каталог диагнозов
public static int diagnos(String [] mas){
	System.out.println("Список диагнозов");
	for(int i=0;i<mas.length;i++){
		System.out.println((i+1)+mas[i]);
	}
		System.out.println("Введите номер выбранного диагноза");
		Scanner in = new Scanner(System.in);
		int choice=in.nextInt();
	return choice;
}

//пациенты с данным диагнозом
public static void getPatient(String  diagnosis, Patient [] mas){
	for(int i=0;i<mas.length;i++){
		if(mas[i].diagnosis==diagnosis){
			System.out.println(mas[i].toString());
		}
	}

}

}
