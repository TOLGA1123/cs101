/**
 * Project
 */
import java.util.Arrays;
public class Project {

    private static final int INITIAL = 0;  
    private static final int MODIFIED = 1;
    private static final int FINAL = 2;
    String ID;
    double finalScore;
    String segment = "?";
    String credibility = "?";
    double[] rawScores;
    double[] modifiedScores;
    Hackathon hackathon;
    int scoreType;
    public Project(String ID, int ind1, int ind2, int ind3, int ind4){
        this.ID = ID;
        this.rawScores = new double[] {ind1, ind2, ind3, ind4};
        scoreType = 0;
    }
    public Hackathon getHackathon(){
        return hackathon;
    }
    public void setHackathon(Hackathon hackathon){ 
        this.hackathon = hackathon;
    }
    public void calcModifiedScores(){
        modifiedScores = Arrays.copyOf(rawScores,rawScores.length);
        modifiedScores[0] = modifiedScores[0];
        if(modifiedScores[1]>0 && modifiedScores[1]<=500){
            modifiedScores[1] = 20;
        }
        else if(modifiedScores[1]>500 && modifiedScores[1]<=1000){
            modifiedScores[1] = 80;
        }
        else if(modifiedScores[1]>1000){
            modifiedScores[1] = 100;
        }
        if(modifiedScores[2]>=0 && modifiedScores[2]<6){
            modifiedScores[2] = 100;
        }
        else if(modifiedScores[2]>=6 && modifiedScores[2]<12){
            modifiedScores[2] = 80;
        }
        else if(modifiedScores[2]>=12){
            modifiedScores[2] = 20;
        }
        if(modifiedScores[3]>=0 && modifiedScores[3]<10){
            modifiedScores[3] = 20;
        }
        else if(modifiedScores[3]>=10 && modifiedScores[3]<15){
            modifiedScores[3] = 80;
        }
        else if(modifiedScores[3]>=15){
            modifiedScores[3] = 100;
        }
        rawScores = modifiedScores; // if one changes other changes too because same reference
        scoreType = 1;
    }
    public void calcWeightAvg(){
        double weightedScore1 = modifiedScores[0] * hackathon.getIndicatorWeights()[0];
        double weightedScore2 = modifiedScores[1] * hackathon.getIndicatorWeights()[1];
        double weightedScore3 = modifiedScores[2] * hackathon.getIndicatorWeights()[2];
        double weightedScore4 = modifiedScores[3] * hackathon.getIndicatorWeights()[3];
        finalScore = weightedScore1 + weightedScore2 + weightedScore3 + weightedScore4;
        scoreType = 2;
    }
    public void calcSegment(){
        if(finalScore==100){
            segment = "A+";
        }
        else if(finalScore<100 && finalScore>=90){
            segment = "A";
        }
        else if(finalScore<90 && finalScore>=75){
            segment = "B";
        }
        else if(finalScore<75 && finalScore>=60){
            segment = "C";
        }
        else if(finalScore<60 && finalScore>=40){
            segment = "D";
        }
    }
    public void calcCredibility(){
        if(segment.equals("A+")){
            credibility = "Perfect";
        }
        else if(segment.equals("A")){
            credibility = "Very good";
        }
        else if(segment.equals("B")){
            credibility = "Good";
        }
        else if(segment.equals("C")){
            credibility = "Considerable";
        }
        else{
            credibility = "Not appropriate";
        }
    }
    public String toString(){
        if(scoreType == INITIAL){
            String result = ID + "\t\t";
            for(int i = 0; i<rawScores.length; i++){
                result += rawScores[i] + "\t\t";
            }
            return result;
        }
        else if(scoreType == MODIFIED){
            String result = ID + "\t\t";
            for(int i = 0; i<modifiedScores.length; i++){
                result += modifiedScores[i] + "\t\t";
            }
            return result;
        }
        else if(scoreType == FINAL){
            String result = ID + "\t\t";
            for(int i = 0; i<modifiedScores.length; i++){
                result += modifiedScores[i] + "\t\t";
            }
            result += finalScore +"\t\t";
            result += segment +"\t";
            result += credibility;
            return result;
        }
        else{
            return null;
        }
        
    }

}