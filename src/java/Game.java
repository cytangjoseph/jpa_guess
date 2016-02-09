//unit 5, p 38
//project: number 3
//author: cytangjoseph
//using facelets in JSF

import javax.inject.Named; // CDI bean
import javax.enterprise.context.SessionScoped;//data in the bean instance are specific to a user session
import java.io.Serializable;

@Named//CDI annotation
@SessionScoped
public class Game implements Serializable {
    private int number=33;
    private Integer guess;
    private int trials;
    private String message;
    
    //getters and setters
    public Integer getGuess() {return guess;}
    public void setGuess(Integer guess){this.guess=guess;}
    
    public int getTrials(){return trials;}
    public void setTrials(int trials) {this.trials = trials;}
    
    public String getMessage(){return message;}
    public void setMessage(String msg){this.message = msg;}
    
    public void doGuess(){
        trials++;
        if (guess > number) {
            message = "Your guess, " + guess +
                      ", is higher than my number";
        } else if (guess < number) {
            message = "Your guess, " + guess +
                      ", is lower than my number";
        } else {
            message = "Congratulations! Your guess," + guess +
                      ", is my number";
        }
    }
    
    @Override
    public String toString() {
        return "Game{" + "number=" + number + ", guess=" + guess
                + ", trials=" + trials + ", message" + message
                + '}';
        
    }
}
