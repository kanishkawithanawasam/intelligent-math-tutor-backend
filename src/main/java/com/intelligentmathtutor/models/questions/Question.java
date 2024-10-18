package com.intelligentmathtutor.models.questions;

import java.util.Random;

public abstract class Question {
    private final int level;
    private final int maxTime;
    private String question;
    private final char[] operators;
    private final String[] boolOperators;
    private final String questionTitle;
    Random random ;
    /**
     *
     * @param level defines the level of the question
     * @param maxTime defines the recommended maximum time
     */
    public Question(int level, int maxTime, String questionTitle1) {
        this.level = level;
        this.maxTime = maxTime;
        this.questionTitle = questionTitle1;
        operators = new char[]{'*','-','+','/'};
        boolOperators = new String[]{"<",">","<=",">=","=="};
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

    public String getBoolOperator() {
        return boolOperators[random.nextInt(boolOperators.length)];
    }

    /**
     * Return a random number between min and max.
     * @param min to be given
     * @param max to be give
     * @return random number generated,
     */
    public double getRandomNumber(int min, int max) {
        return random.nextInt(1+max-min)+min;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    @Override
    public String toString() {
        return question;
    }

}
