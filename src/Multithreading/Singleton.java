package Multithreading;

public class Singleton {
    private static Singleton object;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if(object == null) {
            object = new Singleton();
        }


        return object;
    }

    public void print() {
        System.out.println("Your Program is Up and Running.");
    }
}

class Main {
    public static void main(String[] args) {
        Singleton db1;

        // refers to the only object of Singleton
        db1= Singleton.getInstance();

        db1.print();
    }
}
