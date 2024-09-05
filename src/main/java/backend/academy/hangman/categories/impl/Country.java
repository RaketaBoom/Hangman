package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Country extends Category {

    static {
        easyWords = new String[]{
            "India", "China", "Japan", "Italy",
            "Spain", "Nepal" , "Canada",
            "Chile", "Peru", "Iraq", "Qatar", "Oman"
        };
        mediumWords = new String[]{
            "Canada", "France",  "Greece", "Denmark",
            "Thailand", "Germany", "Portugal", "Poland", "Morocco",
            "Hungary", "Pakistan", "Croatia", "Belgium"
        };
        hardWords = new String[]{
            "Liechtenstein", "Czechia", "San Marino", "Guinea-Bissau", "Turkmenistan",
            "Mozambique", "Bosnia and Herzegovina", "North Macedonia", "Kyrgyzstan", "Vatican",
            "Papua New Guinea", "Tajikistan", "Brunei"
        };
    }
}
