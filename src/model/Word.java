package model;

public class Word {

    private final String[] wordsList = {"Java", "Rio", "Serra", "Computador", "Developer"};

    public Word() {}



    /**
     * This method obtain total array words (total of gaming words to guess)
     * @return total of words (length) existent on array list length
     */
    public int getWordListLenght(){ return wordsList.length; }



    /**
     * Method to get the word position and name
     * @param wordPosition get the word position
     * @return note position/name
     */
    public String getWordPositionAndName(int wordPosition) { return wordsList[wordPosition]; }



}
