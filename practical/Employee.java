package zeesh;

public class Employee {
	int empid;
	String empname;
	Employee(int id, String name){
		this.empid=id;
		this.empname=name;
		
	}
void info() {
	System.out.println("id: "+empid+" Name: "+empname);
	
}
	public static void main(String[] args) {
           Employee obj1 = new Employee(100,"Jack");
           Employee obj2 = new Employee(99,"john");
           obj1.info();
           obj2.info();
           
	}

}
