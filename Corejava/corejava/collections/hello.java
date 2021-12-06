package collections;

import java.util.*;

class Employee{
	int id;
	String name ;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary)
	{
		this.id=id;
		this.name=name;
		this.department= department;
		this.salary= salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
class MynameComp implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class hello {
	
	public static void main(String[] args){
		
		TreeSet<Employee> e = new TreeSet<Employee>(new MynameComp());
		
		Employee e1 = new Employee(12117,"nikesh","ECE",20000.25);
		Employee e2 = new Employee(22524,"naveen","cse",20100.57);
		Employee e3 = new Employee(12533,"shivsdeep","ME",22000.95);
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		
		for(Employee s : e)
		{
			System.out.println(s.id+" "+s.name+" "+s.department+" "+s.salary);
		}
		
	}
	
}