package javaexample;

/**
 * @author: nc
 * @description：
 */

public class ProducerConsumerTest {
    public static void main(String[] args) {
        CubbHole c =new CubbHole();
        Producer p1 = new Producer(c,1);
        Consumer c1 = new Consumer(c,1);
        p1.start();
        c1.start();
    }
}


class CubbHole{
    private  int content;
    private boolean available = false;
    public  synchronized int get(){
        while (available == false){
            try {
                wait();
            }catch (InterruptedException e){

            }
        }
        available = false;
        notifyAll();
        return content;
    }

    public synchronized void put(int value){
        while (available == true){
            try {
                wait();
            }catch (InterruptedException e){

            }
            content =value;
            available = true;
            notifyAll();
        }
    }
}



class Consumer extends Thread{
    private CubbHole cubbHole;
    private int number;
    public Consumer(CubbHole c,int number){
        cubbHole =c;
        this.number=number;
    }

    public void run(){
        int value =0;
        for(int i=0;i<10;i++){
            value = cubbHole.get();
            System.out.println("消费者 #"+this.number+" got:"+value);
        }
    }
}

 class Producer extends Thread{
    private CubbHole cubbHole;
    private int number;
    public Producer(CubbHole c,int number){
        cubbHole = c;
        this.number = number;
    }

    public void run(){
        for (int i=0; i<10 ; i++){
            cubbHole.put(i);
            System.out.println("生产者 #"+ this.number +" put:"+i);

            try {
                sleep((int)Math.random()*100);
            }catch (InterruptedException e){}
        }
    }
 }