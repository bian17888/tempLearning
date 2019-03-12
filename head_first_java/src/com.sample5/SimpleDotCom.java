package com.sample5;

class SimpleDotCom {
    private int numOfHits;
    private int[] locationCells;

    public void setLocationCells(int[] loc) {
        this.locationCells = loc;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        for (int i = 0; i < locationCells.length; i++) {
            if (locationCells[i] == guess) {
                locationCells[i] = -1;
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}