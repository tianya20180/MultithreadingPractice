package practice;

/*
3.编写一个程序，启动三个线程，三个线程的ID分别是A，B，C；，
每个线程将自己的ID值在屏幕上打印5遍，打印顺序是ABCABC...
*/
public class ThreeThread  {
    
    
    public static void main(String[] args) {
        MyObject ob = new MyObject();
        new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i = 0 ; i<10 ; i++)
                    ob.printA();
            }
            
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i = 0 ; i<10 ; i++)
                    ob.printB();
            }
            
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i = 0 ; i<10 ; i++)
                    ob.printC();
            }
            
        }).start();
    }

}

class MyObject  {
    
    private  int flag = 1;
    
    public synchronized void printA(){
        while(flag != 1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            System.out.print("A");
            flag = 2;
            this.notifyAll();
            
        
        
    }
   
    public synchronized void printB(){
        while(flag != 2){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            System.out.print("B");
            flag = 3;
            this.notifyAll();
            
        
        
    }
     public synchronized void printC(){
        while(flag != 3){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            System.out.println("C");
            flag = 1;
            this.notifyAll();
            
        
        
    }
    
}