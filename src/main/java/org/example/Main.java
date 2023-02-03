package org.example;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Animal> zoo = new Vector<Animal>();
        Animal a1 = new Animal("Lion", 'c');
        zoo.add(a1);
        Animal a2 = new Animal("Cow", 'h');
        zoo.add(a2);
        Animal a3 = new Animal("Horse", 'h');
        zoo.add(a3);
        Animal a4 = new Animal("Panther", 'c');
        zoo.add(a4);

        List<Animal> carnivorous = new Vector<Animal>();
        List<Animal> herbivorous = new Vector<Animal>();

        for(Animal a : zoo){
            boolean b = filterAnimals(a);
            if (b){
                carnivorous.add(a);
            }else herbivorous.add(a);
        }
        for(Animal a : carnivorous){
            System.out.println(a.getName());
        }
        for(Animal a : herbivorous){
            System.out.println(a.getName());
        }





    }

   private static boolean filterAnimals(Animal a){
        if (a.getType() == 'c')
               return true;
            else
                return false;
   }
}