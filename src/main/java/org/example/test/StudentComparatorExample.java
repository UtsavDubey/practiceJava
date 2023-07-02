package org.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorExample implements Comparator<StudentComparatorExample> {
    Integer age;
    String name;

    public StudentComparatorExample(Integer age, String name, String address) {
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




    public static void main(String args[]){
        List<StudentComparatorExample> StuList=new ArrayList<StudentComparatorExample>();
        StuList.add(new StudentComparatorExample(10,"Ankit","Manasa"));
        StuList.add(new StudentComparatorExample(10,"Amit","Manasa"));
        StuList.add(new StudentComparatorExample(13,"Arpit","Manasa1"));
        StuList.add(new StudentComparatorExample(11,"Rishi","Manasa2"));
        StuList.add(new StudentComparatorExample(12,"Babu","Manasa3"));
        Collections.sort(StuList,StudentComparatorExample.nameComparator.thenComparing(StudentComparatorExample.nameComparator));
        StuList.forEach(Student->System.out.println(Student.getAge()+" "+Student.getName()));

    }

    public static Comparator<StudentComparatorExample> ageComparator=new Comparator<StudentComparatorExample>() {
        @Override
        public int compare(StudentComparatorExample o1, StudentComparatorExample o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    };
    public static Comparator<StudentComparatorExample> nameComparator=new Comparator<StudentComparatorExample>() {
        @Override
        public int compare(StudentComparatorExample o1, StudentComparatorExample o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public int compare(StudentComparatorExample o1, StudentComparatorExample o2) {
        return 0;
    }
}
