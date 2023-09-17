import java.util.Arrays;
public class Hackathon_RevisionTue {
    private static final int MAX_NO_OF_PROJECTS = 6; //9
    private static final int INDICATOR_COUNT = 4;
    private static final double[] INDICATOR_WEIGHTS = new double[] {0.1, 0.2, 0.3, 0.35, 0.05};
    private int projectCount;
    private Project_RevisionTue[] projectsTue;
    public Hackathon_RevisionTue(){
        this.projectCount = 0;
        this.projectsTue = new Project_RevisionTue[MAX_NO_OF_PROJECTS];
    }
    public int getMaxNoOfProjects(){
        return MAX_NO_OF_PROJECTS;
    }
    public int getIndicatorCount(){
        return INDICATOR_COUNT;
    }
    public double[] getIndicatorWeights(){
        return INDICATOR_WEIGHTS;
    }
    public void addProject(Project_RevisionTue project){
        projectsTue[projectCount] = project;
        projectCount++;
        project.setHackathon(this);  //hackathon object
    }
    public String toString(){
       String result = "";
        for(int i=0; i<projectsTue.length; i++){
            result += projectsTue[i] +"\n";
        }
        return result;
    }
    public String[][] makeDecision(){
        int count = 0; 
        for(int i = 0; i<projectsTue.length; i++){
            if(projectsTue[i].getCredibility().equals("INVEST")){
                count ++;
            }
        }
        String [][] decision = new String [count+2][3];
        decision [0][0] = "PROJECT ID" + "\t";
        decision [0][1] = "Goals" + "\t";
        decision[0][2] = "Duration" + "\t";
        int j = 1;
        for(int i = 0; i<projectsTue.length; i++){    
                if(projectsTue[i].getCredibility().equals("INVEST")){
                    decision[j][0] = projectsTue[i].ID +"\t\t";
                    decision[j][1] = String.valueOf(projectsTue[i].getGoalsSupported())+"\t";
                    decision[j][2] = String.valueOf(projectsTue[i].getDuration());
                    j++;
                }
        }
        decision[4][0] = "\t MAX: \t";
        decision [4][1] = "12\t";
        decision [4][2] = "17";

        return decision;
    } 
    public static void main(String[] args) {
        Hackathon_RevisionTue hackathon = new Hackathon_RevisionTue();
        Project_RevisionTue project1 = new Project_RevisionTue("A1",100,240,15,26,12);
        Project_RevisionTue project2 = new Project_RevisionTue("A2",20,407,13,11,1);
        Project_RevisionTue project3 = new Project_RevisionTue("A3",100,281,13,39,9);
        Project_RevisionTue project4 = new Project_RevisionTue("A4",80,1264,4,38,7);
        Project_RevisionTue project5 = new Project_RevisionTue("A5",20,1020,12,11,1);
        Project_RevisionTue project6 = new Project_RevisionTue("A6",100,1262,17,34,6);
        hackathon.addProject(project1);
        hackathon.addProject(project2);
        hackathon.addProject(project3);
        hackathon.addProject(project4);
        hackathon.addProject(project5);
        hackathon.addProject(project6);
        System.out.println("Initial Table");
        System.out.println("***********************************************************************");
        System.out.printf("%s%15s%15s%15s%15s%15s","Project ID ","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Indicator 5");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("***********************************************************************");
        for(int i = 0; i<hackathon.projectsTue.length; i++){
            hackathon.projectsTue[i].calcModifiedScores();
        }
        System.out.println("Modified Table");
        System.out.println("***********************************************************************");
        System.out.printf("%s%15s%15s%15s%15s%15s","Project ID ","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Indicator 5");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("***********************************************************************");
        for(int i = 0; i<hackathon.projectsTue.length; i++){
            hackathon.projectsTue[i].calcWeightAvg();
            hackathon.projectsTue[i].calcSegment();
            hackathon.projectsTue[i].calcCredibility();
        }
        System.out.println("Final Table");
        System.out.println("************************************************************************************************************************");
        System.out.printf("%s%15s%15s%15s%15s%15s%18s%12s%16s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Indicator 5","Weighted Mean"
        ,"Segment","Credibility");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("************************************************************************************************************************");
        System.out.println("Investment Decision");
        System.out.println("*********************************************");
        String [][] decision = hackathon.makeDecision();
        for(int i = 0; i<decision.length; i++){
            for(int j = 0; j<decision[i].length; j++){
                System.out.print(decision[i][j]);
            }
            System.out.println();
        }
        System.out.println("*********************************************");
        }
    
}
