package com.chiefSession;

public class SchoolAdmin {
    private int scores[][] = new int[2][5];
    private double averageScores[];

    public SchoolAdmin(){}

    public SchoolAdmin(int scores[][]){
        this.scores = scores;
    }

    public int[][] getScores() {
        return scores;
    }

    public void setScores(int[][] scores) {
        this.scores = scores;
    }

    public double[] getAverageScores() {
        return averageScores;
    }

    public void setAverageScores(double[] averageScores) {
        this.averageScores = averageScores;
    }
}
