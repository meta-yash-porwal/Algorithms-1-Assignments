package EmployeeSort;

/**
 * Main class
 * @author yash.porwal_metacube
 *
 */
public class Main {
	
	public static void main(String[] args) {
		EmployeeList empL = new EmployeeList();

		
		empL.printList();
		empL.inSort();
		empL.printSortedList();
		
	}
	
}
		
//			boolean loop = true;
//			while(loop) {
//			System.out.println("Enter 1 to add more Employee and 0 for Exit");
//			int choice = sc.nextInt();
//		
//			if(choice == 1) {
//				
//			}
//		}