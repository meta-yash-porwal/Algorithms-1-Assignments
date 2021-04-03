package EmployeeSort;

/**
 * this class has employee details as a data member in it 
 * and to initiate it using constructor
 * @author yash.porwal_metacube
 *
 */
public class Employee {
	int empId;
	String empName;
	int empSalary;
	int empAge;
	
	/**
	 * constructor used to instantiate data members of the object
	 * @param id - Employee id as an integer
	 * @param name - Employee name as an String
	 * @param salary - Employee salary as an integer
	 * @param age - Employee age as an integer
	 */
	Employee(int id,String name,int salary,int age){
		empId = id;
		empName = name;
		empSalary = salary;
		empAge = age;
	}
}
