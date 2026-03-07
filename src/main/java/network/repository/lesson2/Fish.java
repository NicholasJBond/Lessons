package network.repository.lesson2;

public class Fish {
    private String name;
    private int age;
    private String colour;

    public Fish(String name, int yearsOld, String colour){
        this.name = name;
        this.age = yearsOld;
        this.colour = colour;
    }

    public void swim(){
        System.out.println("Fish: "+ name + " is swimming");
    }

    public void feed(){
        System.out.println("Fish: " + this.name + " loved the delicious food you gave it");
    }
}
