package com.company.builder;

public class Cat {
    public String name;
    public String color;
    public int age;
    public String owner;

    public Cat(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.age = builder.age;
        this.owner = builder.owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static class Builder {
        private final String name;
        private String color;
        private int age;
        private String owner;

        public Builder(String name) {
            this.name = name;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }
    @Override
    public String toString(){
        return "Cat = " + name + color + age + owner;
    }
}