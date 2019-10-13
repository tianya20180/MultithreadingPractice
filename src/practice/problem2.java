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
public class problem2 {
    
    public static void main(String[] args){
        PrintNum p=new PrintNum();
        Thread t1=new Thread(p);
        Thread t2=new Thread(p);
        t1.start();
        t2.start();
    }
    
    
    
}
