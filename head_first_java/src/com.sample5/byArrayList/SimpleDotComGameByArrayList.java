package com.sample5.byArrayList;

import com.sample5.GameHelper;

import java.util.ArrayList;

/**
 * Created by bian17888 on 2018/7/5.
 */
public class SimpleDotComGameByArrayList {
    public static void main(String[] args) {
        int numOfGuess = 0;
        boolean isLive = true;
        int numOfRandom = (int) (Math.random() * 5);
        ArrayList<String> locationCells = new ArrayList();
        locationCells.add(Integer.toString(numOfRandom));
        locationCells.add(Integer.toString(numOfRandom + 1));
        locationCells.add(Integer.toString(numOfRandom + 2));

        SimpleDotComByArrayList dot = new SimpleDotComByArrayList();
        GameHelper gameHelper = new GameHelper();

        dot.setLocationCells(locationCells);

        while (isLive) {
            // 提示用户输入
            String userGuess = gameHelper.getUserInput("enter a number");
            String result = dot.checkYourself(userGuess);
            numOfGuess++;
            if (result.equals("kill")) {
                isLive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}
