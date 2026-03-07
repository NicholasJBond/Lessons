package network.repository.lesson2;

public class Main {
    public static void main(String[] args) {
        Fish bob = new Fish("Robert", 5, "Red");
        Fish bill = new Fish("William", 2, "Orange");
        Fish ben = new Fish("Benjamin", 3, "Yellow");
        bob.swim();
        bill.feed();
        ben.swim();
    }
}
