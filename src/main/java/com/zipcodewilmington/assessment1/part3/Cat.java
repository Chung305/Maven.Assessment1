package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    private String name;
    private Integer age;
    PetOwner chung = new PetOwner(null, null);

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.name = "Cat name";
        this.age = Integer.MAX_VALUE;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name= name;
        this.age = 0;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.name = "Cat name";
        this.age = 0;

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
