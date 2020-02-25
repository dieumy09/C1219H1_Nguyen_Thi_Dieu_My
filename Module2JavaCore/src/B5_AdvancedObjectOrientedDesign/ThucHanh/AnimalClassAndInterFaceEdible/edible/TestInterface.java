package B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.edible;

import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.animal.Animal;
import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.animal.Chicken1;
import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.animal.Tiger;
import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.fruit.Apple;
import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.fruit.Fruit;
import B5_AdvancedObjectOrientedDesign.ThucHanh.AnimalClassAndInterFaceEdible.fruit.Orange;

public class TestInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken1();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken1) {
                Edible edible = (Chicken1) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Orange();
        fruit[1] = new Apple();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.howToEat());
        }
    }
}
