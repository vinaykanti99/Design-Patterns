package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {
	
	private String name;
	private String role;
	private int salary;
	public Composite(String name, String role, int salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	List<Employee> subOrdinates=new ArrayList<Employee>();
	
	
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		subOrdinates.add(e);
		
	}


	@Override
	public void removeEmployee(Employee e) {
		// TODO Auto-generated method stub
		subOrdinates.remove(e);
		
	}


	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee details :" +name+" "+role+" "+salary);
		
		for (Employee employee : subOrdinates) {
			employee.showDetails();
		}
		
	}
	

}
