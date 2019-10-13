/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author wangxi
 * 利用信号量来解决生产者消费者
 */
public class Storage2 {
    private LinkedList<Object>list=new LinkedList<Object>();
    final Semaphore notFull=new Semaphore(10);
    final Semaphore notEmpty=new Semaphore(0);
    final Semaphore mutex=new Semaphore(1);
    
    
    public void produce(){
        
        try{
            notFull.acquire();
            mutex.acquire();
            list.add(new Object());
            System.out.println("生产者成功生产一个商品：现共有商品"+list.size());

            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            mutex.release();
            notEmpty.release();
        }
    
    }
    
    
    public void consume(){
        
        try{
           notEmpty.acquire();
           mutex.acquire();
           list.remove();
           System.out.println("已消费一个产品，目前共有产品"+list.size());

        }
        catch(Exception e){
              e.printStackTrace();
        }
        finally{
            mutex.release();
            notFull.release();
        }
    
    }
    
    
}
