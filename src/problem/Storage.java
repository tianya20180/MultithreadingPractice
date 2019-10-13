/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import problem.*;
import java.util.LinkedList;

/**
 *
 * @author wangxi
 */
/*
1.wait/notify方法实现


*/
public class Storage {
    private final int MAX_SIZE=10;
    private LinkedList<Object>list=new LinkedList<>();
    
    
    public void produce(){
          synchronized(list){
              while(list.size()+1>MAX_SIZE){
                  System.out.println("仓库已满");
                  try{
                      list.wait();
                  }catch(Exception e){
                      e.printStackTrace();
                  }
              }
              list.add(new Object());
              System.out.println("生产者成功生产一个商品：现共有商品"+list.size());
              list.notifyAll();   
          }
    }
    
    public void consumue(){
        synchronized(list){
             while(list.size()==0){
                 System.out.println("仓库为空，无法消费");
                 try{
                     list.wait();
                 }catch(Exception e){
                     e.printStackTrace();
                 }
             }
             list.remove();
             System.out.println("已消费一个产品，目前共有产品"+list.size());
             list.notifyAll();
        
        
        }    
    
    }
    
    
}
