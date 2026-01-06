package com.example;

public class Building {
    String name_of_object;
    Double area_of_the_object;
    int numbers_of_rooms;
    int numbers_of_floors;

    public Building( String name_of_object, Double area_of_the_object, int numbers_of_rooms, int numbers_of_floors){
        this.name_of_object = name_of_object;
        this.area_of_the_object = area_of_the_object;
        this.numbers_of_rooms = numbers_of_rooms;
        this.numbers_of_floors = numbers_of_floors;
    }

    public static void main (String[] args){
        System.out.println("---------------Construktors__________________");
        Building building = new Building( "Villa", 60.5, 3, 1);
        System.out.println( building);
    }
}
