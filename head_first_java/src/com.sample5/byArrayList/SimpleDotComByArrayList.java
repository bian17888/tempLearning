package com.sample5.byArrayList;


import java.util.ArrayList;

class SimpleDotComByArrayList {
    private int numOfHits;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        this.locationCells = loc;
    }

    public String checkYourself(String userGuess) {
        String result = "miss";

        if(locationCells.contains(userGuess)){
            locationCells.remove(userGuess);
            result = "hit";
        }
        if (locationCells.isEmpty()) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}