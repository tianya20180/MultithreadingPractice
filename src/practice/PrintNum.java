/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wangxi
 */
public class PrintNum implements Runnable{
   private int num=1;
    @Override
    public void run() {
        synchronized(this){
            while(true){
                   notify();
            if(num<=100){
                    try{ 
                sleep(500);
                num++;
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+num);
            }else{
                break;
            }
        
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNum.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            }
         
        }
    }
    
}
