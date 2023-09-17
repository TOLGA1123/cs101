import java.util.Arrays;
public class Project_RevisionTue {
    private static final int INITIAL = 0;  
    private static final int MODIFIED = 1;
    private static final int FINAL = 2;
    String ID;
    double finalScore;
    String segment = "?";
    String credibility = "?";
    double[] rawScores;
    double[] modifiedScores;
    Hackathon_RevisionTue hackathonTue;
    int scoreType;
    public Project_RevisionTue(String ID, int ind1, int ind2, int ind3, int ind4, int ind5){
        this.ID = ID;
        this.rawScores = new double[] {ind1, ind2, ind3, ind4, ind5};
        scoreType = 0;
    }
    public String getCredibility(){
        return credibility;
    }
    public double getGoalsSupported(){
        return rawScores[4];
    }
    public double getDuration(){
        return rawScores[2];
    }
    public Hackathon_RevisionTue getHackathon(){
        return hackathonTue;
    }
    public void setHackathon(Hackathon_RevisionTue hackathon){ 
        this.hackathonTue = hackathon;
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
        if(modifiedScores[4]>0 && modifiedScores[4]<=2){
            modifiedScores[4] = 1;
        }
        else if(modifiedScores[4]>2 && modifiedScores[4]<=5){
            modifiedScores[4] = 20;
        }
        else if(modifiedScores[4]>5 && modifiedScores[4]<=10){
            modifiedScores[4] = 80;
        }
        else if(modifiedScores[4]>10){
            modifiedScores[4] = 100;
        }
        scoreType = 1;
    }
    public void calcWeightAvg(){
        double weightedScore1 = modifiedScores[0] * hackathonTue.getIndicatorWeights()[0];
        double weightedScore2 = modifiedScores[1] * hackathonTue.getIndicatorWeights()[1];
        double weightedScore3 = modifiedScores[2] * hackathonTue.getIndicatorWeights()[2];
        double weightedScore4 = modifiedScores[3] * hackathonTue.getIndicatorWeights()[3];
        double weightedScore5 = modifiedScores[4] * hackathonTue.getIndicatorWeights()[4];
        finalScore = weightedScore1 + weightedScore2 + weightedScore3 + weightedScore4 + weightedScore5;
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
       if(modifiedScores[4] == 1){
           credibility = "REMOVED";
       }
       else if(modifiedScores[4] != 1 && segment.equals("A+")){
           credibility = "INVEST";
       }
       else if(modifiedScores[4] !=1 && segment.equals("A")){
           credibility = "INVEST";
       }
       else if(modifiedScores[4] != 1 && modifiedScores[4] != 20 && segment.equals("B")){
           credibility = "INVEST";
       }
       else if(modifiedScores[4] == 100 && segment.equals("C")){
           credibility = "INVEST";
       }
       else if(segment.equals("D")){
           credibility = "DO NOT INVEST";
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
