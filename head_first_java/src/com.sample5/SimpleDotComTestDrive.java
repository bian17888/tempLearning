package com.sample5;

/**
 * Created by bian17888 on 2018/7/5.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locationCells = {2,3,4};
        dot.setLocationCells(locationCells);

        System.out.println("assets is miss --- " + dot.checkYourself("1"));
        System.out.println("assets is hit --- " + dot.checkYourself("2"));
        System.out.println("assets is hit --- " + dot.checkYourself("3"));
        System.out.println("assets is kill --- " + dot.checkYourself("4"));
    }
}
