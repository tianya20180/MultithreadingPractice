/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import problem.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wangxi
 */
public class Consumer implements Runnable{
      private Storage2 storage;
   public Consumer(){}
   public Consumer(Storage2 storage,String name ){
       this.storage=storage;
   }
    
    
    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                storage.consume();
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
