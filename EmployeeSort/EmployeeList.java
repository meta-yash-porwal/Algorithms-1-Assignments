package EmployeeSort;

/**
 * this class creates employee as a node of linked list 
 * which has next - to store address of connecting node
 * and employee class as in one part of that node
 * @author yash.porwal_metacube
 *
 */
class EmployeeNode{
	EmployeeNode next;
	Employee details;
	EmployeeNode(Employee detail){
		next = null;
		details = detail;
	}
}

/**
 * this will create linked list from node 
 * which is then sorted using insertion sort
 * @author yash.porwal_metacube
 *
 */
public class EmployeeList {
	EmployeeNode head;
	EmployeeNode sortedHead;
	
	/**
	 * default constructor used to instantiate the object
	 * by using already defined values
	 */
	EmployeeList(){
		head = null;
		this.addEmployee(new Employee(1,"yash",1000,23));
		this.addEmployee(new Employee(2,"Soni",20000,25));
		this.addEmployee(new Employee(3,"jagon",10000,26));
		this.addEmployee(new Employee(4,"Vikas",1000,27));
	}
	
	/**
	 * Function add new Employee in LinkedList
	 * @param newEmp of employee class object which has details of employee
	 */
	void addEmployee(Employee newEmp){
		if(head == null){
			head = new EmployeeNode(newEmp);
		}
		else{
			EmployeeNode temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new EmployeeNode(newEmp);
		}
	}
	
	/**
	 * Print Employee LinkedList
	 */
	void printList(){
		EmployeeNode temp = head;
		while(temp != null){
			System.out.println("\nId :- " + temp.details.empId + 
					"\nName:- " + temp.details.empName + 
					"\nSalary:- " + temp.details.empSalary + 
					"\nAge:- " + temp.details.empAge);
			temp = temp.next;
		}
	}
	
	/**
	 * Print Sorted Employee LinkedList
	 */
	void printSortedList(){
		EmployeeNode temp = sortedHead;
		while(temp != null){
			System.out.println("\nId :- " + temp.details.empId + 
					"\nName:- " + temp.details.empName + "\nSalary:- " 
					+ temp.details.empSalary + "\nAge:- " + 
					temp.details.empAge);
			temp = temp.next;
		}
	}
	
	/**
	 * Sort the employee using Insertion Sort
	 * Sort (descending) based on their salary, 
	 * the one having the highest salary should be the 1st 
	 * and the one having the lowest should be the last.
	 * If there is a tie between salaries 
	 * then the one with a lesser age should go before.

	 */
	public void inSort() {
		sortedHead = head;

		EmployeeNode curr = sortedHead;
		EmployeeNode insP = sortedHead;
		
		curr = curr.next;
		
		while(curr != null) {
			
			insP = sortedHead;
			while(insP != curr) {
				if(insP.details.empSalary < curr.details.empSalary) {
					
					Employee temp = curr.details;
					curr.details = insP.details;
					insP.details = temp;
				}
				if (insP.details.empSalary == curr.details.empSalary) {
					
					if(insP.details.empAge > curr.details.empAge) {
						
						Employee temp = curr.details;
						curr.details = insP.details;
						insP.details = temp;
					}
				}
				insP = insP.next;
				
			}
			curr = curr.next;
		}
	}
	
	
}	
	
	/**
	 * Sort The Employee LinkedList
	 */
//	public void sort()  
//    { 
//        // Initialize sorted linked list 
//        sortedHead = null; 
//        EmployeeNode current = head; 
//        
//        // Traverse the given linked list and insert every 
//        // node to sorted 
//        while (current != null)  
//        { 
//            // Store next for next iteration 
//        	EmployeeNode next = current.next; 
//            // insert current in sorted linked list 
//            sortedInsert(current); 
//            // Update current 
//            current = next; 
//        } 
//        // Update head_ref to point to sorted linked list 
//        head = sortedHead; 
//    }

	/**
	 * Helper Function
	 * @param newNode
	 */
//	private void sortedInsert(EmployeeNode newNode) {
//		 /* Special case for the head end */
//	    if (sortedHead == null || sortedHead.details.empSalary < newNode.details.empSalary)  
//	    { 
//	        newNode.next = sortedHead; 
//	        sortedHead = newNode; 
//	    } 
//	    else 
//	    { 
//	    	EmployeeNode current = sortedHead; 
//	        /* Locate the node before the point of insertion */
//	        while (current.next != null && (current.next.details.empSalary > newNode.details.empSalary || 
//	        		(current.next.details.empSalary == newNode.details.empSalary  && newNode.details.empAge > current.next.details.empAge )))  
//	        { 
//	            current = current.next; 
//	        } 
//	        newNode.next = current.next; 
//	        current.next = newNode; 
//	    } 
//		
//	} 
