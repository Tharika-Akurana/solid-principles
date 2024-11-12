// A class should have Single job (Single Responsibility) & Single reason to change.

// Incorrect Implementation

/*
public class Employee {
    private int id;
    private double salary;

    public double getSalary(){
        return salary;
    }

    public double calculateTax(){
        ...
    }
}
*/


//Correct Implementation
/*
public  class Employee {
    private int id;
    private double salary;

    public double getSalary(){
        return salary;
    }
}

public class TaxCalculator{
    public double calculateTax(Employee employee){
        ...
    }
}
*/