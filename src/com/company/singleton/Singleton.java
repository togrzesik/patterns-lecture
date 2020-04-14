package com.company.singleton;

public class Singleton {

    // należy zwrócić uwagę na użycie słowa kluczowego volatile
    private static volatile Singleton instance = null;

    // żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
