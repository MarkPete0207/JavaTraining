class bicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        Bicycle yourBike = new Bicycle();
        
      //  Track track1 = new Track();

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
        
        yourBike.smoothLang(123);
        yourBike.bilisGar(213123);
        yourBike.kambyoNaGar(323);
        yourBike.smoothLang(2332);
        yourBike.bilisGar(1024);
        yourBike.kambyoNaGar(24);
        yourBike.printStates();
        
        
    }
}

