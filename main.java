public class main {
    // Entry point of the program
    public static void main(String[] args) {
        
        // Create a Dog object
        Dog myDog = new Dog();
        // Call the bark() method from Dog class. Loop 3 times
        for (int i = 1; i <= 3; i++){
            myDog.bark(i);
        }           
        
        // Create a Cat object
        Cat myCat = new Cat();
        // Call the meow() method from Cat class. Loop 5 times
        for (int i = 1; i <= 5; i++){
            myCat.meow(i);
        }        

        Chicken myChicken = new Chicken();
        for (int i = 1; i <= 7; i++){
            myChicken.cluck(i);
        }        

        Cow myCow = new Cow();
        for (int i = 1; i <= 9; i++){
            myCow.moo(i);
        }        
    }
}