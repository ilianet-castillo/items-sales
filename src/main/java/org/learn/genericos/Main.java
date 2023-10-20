package org.learn.genericos;

public class Main {

    public static void main(String[] args){
        System.out.println("Contenido de la caja de enteros");
      //  BoxInt a = new BoxInt();
      //  a.AddInt(2);
      //  a.AddInt(4);
      //  a.AddInt(7);
      //  a.AddInt(9);
       // System.out.println(a);
// BoxAny<Integer> boxAny =new BoxAny<>();
   //     System.out.println(boxAny);

        Log<String,String> log1 = new Log<>("primaria", "menor");
        Log<String,Integer> log2 =new Log<>("mayor", 2);
        System.out.println(log1);
        System.out.println(log2);

    }
}
