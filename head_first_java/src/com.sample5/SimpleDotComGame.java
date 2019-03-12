package com.sample5;

/**
 * Created by bian17888 on 2018/7/5.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        boolean isLive = true;
        int numOfRandom = (int) (Math.random() * 5);
        int[] locationCells = {numOfRandom, numOfRandom + 1, numOfRandom + 2};

        SimpleDotCom dot = new SimpleDotCom();
        GameHelper gameHelper = new GameHelper();

        dot.setLocationCells(locationCells);

        while (isLive) {
            // 提示用户输入
            String userGuess = gameHelper.getUserInput("enter a number");
            String result = dot.checkYourself(userGuess);
            numOfGuess++;
            if(result.equals("kill")) {
                isLive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}
