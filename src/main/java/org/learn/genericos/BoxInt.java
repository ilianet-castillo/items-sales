package org.learn.genericos;

public class BoxInt {
     private int one;
     private int two;
     private int three;
     private int four;

     public  boolean AddInt(int elem){
         boolean result = false;
         if(one==0){
             one=elem;
             result=true;
         }
         else if(two==0){
             two=elem;
             result=true;
         }
        else if(three==0){
             three=elem;
             result=true;
         }
        else if (four==0){
             four=elem;
             result=true;
         }
        else {
             System.out.println("This box is full");
         }
        return result;
     }

    @Override
    public String toString() {
        return "BoxInt{" +
                "one=" + one +
                ", two=" + two +
                ", three=" + three +
                ", four=" + four +
                '}';
    }
}
