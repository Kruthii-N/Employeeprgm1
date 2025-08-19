package Employee;

public class main {
		public static void Main(String args[])
		   {
			
		Employee e1=new Employee("Kruthi","NNM24IS112",700);
		        Employee e2 = new Employee("Kushner","NNM24xx119",120);
		        //initial Details
		        //Employee 1
		        e1.displaydetails();

		        //Employee 2
		        e2.displaydetails();

		        //increasing salary
		        e1.increaseinsalary(20);
		        e2.increaseinsalary(10);

		        System.out.println("AFTER UPDATE:");

		        // final details
		        // Employee 1
		        e1.displaydetails();
		        
		        // Employee 2
		        e2.displaydetails();
		}
}
