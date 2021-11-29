package composite;

public class Leaf implements Employee {
	
	private String name;
	private String role;
	private int salary;
	public Leaf(String name, String role, int salary) {
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
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee details :" +name+" "+role+" "+salary);
		
	}
	

}
