/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 死锁;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wangxi
 */
public class DeadLockDemo {
    private static String lock1="A";
    private static String lock2="B";
    
    public static void main(String[] args){
        deadLock();
    }
    
    public static void deadLock(){
       Thread threadA=new Thread(new Runnable(
       ) {
           @Override
           public void run() {
               synchronized(lock1){
                   try {
                       Thread.currentThread().sleep(1000);
                  
                   } catch (InterruptedException ex) {
                   }
                        synchronized(lock2){
                           System.out.println("AB");
                       }
                  
               }
           }
       }) ;
       Thread threadB=new Thread(new Runnable(
       ) {
           @Override
           public void run() {
               synchronized(lock2){
                   try {
                       Thread.currentThread().sleep(1000);
                  
                   } catch (InterruptedException ex) {
                   }
                        synchronized(lock1){
                           System.out.println("BA");
                       }
                  
               }
           }
       }) ;
       threadA.start();
       threadB.start();
    }
    
}
