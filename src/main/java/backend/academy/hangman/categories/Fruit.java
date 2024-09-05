package backend.academy.hangman.categories;

public class Fruit extends Category {

    static {
        easyWords = new String[]{
            "Apple", "Banana", "Cherry", "Grape", "Lemon",
            "Mango", "Peach", "Plum", "Pear", "Fig",
            "Kiwi", "Nuts", "Dates", "Lime", "Coconut"
        };
        mediumWords = new String[]{
            "Orange", "Papaya", "Pineapple", "Avocado", "Melon",
            "Raspberry", "Blueberry", "Guava", "Lychee", "Pomegranate",
            "Jackfruit", "Apricot", "Passionfruit", "Cantaloupe", "Tangerine"
        };
        hardWords = new String[]{
            "Pomegranate", "Passionfruit", "Blueberry", "Cantaloupe", "Jackfruit",
            "Kumquat", "Rhubarb", "Longan", "Salak", "Durian",
            "Starfruit", "Pomelo", "Cherimoya", "Mangosteen", "Feijoa"
        };
    }
}

