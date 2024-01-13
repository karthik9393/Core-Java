package com.codewithkarthik.anshul;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Write a program for concate all unique city with 
//given format and create Employe list with follow given Employee Class
//[Chicago , New York, Hostan]
public class problem12 {

	public static void main(String[] args) {
		
		List<Employee> list  = new ArrayList<Employee>();
		list.add(new Employee(6l,"Yash", Arrays.asList("Chicago" , "New York", "Hostan") ,2500.6));
		list.add(new Employee(2l,"Aman",Arrays.asList("Chicago"),  222.9));
		list.add(new Employee(3l,"Aakash",Arrays.asList("Hostan"),  122.52));
		list.add(new Employee(5l,"David",Arrays.asList( "New York"), 3419.96));
		list.add(new Employee(4l,"James", Arrays.asList("Chicago" , "New York"),772.67));
		list.add(new Employee(8l,"Aakash",Arrays.asList( "New York", "Hostan"), 472.87));

		List<String> collect = list.stream().flatMap(emp -> emp.getEmployeeCity().stream()).distinct().collect(Collectors.toList());
		
		String uniqueCities = collect.stream().collect(Collectors.joining(",", "[", "]"));
		
		System.out.println(uniqueCities);
		//System.out.println(collect);
	}

}
class Employee {
	private Long employeeId;
	private String employeeName;
	private List<String> employeeCity;    // use multiple City with some duplicate record in each employee
	private LocalDate DOJ;
	private Double employeeSalary;
	public Employee(Long employeeId, String employeeName, List<String> employeeCity,
			Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		
		this.employeeSalary = employeeSalary;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(List<String> employeeCity) {
		this.employeeCity = employeeCity;
	}
	public LocalDate getDOJ() {
		return DOJ;
	}
	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCity="
				+ employeeCity + ", DOJ=" + DOJ + ", employeeSalary=" + employeeSalary + "]";
	}
	
	
	
	
	
}