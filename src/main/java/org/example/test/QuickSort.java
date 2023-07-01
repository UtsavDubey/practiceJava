package org.example.test;

import java.util.Arrays;

public class QuickSort {

    int partition(Integer arr[],int low,int high){
        int pivotElement=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivotElement){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    void sort(Integer arr[],int low,int high){
        if(low<high){
           int pi=partition(arr,low,high);
           sort(arr,low,pi-1);
           sort(arr,pi+1,high);
        }
    }

    public static void main(String args[]){
        Integer arr[]={50,10,30,20,60,40,21,19,32,43};
        QuickSort qs=new QuickSort();
        qs.sort(arr,0,arr.length-1);
        System.out.println(Arrays.stream(arr).toList());
    }
}
