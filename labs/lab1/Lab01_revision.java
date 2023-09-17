package lab1;
public class Lab01_revision {
    public static void main(String[] args) {
    final long TOTAL_AREA_OF_THE_WORLD = 510072000;
    long waterAreaOfWorld = (long)  (TOTAL_AREA_OF_THE_WORLD*70.8/100); //Total water area of the world
    long dryAreaOfWorld = (long) (TOTAL_AREA_OF_THE_WORLD*(1-70.8/100)); // Total dry area of the world
    final long TOTAL_AREA_OF_GREECE = 131957;// Total area of Greece

    double waterAreaOfGreece = (TOTAL_AREA_OF_GREECE*1.51/100); // Total water area of Greece
    double dryAreaOfGreece = (TOTAL_AREA_OF_GREECE*(1-(1.51/100)));//Total dry area of Greece

    double waterAreaPerGreeceInWorld = (waterAreaOfGreece/waterAreaOfWorld*100); // Water area percentage of Greece compared to the World
    double dryAreaPerGreeceInWorld = (dryAreaOfGreece/dryAreaOfWorld*100);  //Dry area percentage of Greece compared to the World

    System.out.print("Earth has " );
    System.out.print(dryAreaOfWorld);
    System.out.print(" km2 dry land and ");
    System.out.print(waterAreaOfWorld);
    System.out.println(" km2 water.");
    System.out.print("Greece has ");
    System.out.print(Math.round(dryAreaOfGreece));
    System.out.print("km2 dry land and ");
    System.out.print(Math.round(waterAreaOfGreece));
    System.out.println("km2 water");
    System.out.print("Greece has ");
    System.out.print(waterAreaPerGreeceInWorld);
    System.out.println(" percent of Earth's water.");
    System.out.print("Greece has ");
    System.out.print(dryAreaPerGreeceInWorld);
    System.out.print(" percent of Earth's dry land.");



    }
}
