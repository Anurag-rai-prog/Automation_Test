package zi;

public class ThisKeyword {
	
	//instance variable
	String name;
	int age;
	int salary;
	
	public void setDetails(String name,int age,int salary) {
		
		//this keyword is used to refer the instance variable of the current class
		this.name = name;
		this.age = age;
		this.salary = salary;
		
		
	}
	public Object getname() {
		return name;
	}
	public Object getage() {
		return age;
	}
	public Object getsalary() {
		return salary;
	}
	
	

}
