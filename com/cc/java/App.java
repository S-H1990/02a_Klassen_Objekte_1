package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        // Instanziierung -->Erzeugen eines Objektes
        // System.out.println(new Cat());

        //cat -->Referenzvariable|verweiss
        //Cat -->Referenzetyp(Klasse)
      Cat cat = new Cat();
      //System.out.println(cat);
      System.out.println("Blick von aussen: " + cat);
      cat.tellYourAdress();



      System.out.println("----------------------------");
      
      Cat cat2 = new Cat();
      //System.out.println(cat2);
        System.out.println("Blick von aussen: " + cat2);
      cat2.tellYourAdress();

    }

   


}

