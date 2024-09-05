package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Color extends Category {

    static {
        easyWords = new String[]{
            "Red", "Blue", "Green", "Pink", "Gray",
            "Gold", "White", "Black", "Teal", "Beige",
            "Cyan", "Maroon", "Navy", "Olive", "Lime"
        };
        mediumWords = new String[]{
            "Purple", "Orange", "Silver", "Bronze", "Turquoise",
            "Indigo", "Magenta", "Lavender", "Crimson", "Coral",
            "Aqua", "Ivory", "Khaki", "Peach", "Charcoal"
        };
        hardWords = new String[]{
            "Aquamarine", "Periwinkle", "Chartreuse", "Vermilion", "Cerulean",
            "Saffron", "Tangerine", "Fuchsia", "Garnet", "Emerald",
            "Sepia", "Teal", "Raspberry", "Burgundy", "Canary"
        };
    }
}

