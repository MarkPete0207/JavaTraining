class Bicycle {

    int smooth = 0;
    int bilis = 0;
    int kambyo = 1;
    int bawas = 0;

    void smoothLang(int newValue) {
         smooth = newValue;
    }

    void kambyoNaGar(int newValue) {
         kambyo = newValue;
    }

    void bilisGar(int increment) {
         bilis = bilis + increment;   
    }

    void boboPreno(int decrement) {
         bawas = bilis - decrement;
    }

    void printStates() {
         System.out.println("smoothness:" +
             smooth + " bilismong Kamote ka :" + 
             bilis + " Kambyo:" + kambyo);
    }
}
