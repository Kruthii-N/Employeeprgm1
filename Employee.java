package Employee;

class Employee
{
String name;
String id;
double salary;
Employee(String name , String id  , double salary){
this.name = name;
                this.id = id;
                this.salary= salary;
        }
        //displaying the  details
        void displaydetails() {
                System.out.println("Employee name: "+this.name);
                System.out.println("Employee ID: "+this.id);
                System.out.println("Employee Salary: "+this.salary);

        }
        //salary increment
        void increaseinsalary(int percentage) {
                double  increment = (percentage*this.salary)/100;
                this.salary=increment+this.salary;
                System.out.println("Incremented salary of the employee is "+this.salary );
        }

public static void main (String args[]) {
Employee e1=new Employee("Kruthi","NNM24IS112",10);
        Employee e2 = new Employee("Kushner","NNM24xx119",80);
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