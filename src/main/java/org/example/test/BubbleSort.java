package org.example.test;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        Integer a[]={50,10,30,20,60,40,21,19,32,43};
        Integer x=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                x++;
                if(a[i]>a[j]){
                    Integer temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        System.out.println(Arrays.stream(a).toList()+" "+x);
    }
}
