package org.example.test;

public class SubEmployee{
    public void finalize(){System.out.println("object is garbage collected");}
    public static void main(String args[]){
        SubEmployee s1=new SubEmployee();
        SubEmployee s2=new SubEmployee();
        SubEmployee s3=new SubEmployee();
        s1=null;
        s2=null;
        s3=null;
        System.gc();
    }
}
