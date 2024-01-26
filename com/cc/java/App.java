package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt erzeugen
        Cat cat = new Cat("Alonzo", "grey", 35); 

        // Ausgabe
        output(cat.tellYourName());
        output(cat.tellYourFurColor());
        output(String.valueOf(cat.tellYourAge()));  // int --> String

        //output(cat.name);

        output("---------------");

        Cat cat2 = new Cat("Grizabella", "white", 29);

        //cat2.furColor = "grey";

        // Ausgabe
        output(cat2.tellYourName());
        output(cat2.tellYourFurColor());
        output(Integer.toString(cat2.tellYourAge()));  // int --> String

    }

   // statische Methode --- in Klasse
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
      

}

