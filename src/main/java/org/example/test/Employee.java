package org.example.test;

public final class Employee{
    final String pancardNumber;

    public Employee(String pancardNumber){
        this.pancardNumber=pancardNumber;
    }

    public String getPancardNumber(){
        return pancardNumber;
    }

}