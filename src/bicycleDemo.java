class bicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on 
        // those objects
        bike1.smoothLang(50);
        bike1.bilisGar(10);
        bike1.kambyoNaGar(2);
        bike1.printStates();

        bike2.smoothLang(50);
        bike2.bilisGar(10);
        bike2.kambyoNaGar(2);
        bike2.smoothLang(40);
        bike2.bilisGar(10);
        bike2.kambyoNaGar(3);
        bike2.printStates();
    }
}

