package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Sport extends Category {

    static {
        easyWords = new String[]{
            "Soccer", "Tennis", "Baseball", "Golf", "Hockey",
            "Rugby", "Boxing", "Cricket", "Table Tennis", "Skiing",
            "Cycling", "Diving", "Rowing", "Sailing", "Surfing"
        };
        mediumWords = new String[]{
            "Basketball", "Volleyball", "Badminton", "Wrestling", "Gymnastics",
            "Triathlon", "Skateboarding", "Snowboarding", "Fencing", "Judo",
            "Horseback", "Lacrosse", "Curling", "Handball", "Softball"
        };
        hardWords = new String[]{
            "Synchronised Swimming", "Ultimate Frisbee", "Bobsledding", "Korfball", "Pentathlon",
            "Sepak Takraw", "Bandy", "Water Polo", "Floorball", "Dodgeball",
            "Synchronized Swimming", "Triathlon", "Modern Pentathlon", "Orienteering", "Luge"
        };
    }
}

