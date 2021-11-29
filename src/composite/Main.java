package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee projectManger=new Composite("Sanjay","Project Manager",1200000);
		Employee emp1=new Leaf("Vinay","Developer",5000);
		Employee emp2=new Leaf("Saurav","Developer",5000);
		Employee emp3=new Leaf("Vaishali","Developer",5000);
		Employee emp4=new Leaf("Rahul","Developer",5000);
		Employee emp5=new Leaf("Kirti","Developer",5000);
		projectManger.addEmployee(emp1);
		projectManger.addEmployee(emp2);
		
		
		Employee reportingManager =new Composite("Vinoth","Senior Manager",1600000);
		reportingManager.addEmployee(emp3);
		reportingManager.addEmployee(emp4);
		reportingManager.addEmployee(emp5);
		
		reportingManager.addEmployee(projectManger);
		
		Employee head=new Composite("Shiv Nadar","Chairman",2600000);
		head.addEmployee(reportingManager);
		
		projectManger.showDetails();
		
		emp2.showDetails();

	}

}
