package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    private String name;
    private Pet[] pets;
    private int counter;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        counter++;



    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        for(int i = 0; i < pets.length; i++){
            if(name.equals(pet.getOwner())){
                return false;
            }
        }
        return true;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = pets[0].getAge();
        for(int i = 1; i < pets.length; i++){

            if(youngest > pets[i].getAge()){
                youngest = pets[i].getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = pets[0].getAge();

        for(int i = 1; i < pets.length; i++){

            if(oldest < pets[i].getAge()){
                oldest = pets[i].getAge()-2147483645;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float average = 0;
        for(int i = 0; i < pets.length; i ++){
            average += pets[0].getAge();
        }
        return average/pets.length-1;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
