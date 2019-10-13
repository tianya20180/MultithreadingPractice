/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import problem.*;

/**
 *
 * @author wangxi
 */
public class Main {
    public static void main(String[] args){
         Storage2 s=new Storage2();
         
         Thread p1=new Thread(new Producer(s,"p1"));
         Thread p2=new Thread(new Producer(s,"p2"));
         Thread p3=new Thread(new Producer(s,"p3"));
         
           Thread t1=new Thread(new Consumer(s,"t1"));
         Thread t2=new Thread(new Consumer(s,"t2"));
         Thread t3=new Thread(new Consumer(s,"t3"));
         
         
         p1.start();
         p2.start();
         p3.start();
         
         t1.start();
         t2.start();
         t3.start();
         
    }
}
