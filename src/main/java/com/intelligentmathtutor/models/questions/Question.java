package com.intelligentmathtutor.models.questions;

import java.util.Random;

public abstract class Question {
    private final int level;
    private final int maxTime;
    private String question;
    private final char[] operators;
    Random random ;
    /**
     *
     * @param level defines the level of the question
     * @param maxTime defines the recommended maximum time
     */
    public Question(int level, int maxTime) {
        this.level = level;
        this.maxTime = maxTime;
        operators = new char[]{'*','-','+','/'};
        random = new Random();
    }

    /**
     *
     * @return the maximum time recommended for a question
     */
    public int getMaxTime() {
        return maxTime;
    }

    public int getLevel() {
        return level;
    }

    /**
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Saves the question
     * @param question :  Question to be set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @return an operator from operator list ['*','-','+','/']
     */
    public char getOperator() {
        return operators[random.nextInt(operators.length)];
    }

    /**
     * Retrun a random number between min and max.
     * @param min to be given
     * @param max to be give
     * @return random number generated,
     */
    public double getRandomNumber(int min, int max) {
        return random.nextInt(1+max-min)+min;
    }

    @Override
    public String toString() {
        return question;
    }
}
