public class Hackathon {
    private static final int MAX_NO_OF_PROJECTS = 6; //9
    private static final int INDICATOR_COUNT = 4;
    private static final double[] INDICATOR_WEIGHTS = new double[] {0.1, 0.25, 0.3, 0.35};
    private int projectCount;
    private Project[] projects;
    public Hackathon(){
        this.projectCount = 0;
        this.projects = new Project[MAX_NO_OF_PROJECTS];
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
    public void addProject(Project project){
        projects[projectCount] = project;
        projectCount++;
        project.setHackathon(this);  //hackathon object
    }
    public String toString(){
       String result = "";
        for(int i=0; i<projects.length; i++){
            result += projects[i] +"\n";
        }
        return result;
    }
    public static void main(String[] args) {
        Hackathon hackathon = new Hackathon();
        Project project1 = new Project("A1",100,240,15,26);
        Project project2 = new Project("A2",20,407,13,11);
        Project project3 = new Project("A3",100,281,13,39);
        Project project4 = new Project("A4",80,1264,4,38);
        Project project5 = new Project("A5",20,1020,12,11);
        Project project6 = new Project("A6",100,1262,17,34);
        hackathon.addProject(project1);
        hackathon.addProject(project2);
        hackathon.addProject(project3);
        hackathon.addProject(project4);
        hackathon.addProject(project5);
        hackathon.addProject(project6);
        System.out.println("Initial Table");
        System.out.println("***********************************************************************");
        System.out.printf("%s%15s%15s%15s%15s","Project ID ","Indicator 1","Indicator 2","Indicator 3","Indicator 4");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("***********************************************************************");
        for(int i = 0; i<hackathon.projects.length; i++){
            hackathon.projects[i].calcModifiedScores();
        }
        System.out.println("Modified Table");
        System.out.println("***********************************************************************");
        System.out.printf("%s%15s%15s%15s%15s","Project ID ","Indicator 1","Indicator 2","Indicator 3","Indicator 4");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("***********************************************************************");
        for(int i = 0; i<hackathon.projects.length; i++){
            hackathon.projects[i].calcWeightAvg();
            hackathon.projects[i].calcSegment();
            hackathon.projects[i].calcCredibility();
        }
        System.out.println("Final Table");
        System.out.println("************************************************************************************************************************");
        System.out.printf("%s%15s%15s%15s%15s%18s%12s%16s", "Project ID","Indicator 1","Indicator 2","Indicator 3","Indicator 4","Weighted Mean"
        ,"Segment","Credibility");
        System.out.println();
        System.out.println(hackathon);
        System.out.println("************************************************************************************************************************");
        }
        
    }
