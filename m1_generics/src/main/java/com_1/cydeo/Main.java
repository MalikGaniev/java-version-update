package com_1.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items =new ArrayList<>();//ArrayList only accepts objects belongs to Integer Class
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("Apple");
        String abc="ozzy";
        printDoubled(items);
        System.out.println("--------------------------------------------------");


        FootballPlayer joe=new FootballPlayer("joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
        SoccerPlayer beckham=new SoccerPlayer("Beckham");
        Team<SoccerPlayer> liverPool=new Team("Liverpool");//Team accepting any object
     //  liverPool.addPlayer(joe);
       // liverPool.addPlayer(pat);
        liverPool.addPlayer(beckham);
        // Team<String>brokeTeam=new Team<>("What kind of team is this?");


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(int i:items){
            System.out.println( i+2);
        }
    }
}
