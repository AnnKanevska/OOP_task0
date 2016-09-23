package task0_Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;





public class Student {
private String surname;
private String name;
private String patronymic;
private Date dateOfBirth;
private String adress;
private int number;
private String department;
private int course;
private String group;

public  Student (String surname, String name, String patronymic,String dateOfBirth, String adress, int number,String department, int course, String group){
	this.surname=surname;
	this.name=name;
	this.patronymic=patronymic;
	try{
	 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
	this.dateOfBirth=format.parse(dateOfBirth);}
	catch (ParseException e) {
		e.printStackTrace();
		}
	this.adress=adress;
	this.number=number;
	this.department=department;
	this.course=course;
	this.group=group;
}
public  Student (String surname, String name, String patronymic,String dateOfBirth, String adress, int number) {
	this.surname=surname;
	this.name=name;
	this.patronymic=patronymic;
	try{
		 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		this.dateOfBirth=format.parse(dateOfBirth);}
		catch (ParseException e) {
			e.printStackTrace();
			}
	this.adress=adress;
	this.number=number;
	department="computer science";
	course=3;
	group="КН-14-2";
	
}
public  Student(){
	surname="Kanevska";
	name="Ann";
	patronymic="Grygoryvna";
	try{
		 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		this.dateOfBirth=format.parse("16.03.1997");}
		catch (ParseException e) {
			e.printStackTrace();
			}
	adress="Naukova str. 56";
	number=7022222;
	department="computer science";
	course=3;
	group="КН-14-2";
}

//-----------------Set----------------
public void setSurname(String surname) {
	this.surname = surname;
}
public void setPatronymic(String patronymic) {
	this.patronymic = patronymic;
}
public void setNumber(int number) {
	this.number = number;
}
public void setName(String name) {
	this.name = name;
}
public void setGroup(String group) {
	this.group = group;
}
public void setDepartment(String department) {
	this.department = department;
}
public void setDateOfBirth(String dateOfBirth) {
	try{
		 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		this.dateOfBirth=format.parse(dateOfBirth);}
		catch (ParseException e) {
			e.printStackTrace();
			}
}
public void setCourse(int course) {
	this.course = course;
}
public void setAdress(String adress) {
	this.adress = adress;
}
//------------------Get-----------------
public String getSurname() {
	return surname;
}
public String getPatronymic() {
	return patronymic;
}
public int getNumber() {
	return number;
}
public String getName() {
	return name;
}
public String getGroup() {
	return group;
}
public String getDepartment() {
	return department;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public int getCourse() {
	return course;
}
public String getAdress() {
	return adress;
}
@Override
	public  String toString() {
		// TODO Auto-generated method stub
	 SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		return "Student: ФИО "+ surname+" "+name+" "+patronymic+", "+
				"Дата рождения  " +format.format(dateOfBirth)+", "+"Адрес "+adress+","+
		"Телефон "+number+", "+"Факультет "+department+", "+ course +" курс, "+"группа "+group;
	}
//вывод студентов заданного факультета
public static void getStudOfFaculty(String department, Student [] mas){
	/*System.out.println("Все существующие факультеты:"); 
	String [] catalogFaculty =catalogFaculty(mas);
	for(int k=0;k<notempty(catalogFaculty);k++){
		System.out.println(catalogFaculty[k]);
	}*/
	for(int i =0; i< mas.length;i++){
	if (mas[i].department==department){
		System.out.println(mas[i].surname+" "+mas[i].name+" "+mas[i].patronymic);
	 }
	}
}
// каталог факультетов
public static String[] catalogFaculty(Student[]obj){
	String[]mas=new String[obj.length];
	int control=0;
	int k=0;
	for(int i=0;i<obj.length;i++){
		if(k!=0){
			for(int j=0;j<k;j++){
				if(obj[i].department==mas[j]){
					control++;
				}
			}
		}
		if (control==0){mas[k]=obj[i].department;k++;}
		control=0;
	}
	return mas;
}
//каталог курсов
public static int[] catalogCourse(Student[]obj){
	int[]mas=new int[obj.length];
	int control=0;
	int k=0;
	for(int i=0;i<obj.length;i++){
		if(k!=0){
			for(int j=0;j<k;j++){
				if(obj[i].course==mas[j]){
					control++;
				}
			}
		}
		if (control==0){mas[k]=obj[i].course;k++;}
		control=0;
	}
	Arrays.sort(mas);
	return mas;
}
// каталог групп
public static String[] catalogGroup(Student[]obj){
	String[]mas=new String[obj.length];
	int control=0;
	int k=0;
	for(int i=0;i<obj.length;i++){
		if(k!=0){
			for(int j=0;j<k;j++){
				if(obj[i].group==mas[j]){
					control++;
				}
			}
		}
		if (control==0){mas[k]=obj[i].group;k++;}
		control=0;
	}
	
	return mas;
}
// кол-во непустых клеток массива для String
public static int notempty(String[]obj){
	int count=0;
	for(int i=0; i<obj.length;i++){
		if(obj[i]!=null){count++;}
	}
	return count;
}
// кол-во непустых клетокмассива для Int
public static int notempty(int[]obj){
	int count=0;
	for(int i=0; i<obj.length;i++){
		if(obj[i]!=0){count++;}
	}
	return count;
}
//списки студентов для каждого факудьтета и курса
public static  void studForFacaAndCourse(Student[]obj){
	int[] catalogCourse=catalogCourse(obj);//массив всех возможных курсов
	int numberCourse=notempty(catalogCourse);//их число
	
	String [] catalogFaculty =catalogFaculty(obj);//массив всех возможных факультетов
	int numberFaculty=notempty(catalogFaculty);//их число
	int count=0;//для одноразового вывода курса
	
	for (int i=0;i<numberFaculty;i++){
		System.out.println("\n Факультет: "+ catalogFaculty[i]);
		for (int j=obj.length-numberCourse-1;j<obj.length;j++){//Т.к. использую функцию сорт,  то первыми будут  ячейки =0;
			for (int k=0;k<obj.length;k++){
				if(obj[k].course==catalogCourse[j] && obj[k].department==catalogFaculty[i]){
					if(count==0){
						System.out.println("  "+ catalogCourse[j]+" курс.");
						count++;
						        }
					System.out.println(obj[k].surname+" "+obj[k].name+" "+obj[k].patronymic);
				}
			}	count=0;//
		} 
	}
}


//список студентов родившихся после заданного года
public static void getStudAfteYear(Date year, Student [] obj){
	
	for(int i=0; i<obj.length;i++){
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
		try{
		Date y=format.parse(format.format(obj[i].dateOfBirth));
           if(y.after(year)){
			System.out.println(obj[i].surname+" "+obj[i].name+" "+obj[i].patronymic+ " дата рождения: "+format1.format(obj[i].dateOfBirth));
		}
		}
		catch (ParseException e) {
			e.printStackTrace();
			}//(obj[i].dateOfBirth);
		
	}
}
//список групп
public static void studForGroup(Student[]obj){
	String [] catalogGroup =catalogGroup(obj);//массив всех возможных групп
	int numberFaculty=notempty(catalogGroup);//их число
	for (int i=0;i<numberFaculty;i++){
		System.out.println("\n Группа: "+ catalogGroup[i]);
		for (int j=0;j<obj.length;j++){
			if(obj[j].group==catalogGroup[i]){
				System.out.println(obj[j].surname+" "+obj[j].name+" "+obj[j].patronymic);
			}
	   }
      }
	}


}







