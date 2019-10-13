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

public class Test {
   public static void main(String[] args){
       P p=new P();
       new Thread(new Runnable(){
           @Override
           public void run() {
            for(int i=0;i<1000;i++){
                       p.print();
                   }           
           }
       }).start();
       
   }
}

 class P {
    int a;
    public synchronized void print(){
        a++;
        System.out.println(a);
    }
}
