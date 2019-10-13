/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author wangxi
 */

/*
现在有T1、T2、T3三个线程，
你怎样保证T2在T1执行完后执行，
T3在T2执行完后执行？
*/



public class problem1 {
    
    public static void main(String[] args){
       Print p=new Print("t1");
       Print p2=new Print("t2");
       Print p3=new Print("t3");
       try{
       p.start();
       p.join();
       p2.start();
       p2.join();
       p3.start();
        p3.join();
       }catch(Exception e){
       }  
    }
    
    
}
