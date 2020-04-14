package com.company.builder;

public class Client {
    public static void main(){
        ProblemCat problemCat = new ProblemCat("Mruczuś", "Black", 3, "Tomson");
        System.out.println(problemCat);
        Cat cat = new Cat.Builder("Mruczuś")
                .color("Black")
                .age(3)
                .owner("Tomson")
                .build();
        System.out.println(cat);
    }
}
