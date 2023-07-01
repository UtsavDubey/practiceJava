package org.example.test;

public class RuntimePolymorh extends Polymorph{

    public String method1(String a,String b){
        return a+b+"pqr";
    }

    public static void main(String[] args) {
        Polymorph r=new Polymorph();
        System.out.println(r.method1("asas","ads"));

    }
}
