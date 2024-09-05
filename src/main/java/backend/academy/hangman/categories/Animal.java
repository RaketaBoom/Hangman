package backend.academy.hangman.categories;

public class Animal extends Category {

    static {
        easyWords = new String[]{
            "Cat", "Dog", "Lion", "Bear", "Wolf",
            "Crab", "Ant", "Frog", "Duck", "Hawk",
            "Fish", "Deer", "Goat", "Bat", "Swan"
        };
        mediumWords = new String[]{
            "Beaver", "Gopher", "Donkey", "Jaguar", "Parrot",
            "Rabbit", "Salmon", "Turtle", "Ocelot", "Bison",
            "Lobster", "Panda", "Cheetah", "Penguin", "Giraffe"
        };
        hardWords = new String[]{
            "Elephant", "Giraffe", "Kangaroo", "Rhinoceros", "Alligator",
            "Chimpanzee", "Ostrich", "Gorilla", "Armadillo", "Crocodile",
            "Cheetah", "Penguin", "Rottweiler", "Hippopotamus", "Orangutan"
        };

    }
}
