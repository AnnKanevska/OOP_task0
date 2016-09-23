package App;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import task0_Abiturient.Abiturient;
import task0_Book.Book;
import task0_Car.Car;
import task0_Customer.Customer;
import task0_House.House;
import task0_Patient.Patient;
import task0_Student.Student;

public class App {
	 public static void main(String[] args) {
boolean ch=true;
do{ System.out.println("\t МЕНЮ");
System.out.println("1-Студент");
System.out.println("2-Покупатель");
System.out.println("3-Пациент");
System.out.println("4-Абитуриент");
System.out.println("5-Книга");
System.out.println("6-Дом");
System.out.println("7-Машина");
System.out.println("else-Выход");
 Scanner sc=new Scanner(System.in);
 System.out.println("Введите пункт меню");
 int i=sc.nextInt();
 switch (i){
 case 1:{
	 StudentMenu();
	 break;
 }
 case 2:{
	 CustomerMenu();
	 break;
 }
 case 3:{
	 PatientMenu();
	 break;
 }
 case 4:{
	 AbiturientMenu() ;
	 break;
 }
 case 5:{
	 BookMenu() ;
	 break;
 }
 case 6:{
	 HouseMenu();
	 break;
 }
 case 7:{
	 CarMenu();
	 break;
 }
 default :{System.out.println("--------------КОНЕЦ--------------------");ch=false; break;}
 }

}while(ch);
}
	//1. Пункт меню для Student
public static void StudentMenu()  {
	Student[] mas={new Student (),
			new Student("Zaika","Lyudmila","Vladimirovna","28.02.1997","Cherry Str. 43",7140203),
			new Student ("Shotzka","Anna","Olegovna","26.14.1996","Lenyna Str. 56",7012342),
			new Student ("Udovenko","Maria","Vasilevna","8.2.1997","Kramatorskaya Str. 27",7747805),
			new Student("Sovin","David","Glebovich","6.12.1990","Lenyna Str. 12",7012342,"software engineering",5,"12B"),
			new Student("Pavina","Lora","Andreevna","12.9.1996","Pravda av. 2",3430882,"computer science",4,"КН-13-4"),
			new Student("Fokina","Darina","Sergeevna","1.11.1995","Klochkovsky Str. 41",7014110,"computer science",4,"КН-13-1"),
			new Student("Ivanov","Fyodor","Nikolayevich","6.12.1997","Lenyna Str. 12",7918372,"software engineering",3,"11B"),
			new Student("Levin","Boris","Marcovich","6.12.1998","Bazarna str. 19",7341348,"software engineering",2,"10C"),
			new Student("Svetlichniy","Roman","Georgevich","4.5.1999","Rumbova Str. 1a",3152343,"pedagogical",1,"dc1"),
			new Student("Frolova","Eugene","Konstantinovna","9.10.1993","Lenyna Str. 12",7012342,"pedagogical",5,"dc5"),
			};
	//MENU in.next();
	Scanner in = new Scanner(System.in);
	boolean c=true;
	do{
	System.out.println("\t МЕНЮ");
	System.out.println("1. Вывести список студентов заданного факультета.");
	System.out.println("2. Вывести списки студентовд для каждого факультета и курса.");
	System.out.println("3. Вывести списоки студентов, родившихся после заданного года.");
	System.out.println("4. Вывести список учебной группы.");
	System.out.println("else Главное меню.");
	int choice=in.nextInt();
	switch(choice) {
    case 1:{
    	System.out.println();
    	System.out.println("\t Список студентов заданного факультета "); 
    	System.out.println("Все существующие факультеты:"); 
    	String [] catalogFaculty =Student.catalogFaculty(mas);
    	for(int k=0;k<Student.notempty(catalogFaculty);k++){
    		System.out.println((k+1)+" " +catalogFaculty[k]);
    		}
    	System.out.print("Выберете номер факультета:"); 
    		int Faculty=in.nextInt();
		System.out.println();
		Student.getStudOfFaculty(catalogFaculty[Faculty-1], mas);
		System.out.println();
		break;}
    case 2:{
    	System.out.println();
    	System.out.println("\t Списки студентовд для каждого факультета и курса.");
    	Student.studForFacaAndCourse(mas);
    	System.out.println();
    	break;
    }
    case 3:{
    	System.out.println();
    	System.out.println("\t Cписоки студентов, родившихся после заданного года.");
    	System.out.print("Введите год: ");
    	String y=in.next();
    	SimpleDateFormat format = new SimpleDateFormat("yyyy");
    	try{
    		 Date year=format.parse(y);
    		 Student.getStudAfteYear(year,mas);
    	break;
    }
    	catch (ParseException e) {
			e.printStackTrace();
			}
    	System.out.println();
    	break;
	}
    case 4:{
    	System.out.println();
    	System.out.println("\t Cписок учебной группы.");
    	Student.studForGroup(mas);
    	System.out.println();
    	break;
    }
    default:{
    	c=false;
    	break;
    }
	}}while(c);
	
	 }


//2. Пункт меню для Customer
public  static void CustomerMenu()  {
	Customer[] mas={new Customer(),
			new Customer("Zaika","Lyudmila","Vladimirovna","Cherry Str. 43",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer ("Shotzka","Anna","Olegovna","Lenyna Str. 56",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer ("Udovenko","Maria","Vasilevna","Kramatorskaya Str. 27",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Sovin","David","Glebovich","Lenyna Str. 12",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Pavina","Lora","Andreevna","Pravda av. 2",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Fokina","Darina","Sergeevna","Klochkovsky Str. 41",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Ivanov","Fyodor","Nikolayevich","Lenyna Str. 12",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Levin","Boris","Marcovich","Bazarna str. 19",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Svetlichniy","Roman","Georgevich","Rumbova Str. 1a",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			new Customer("Frolova","Eugene","Konstantinovna","Lenyna Str. 12",(int)(Math.random()*1000000000+1),(int)(Math.random()*1000000000+1)),
			};
Scanner in = new Scanner(System.in);
boolean c1=true;
do{
System.out.println("");
	System.out.println("\t МЕНЮ");
	System.out.println("1. Cписок покупателей в алфавитном порядке.");
	System.out.println("2. Список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
	System.out.println("else Главное меню.");
	int choice=in.nextInt();
	switch(choice) {
    case 1:{
    	System.out.println();
    	System.out.println("\t Cписок покупателей в алфавитном порядке "); 
    	Arrays.sort(mas);
    	for(int i=0;i<mas.length;i++){
    		System.out.println(mas[i].toString());
    		System.out.println();
    		}
		break;}
    case 2:{
    	int error;
    	long a, b;
    	System.out.println();
    	System.out.println("\t Список покупателей, у которых номер кредитной карточки находится в заданном интервале"); 
    		do{
    			System.out.print("Введите первое девятизначное число диапазона:");
    		a=in.nextLong();
    		System.out.print("Введите второе девятизначное число диапазона: ");
    		b=in.nextLong();
    		
    		if((a/100000000)>0 && (a/100000000)<10 && (b/100000000)>0 && (b/100000000)<10){error=1;}
    		else{
    			error=0; System.out.println("Некорректный ввод");}
    		}
    		while(error==0);
    		Customer.numberFromGap( a, b, mas);
    		System.out.println();
    }
default:{
    	c1=false;
    	break;
    }
	}}while(c1);

}
//3.Пункт меню для Patient
public static void PatientMenu()  {
	  
     String[] diagnosis = {
            "cold",
            "flu",
            "cancer",
            "pneumonia"
    };
     Random rand = new Random();
     Patient[] mas={new Patient(),
    		 new Patient("Zaika","Lyudmila","Vladimirovna","Cherry Str. 43",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Shotzka","Anna","Olegovna","Lenyna Str. 56",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Udovenko","Maria","Vasilevna","Kramatorskaya Str. 27",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Sovin","David","Glebovich","Lenyna Str. 12",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Pavina","Lora","Andreevna","Pravda av. 2",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Fokina","Darina","Sergeevna","Klochkovsky Str. 41",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Ivanov","Fyodor","Nikolayevich","Lenyna Str. 12",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Levin","Boris","Marcovich","Bazarna str. 19",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Svetlichniy","Roman","Georgevich","Rumbova Str. 1a",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)]),
    		 new Patient("Frolova","Eugene","Konstantinovna","Lenyna Str. 12",(int)(Math.random()*100000),(int)(Math.random()*1000000),diagnosis[rand.nextInt(4)])	
     };
     Scanner in = new Scanner(System.in);
     boolean c2=true;
     do{
     System.out.println("\t МЕНЮ");
 	System.out.println("1. Cписок пациентов, имеющ данный диагноз.");
 	System.out.println("2. Список пациентов, номер медицинской карты которых находится в заданном интервале.");
 	System.out.println("else Главное меню.");
     int choice=in.nextInt();
 	switch(choice) {
     case 1:{
     	System.out.println();
     	System.out.println("\t Cписок пациентов, имеющ данный диагноз "); 
     	int chois=Patient.diagnos(diagnosis);
     	Patient.getPatient(diagnosis[chois-1],mas);
     		System.out.println();
     		
 		break;}
     case 2:{
     	int error;
     	int a, b;
     	System.out.println();
     	System.out.println("\t Список пациентов, номер медицинской карты которых находится в заданном интервале"); 
     		do{
     			System.out.print("Введите первое шестизначное число диапазона:");
     		a=in.nextInt();
     		System.out.print("Введите второе шестизначное число диапазона: ");
     		b=in.nextInt();
     		
     		if((a/100000)>0 && (a/100000)<10 && (b/100000)>0 && (b/100000)<10){error=1;}
     		else{
     			error=0; System.out.println("Некорректный ввод");}
     		}
     		while(error==0);
     		Patient.numberFromGap( a, b, mas);
     		System.out.println();
     }
 default:{
	 
	 c2=false;
	 break;
     }
 	}}while(c2);
}
//4.Пункт меню для Abiturient
public static void AbiturientMenu()  {
	Abiturient[] mas={new Abiturient(),
			new Abiturient("Zaika","Lyudmila","Vladimirovna","Cherry Str. 43",(int)(Math.random()*10000000+1),new int []{12, 10,10,11,10,10}),
			new Abiturient ("Shotzka","Anna","Olegovna","Lenyna Str. 56",(int)(Math.random()*10000000+1),new int []{11, 11,11,10,10,12}),
			new Abiturient ("Udovenko","Maria","Vasilevna","Kramatorskaya Str. 27",(int)(Math.random()*10000000+1),new int []{11, 11,10,11,11,11}),
			new Abiturient("Sovin","David","Glebovich","Lenyna Str. 12",(int)(Math.random()*10000000+1),new int []{8, 10,10,11,5,5}),
			new Abiturient("Pavina","Lora","Andreevna","Pravda av. 2",(int)(Math.random()*10000000+1),new int []{9, 4,9,8,8,6}),
			new Abiturient("Fokina","Darina","Sergeevna","Klochkovsky Str. 41",(int)(Math.random()*10000000+1),new int []{6, 5,11,11,10,10}),
			new Abiturient("Ivanov","Fyodor","Nikolayevich","Lenyna Str. 12",(int)(Math.random()*10000000+1),new int []{11, 10,10,11,11,10}),
			new Abiturient("Levin","Boris","Marcovich","Bazarna str. 19",(int)(Math.random()*10000000+1),new int []{10, 8,5,11,9,8}),
			new Abiturient("Svetlichniy","Roman","Georgevich","Rumbova Str. 1a",(int)(Math.random()*10000000+1),new int []{11, 12,10,10,10,12}),
			new Abiturient("Frolova","Eugene","Konstantinovna","Lenyna Str. 12",(int)(Math.random()*10000000+1),new int []{12, 10,10,11,11,12}),
			};
Scanner in = new Scanner(System.in);
boolean c4=true;
do{
	System.out.println("\t МЕНЮ");
	System.out.println("1. Список абитуриентов, имеющих неудовлетворительные оценки.");
	System.out.println("2. Список абитуриентов, у которых сумма баллов выше заданной.");
	System.out.println("3. Заданное число абитуриентов, имеющие самую высокую сумму баллов, абитуриетны с полупроходной суммой.");
	System.out.println("else Главное меню.");
	for(int i=0; i<mas.length;i++){
		System.out.println(mas[i].toString()+ "общая сумма баллов: "+ Abiturient.sum(mas[i].getMarks()));
	}
	int choice=in.nextInt();
	switch(choice) {
    case 1:{
    	System.out.println();
    	System.out.println("\t Список абитуриентов, имеющих неудовлетворительные оценки "); 
    	Abiturient.neud(mas);
    	System.out.println();
		break;}
    case 2:{
    	
    	System.out.println();
    	System.out.println("\t Список абитуриентов, у которых сумма баллов выше заданной");
    	System.out.println("Введите сумму баллов: ");
    	int sum=in.nextInt();
    	Abiturient.biggerSum(mas,sum);
    		System.out.println();
    		break;
    }
case 3:{
    	
    	System.out.println();
    	System.out.println("\t Заданное число абитуриентов, имеющие самую высокую сумму баллов, абитуриетны с полупроходной суммой."); 
    	System.out.println(" ");
    	System.out.println("Введите число абитуриентов: ");
    	int number=in.nextInt();
    	Abiturient.maxBal(mas,number);
    		System.out.println();
    		break;
    }
default:{
	c4=false;
	break;
    }
	}}while(c4);
}
//5.Пункт меню для Book

public static void BookMenu()  {
	     String[] Publishing = {
	            "Мир",
	            "Амфора",
	            "Axioma",
	            "Machina"
	    };	   	  
	         String[] Binding = {
	                "мягкий",
	                "твердый"
	        };

	Book[] mas={new Book(),
			new Book ("Жизнь взаймы","Э. М. Ремарк",Publishing[(int)(Math.random()*4)],2001,425,640.0,Binding[(int)(Math.random()*2)]),
			new Book ("Проклятое время","Г. Маркес",Publishing[(int)(Math.random()*4)],1996,305,640.0,Binding[(int)(Math.random()*2)]),
			new Book ("Фунты лиха в Париже и Лондоне","Д. Оруэлл",Publishing[(int)(Math.random()*4)],1900,400,240.5,Binding[(int)(Math.random()*2)]),
			new Book ("Государь","Н. Макиавелли",Publishing[(int)(Math.random()*4)],1999,198,555.0,Binding[(int)(Math.random()*2)]),
			new Book ("Ярмарка тщеславия","У. Теккерей",Publishing[(int)(Math.random()*4)],2004,240,230.5,Binding[(int)(Math.random()*2)]),
			new Book ("Идиот","Ф. Достоевский",Publishing[(int)(Math.random()*4)],2011,320,190.0,Binding[(int)(Math.random()*2)]),
			new Book ("Сто лет одиночества","Г. Маркес",Publishing[(int)(Math.random()*4)],1901,150,725.0,Binding[(int)(Math.random()*2)]),
			new Book ("Тени в раю","Э. М. Ремарк",Publishing[(int)(Math.random()*4)],2001,470,630.0,Binding[(int)(Math.random()*2)])
	};
Scanner in = new Scanner(System.in);
boolean c5=true;
do{
	System.out.println("\t МЕНЮ");
	System.out.println("1. Список книг заданного автора.");
	System.out.println("2. Список книг, выпущенных заданным издательством.");
	System.out.println("3. Список книг, выпущенных после заданного года. ");
	System.out.println("else Главное меню.");
	for(int i=0; i<mas.length;i++){
		
	}
	int choice=in.nextInt();
	switch(choice) {
    case 1:{
    	System.out.println();
    	System.out.println("\t Список книг заданного автора."); 
        String []Author=Book.catalogAuthor(mas);
       for(int i=0; i<Author.length;i++){
    	  if(Author[i]!=null){ System.out.println(i+"-"+Author[i]);}
       }
       boolean ch=false;
      do{ System.out.println("Выберете автора :");
       int a=in.nextInt();
       if(a<Author.length || a>=0){
    	   ch=true;
    	   Book.booksAuthor(mas,Author[a]);
    	   }
      }
      while(ch==false);
      
    	System.out.println();
		break;}
    case 2:{
    	
    	System.out.println();
    	System.out.println("\t Список книг, выпущенных заданным издательством");
    	  for(int i=0; i<Publishing.length;i++){
       	   System.out.println(i+"-"+Publishing[i]);
          }
          boolean ch=false;
         do{ System.out.println("Выберете автора :");
          int a=in.nextInt();
          if(a<Publishing.length && a>=0){
       	   ch=true;
       	   Book.booksPublishingName(mas,Publishing[a]);
       	   }
         }
         while(ch==false);
    		System.out.println();
    		break;
    }
case 3:{
    	
    	System.out.println();
    	System.out.println("\t Список книг, выпущенных после заданного года. "); 
    	boolean ch=false;
    	do{System.out.println("Введите год: ");
        int year=in.nextInt();
        if(year>1800 && year<=2016){
     	   ch=true;
     	   Book.booksYear(mas,year);
     	   }
       }
       while(ch==false);
  		System.out.println();
    	
    		System.out.println();
    		break;
    }
default:{
	c5=false;
	break;
    }
	}}while(c5);
}
//6.Пункт меню для House
static int id=1;
public static void HouseMenu()  {
	
    String[] BuildingType = {
           "монолитный ",
           "панельный",
           "кирпичный",
           "блочный"
   };	   	  
       
  
   
House[] mas={new House(),
		new House (id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Победы 23",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Космическая 45",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Фрунзе 9",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Косинская 12",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Вишневая 8",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Парковая 3",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Комарова 10/2",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1)),
		new House (++id,(int)(Math.random()*200+1),(int)(Math.random()*70+24),(int)(Math.random()*21+1),(int)(Math.random()*4+1),"Правды 15",BuildingType[(int)(Math.random()*4)],(int)(Math.random()*56+1))
};
Scanner in = new Scanner(System.in);
boolean c=true;
do{
System.out.println("\t МЕНЮ");
System.out.println("1. Список квартир, имеющих заданное число комнат.");
System.out.println("2. Список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке.");
System.out.println("3. Список квартир, имеющих площадь, превосходящую заданною. ");
System.out.println("else Главное меню.");
for(int i=0; i<mas.length;i++){
	
}
int choice=in.nextInt();
switch(choice) {
case 1:{
	System.out.println();
	System.out.println("\t Список квартир, имеющих заданное число комнат."); 
    System.out.println("Введите число комнат (1-5) :");
    int roomNumer=in.nextInt();
    for(int i=0;i<mas.length;i++){
    if(roomNumer==mas[i].getQuantity()){
 	   System.out.println(mas[i].toString());
 	   }
    }
	break;}
case 2:{
	
	System.out.println();
	System.out.println("\t Список квартир, имеющих заданное число комнат и расположенных на этаже, который находится в заданном промежутке.");
	System.out.println("Введите число комнат (1-5) :");
    int a=in.nextInt();
    System.out.println("Введите нижнюю границу диапазона этажей");
    int b=in.nextInt();
    System.out.println("Введите верхнюю границу диапазона этажей");;
    int d=in.nextInt();
   House.numberOfRoomsOnFloor( mas, a, b, d);
		System.out.println();
		break;
}
case 3:{
	
	System.out.println();
	System.out.println("\t Список квартир, имеющих площадь, превосходящую заданною. "); 
	System.out.println("Введите площадь квартиры ");
   int Square=in.nextInt();
  House.squareRooms( mas,  Square);
		System.out.println();
	
		System.out.println();
		break;
}
default:{
	c=false;
	break;
}
}
}while(c);return;}

//6.Пункт меню для Сar
public static void CarMenu()  {
	
    String[] CarType = {
           "Хюндай ",
           "Ауди",
           "BMW",
           "Рено",
           "Пежо",
           "Тойота",
           "Хонда",
           "Порш"
   };	   	  
    String[] CarM = {
            "соната ",
            "авант",
            "Х3",
            "логан",
            "RCZ",
            "аурис",
            "аккорд",
            "каррера"
    };	   	  
Car[] mas={new Car(),
		new Car (id,"Хюндай","соната",2013,"белый",450000,"АХ3213ХА"),
		new Car (++id,"Ауди","авант",2015,"черный",860000,"АА3232ХА"),
		new Car (++id,"BMW","Х3",2010,"вишневый",800500,"АА43534АА"),
		new Car (++id,"Рено","логан",2014,"черный",550500,"АХ8973АХ"),
		new Car (++id,"Пежо","RCZ",2013,"красныйй",675000,"АА8733АХ"),
		new Car (++id,"Тойота","аурис",2005,"золотой",606000,"BН6738ХА"),
		new Car (++id,"Хонда","аккорд",2011,"синий",500000,"АМ2692ВЕ"),
		new Car (++id,"Рено","логан",2005,"черный",500500,"АХ8343АХ"),
		new Car (++id,"Пежо","RCZ",2009,"красныйй",675000,"АН9343BA"),
		new Car (++id,"Тойота","аурис",2009,"золотой",656000,"АХ3432ХА"),
		new Car (++id,"Хонда","аккорд",2013,"синий",670000,"АМ3242ВЕ"),
		new Car (++id,"Порш","каррера",2011,"белый",900000,"АА9324СН")
};
Scanner in = new Scanner(System.in);
boolean c=true;
do{
System.out.println("\t МЕНЮ");
System.out.println("1. Список автомобилей заданной марки.");
System.out.println("2. Список автомобилей заданной модели, которые эксплуатируются больше n лет .");
System.out.println("3. Список автомобилей заданного года выпуска , цена которых больше указанной. ");
System.out.println("else Главное меню.");
for(int i=0; i<mas.length;i++){
	
}
int choice=in.nextInt();
switch(choice) {
case 1:{
	System.out.println();
	System.out.println("\t Список автомобилей заданной марки."); 
	System.out.println("Все марки");
	for(int i=0;i<CarType.length;i++){
		System.out.println(i+1 +CarType[i]);
	}
  System.out.println("Введите номер марки");
  int number=in.nextInt();if(number>=1 &&number<=8)
  Car.CarBrand(mas, CarType[number-1]);
	break;}
case 2:{
	
	System.out.println();
	System.out.println("\t Список автомобилей заданной модели, которые эксплуатируются больше n лет .");
	for(int i=0;i<CarM.length;i++){
		System.out.println(i+1 +CarM[i]);
	}
	System.out.println("Введите номер модели");
	  int number=in.nextInt();
	  System.out.println("Введите срок эксплуатации");
	  int n=in.nextInt();
	  Car.CarBrandYear(mas, CarM[number-1],n);
	
		break;
}
case 3:{
	
	System.out.println();
	System.out.println("\t Список автомобилей заданного года выпуска, цена которых больше указанной. "); 
	
	System.out.println("Введите год выпуска авто.");
 int year=in.nextInt();
 System.out.println("Укажите цену. ");
 int price=in.nextInt();
Car.CarPriceYear(mas, year,  price);
		
		System.out.println();
		break;
}
default:{
	c=false;
	break;
}
}
}while(c);return;}

}