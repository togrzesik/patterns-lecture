package com.company.obserwator;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
