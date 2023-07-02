package org.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
    Integer age;
    String name;

    public StudentComparable(Integer age, String name, String address) {
        this.age = age;
        this.name = name;
        Address = address;
    }

    String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public int compareTo(StudentComparable o) {
        return Integer.compare(this.age,o.age);
    }

    public static void main(String args[]){
        List<StudentComparable> StuList=new ArrayList<StudentComparable>();
        StuList.add(new StudentComparable(10,"Ankit","Manasa"));
        StuList.add(new StudentComparable(10,"Amit","Manasa"));
        StuList.add(new StudentComparable(13,"Arpit","Manasa1"));
        StuList.add(new StudentComparable(11,"Rishi","Manasa2"));
        StuList.add(new StudentComparable(12,"Babu","Manasa3"));

        Collections.sort(StuList);
        StuList.forEach(Student->System.out.println(Student.getAge()+" "+Student.getName()));

    }
}
