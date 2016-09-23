package task0_Abiturient;

import java.util.Arrays;

public class Abiturient {
	
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private int number;
	private int [] marks;
	public  Abiturient (String surname, String name, String patronymic, String adress, int number,int []marks){
		this.surname=surname;
		this.name=name;
		this.patronymic=patronymic;
		this.adress=adress;
		this.number=number;
		this.marks=marks;
		}
	public Abiturient() {
		this.surname="Kanevska";
		this.name="Ann";
		this.patronymic="Grigorievna";
		this.adress="str. Kosmichna 67";
		this.number= (int)(Math.random()*10000000+1);
		this.marks= new int []{12, 10,12,11,11,12};
	}
	public String getAdress() {
		return adress;
	}
	public int[] getMarks() {
		return marks;
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
	 public void setMarks(int[] marks) {
		this.marks = marks;
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
	 // печать оценок
	 public String toStringMas(){
		 String MarksString="";
		 for(int i = 0; i < this.marks.length ; i++) {
			 MarksString=MarksString+this.marks[i] + ", ";
			}
		 return MarksString;
	 }
@Override
public String toString() {
	return "Student: ФИО "+ surname+" "+name+" "+patronymic+", "+
			"Адрес "+adress+","+"Номер телефона "+number+", "+"Оценки: "+ "["+toStringMas()+"]" ;
}
// Cписок абитуриентов с неудовлетвроительными оценками	
public static void neud(Abiturient[] mas){
		 int count=0;
		 for (int i=0;i<mas.length;i++){
			 for(int j=0;j<mas[i].marks.length;j++){
				 if(mas[i].marks[j]<6){count++;}
			 }
			 if (count!=0){
				 System.out.println(mas[i].toString());
				 count=0;
			 }
		 } 
	 }
// сумма всех оценок 1го абитуриента	 
	 public static int sum(int[] mas){
		int sum=0;
		 for (int i=0;i<mas.length;i++){
			 sum+=mas[i];
		 }
		 return sum;
	 }
	 // Массив сумм баллов
	/* public static int [] sumMas(Abiturient[] obj){
		 int []mas=new int [obj.length];
		 for(int i=0;i<obj.length;i++){
			mas[i]=sum(obj[i].Marks); 
		 }
		return mas; 
	 }*/
// список абитуриентов у которых сумма баллов выше заданной
	 public static void biggerSum(Abiturient[] mas,int sum){
		 for (int i=0;i<mas.length;i++){
			 if(sum(mas[i].marks)>sum){
				 System.out.println(mas[i].toString()+ " Общая сумма баллов: "+sum(mas[i].marks));}
		 }
		 
	 }
	 //вывести заданное число абитуриентов имеющие саму высокую  сумму былло в и вывести полный список абитуриентов с полупроходной суммой
	 public static void maxBal(Abiturient[] mas, int number){
		 //----------------------------Локальный класс----------------------------------
		 // класс выполняющий роль структуры (индекс-сумма) для сортировки по сумме 
		 //и дальнейшему  обращению по отсортированному полю класса
		  class SumMarks implements Comparable<SumMarks>{
			 int index;
			 int sum;
			public SumMarks(int i, int sum) {
				this.index=i;
				this.sum=sum;
			}
			public SumMarks() {
				this.index=0;
				this.sum=0;
			}
			
			 public int compareTo(SumMarks o) {
				 if (o.sum> this.sum) {
	                 return 1;
	             } else if (o.sum < this.sum) {
	                 return -1;
	             } else {
	                 return 0;
	             }
			}

			 //Отсортированный массив
			 public SumMarks[] sortMas(Abiturient [] obj){
				 SumMarks [] mas=new  SumMarks[obj.length];
				for(int i=0;i<obj.length;i++){
					mas[i]=new SumMarks(i,sum(obj[i].marks));
				//	mas[i].index=i;
					 //mas[i].sum=sum(obj[i].Marks);
					//System.out.println( mas[i].index);
				 }
				Arrays.sort(mas);
				
				 return mas;
			 }
			 
			 
		 }
		  //-----------------------------End-----------------------------------
		  
		  SumMarks obj=new SumMarks();
		  SumMarks[] sortMas=obj.sortMas(mas);
		  
		  
		  // ввыводит всех с наивысшим баллом
		  System.out.println("\t Абитуриенты с самым высоки количеством баллов ("+number+"):");
		  System.out.println();
		  for(int i=0; i<number; i++){
			  System.out.println(mas[sortMas[i].index].toString()+sum(mas[sortMas[i].index].marks));  
		  }
		  System.out.println("\t Абитуриенты с полупроходной суммой баллов: ");
		  System.out.println();
		  for(int i=number; i<mas.length; i++){
			  if(sortMas[i].sum==sortMas[number-1].sum){
				  System.out.println(mas[sortMas[i].index].toString()+sum(mas[sortMas[i].index].marks)); 
			  }
			  else{break;}
		  }
	 }
}
