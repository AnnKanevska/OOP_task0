package task0_House;

public class House {
	private int id;
	private int number;
	private int square;
	private int floor;
	private int quantity;
	private String street;
	private String buildingType;
	private int lifetime;// в месяцах
	

 public House() {
	 this.id=0;
	 this.number=4;
	 this.square=32;
	 this.floor=5;
	 this.quantity=2;
	 this.street="Марсельская";
	 this.buildingType="блочный";
	 this.lifetime=39;
}
 public House(int id,int number,int square,int floor,int quantity,String street,String buildingType,int lifetime) {
	 this.id=id;
	 this.number=number;
	 this.square=square;
	 this.floor=floor;
	 this.quantity=quantity;
	 this.street=street;
	 this.buildingType=buildingType;
	 this.lifetime=lifetime;
 }
 @Override
public String toString() {
	 return "House: Id "+id +". номерквартиры: \""+ number+"\", "+
				"площадь: "+square+"м. кв., "+floor+" этаж, "+quantity+"комнат(ы), "+"ул."
				+ street+", "+buildingType+" тип здания"+ ", срок эксплуатации: "+(int)(lifetime/12)+ "г. "+(lifetime%12)+" м.";
}
 public String getBuildingType() {
	return buildingType;
}
public int getFloor() {
	return floor;
}
public int getLifetime() {
	return lifetime;
}
 public int getNumber() {
	return number;
}
 public int getQuantity() {
	return quantity;
}
 public int getSquare() {
	return square;
}
 public String getStreet() {
	return street;
}
 public void setBuildingType(String buildingType) {
	this.buildingType = buildingType;
}
 public void setFloor(int floor) {
	this.floor = floor;
}
 public void setLifetime(int lifetime) {
	this.lifetime = lifetime;
}
 public void setNumber(int number) {
	this.number = number;
}
 public void setQuantity(int quantity) {
	this.quantity = quantity;
}
 public void setSquare(int square) {
	this.square = square;
}
 public void setStreet(String street) {
	this.street = street;
}
 //список квартир, имеющие заданное число комнат
 public  void numberOfRooms(House[] mas, int quantity){
	 for(int i=0; i<mas.length;i++){
		 if(mas[i].quantity==quantity){
			 mas[i].toString();
		 }
	 }
 }
 public static void numberOfRoomsOnFloor(House[] mas, int quantity, int start, int end){
	 for(int i=0; i<mas.length;i++){
		 if(mas[i].quantity==quantity && mas[i].floor>start && mas[i].floor<end){
			 System.out.println(mas[i].toString());
		 }
	 }
 }
 public static void squareRooms(House[] mas, int square){
	 for(int i=0; i<mas.length;i++){
		 if(mas[i].square>square){
			 System.out.println( mas[i].toString());
		 }
	 }
 } 
}