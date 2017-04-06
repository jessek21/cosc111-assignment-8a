/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author mochan
 */
import java.util.Random;
public class GuessGame {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries;
    String history = "";
    
    // Generate a new number for the user to guess
    public void generateNum() {        
        Random rand = new Random();
        num = rand.nextInt(1000) + 1;
    }
    
    // Getters and setters
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
        history = history + guess + ", ";
    }

    public int getTries() {
        return tries++ + 1;
    }
    
    public void resettries(){
        tries = -1;
    }
    
    public void setTries(int tries) {
        this.tries = tries;
    }
    
    public String tryhistory() {
        return history;
    }
    
    public void resethistory(){
        history = "";
    }
    
    
    
}
