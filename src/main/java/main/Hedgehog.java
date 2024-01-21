package main;

public class Hedgehog {
    private String name;
    private int age;


public Hedgehog()   {
    name = "Pikseli";
    age = 5;


}


public Hedgehog(String name, int age)   {
    this.name = name;
    this.age = age;


}

public void setName(String name) {

    this.name = name;

}

public String getName()   {

    return name;
}


public void run(int laps)   {
    for (int i = 0; i< laps; i++)   {
        System.out.println(name + " juoksee kovaa vauhtia!");
    }
}

public void speak(String words) {
    if (words.isEmpty())    {
        System.out.println("Olen " + name + " ja ikäni on " + age + ", mutta antaisitko silti syötteen?");
    } 
        else {System.out.println(name + ": " + words );
        }

    
}



}