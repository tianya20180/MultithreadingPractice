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
public class Print extends Thread{
    private String name;
    public Print(String n){
        super(n);
        name=n;
    }
    
    public void run(){
       for(int i=0;i<5;i++){
           System.out.println(name+" "+i);
       }
    }
    
   
    
}
