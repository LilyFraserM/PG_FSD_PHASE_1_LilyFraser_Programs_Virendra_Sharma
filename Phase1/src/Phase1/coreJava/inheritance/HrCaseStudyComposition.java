package Phase1.coreJava.inheritance;

import java.util.ArrayList;
import java.util.List;

class Employee{
	public double sal;
	public String Name;
	public int age;
	
	Employee(  String Name,double sal,int age){
		
		this.Name = Name;
		this.sal = sal;
		this.age = age;
	}
}

class HRDepartment{
	private final List<Employee> employee;
	HRDepartment(List<Employee> employee)
	{
		this.employee =employee;
	}
	
	public List<Employee>getAllEmployees()
	{
		return employee;
	}
}

public class HrCaseStudyComposition {

	public static void main(String[] args) {

		Employee e1 = new Employee("Lily", 120000,28);
		Employee e2 = new Employee("Mala", 150000,30);
		Employee e3 = new Employee("Arya", 80000,23);
	
		
		List<Employee>employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		
		HRDepartment hrDepartment = new HRDepartment(employee);
		//List<Book>books = library.getTotalBooksInLibrary();
		List<Employee>employees = hrDepartment.getAllEmployees();
		
		for(Employee emp: employees) {
			System.out.println("Name: " + emp.Name + " sal: " + emp.sal + " age : "+ emp.age);
		}
	}

}
