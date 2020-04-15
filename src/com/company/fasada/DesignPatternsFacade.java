package com.company.fasada;

public class DesignPatternsFacade {
    public static void main(String[] args){

        MainApi mainApi = new MainApi();
        mainApi.lockHome();
        mainApi.unlockHome();
        mainApi.lightOn();
        mainApi.lightOff();
    }
}
