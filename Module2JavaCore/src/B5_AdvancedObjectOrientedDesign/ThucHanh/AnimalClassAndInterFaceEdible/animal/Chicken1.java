package B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.animal;

import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.edible.Edible;

public class Chicken1 extends Animal implements Edible {
    public String makeSound() {
        return  " Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }
}
