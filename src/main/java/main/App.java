package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Hedgehog hedgehog = new Hedgehog();

        boolean exit = false;

        while(!exit)    {

            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");


            if(sc.hasNext()) {
                int i = 0;
                String stringinput =sc.nextLine();
                i = Integer.parseInt(stringinput);




                switch (i) {

                    case 1:

                        System.out.println("Mitä siili sanoo?");
                        String speak = sc.nextLine();
                        hedgehog.speak(speak);
                        
                        

                        break;

                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String ageString = sc.nextLine();
                        int age = Integer.parseInt(ageString);

                        hedgehog = new Hedgehog(name, age);

                        break;

                    case 3:  
                        System.out.println("Kuinka monta kierrosta?");
                        String lapsString = sc.nextLine();
                        int laps = Integer.parseInt(lapsString);
                    
                        hedgehog.run(laps);
                        
                        break;

                    case 0:
                         System.out.println("Kiitos ohjelman käytöstä.");
                         exit = true;

                         break;

                    default:

                        System.out.println("Syöte oli väärä");
                        break;
                }

            }




        }

        sc.close();

    }




}
