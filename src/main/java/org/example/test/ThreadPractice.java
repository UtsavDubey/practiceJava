package org.example.test;

public class ThreadPractice extends Thread{

    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName()+" "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String args[]) throws InterruptedException {
        ThreadPractice th1=new ThreadPractice();
        ThreadPractice th2=new ThreadPractice();
        ThreadPractice th3=new ThreadPractice();

        th1.start();

        th2.start();
        th1.join();
        th3.start();


    }
}
