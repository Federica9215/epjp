
package b06.s066;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2]; //barkers=reference che si riferisce all'interfaccia
        
        barkers[0] = new Fox();
        barkers[1] = new Dog();

        for(Barker barker: barkers) {
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog(); //baw=reference che si riferisce all'interfaccia BarkAndWag
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog(); //dog=reference che si riferisce all'oggetto Dog
        System.out.println(dog.bark(3));
    }
}
