package lab1;

public class Lab01_Q3 {
    
    public static void main(String[] args) {
   
        final long TOTAL_AREA_OF_THE_WORLD = 510072000;
        long waterAreaOfWorld = (long)  (TOTAL_AREA_OF_THE_WORLD*70.8/100);
        long dryAreaOfWorld = (long) (TOTAL_AREA_OF_THE_WORLD*(1-70.8/100));
        final long AREA_OF_TURKEY = (long) (TOTAL_AREA_OF_THE_WORLD*0.1536/100);
        double waterAreaOfTurkey =  (AREA_OF_TURKEY*1.3/100);
        double dryAreaOfTurkey =   (AREA_OF_TURKEY*(1-1.3/100));
        double  totalDryLandPerTurkeyInWorld = (dryAreaOfTurkey/dryAreaOfWorld*100);
        double totalWaterPerTurkeyInWorld = (waterAreaOfTurkey/waterAreaOfWorld*100);
      System.out.print("Earth has " );
      System.out.print(dryAreaOfWorld);
      System.out.print(" km2 land and ");
      System.out.print(waterAreaOfWorld);
      System.out.println(" km2 water.");
      System.out.print("Turkey has ");
      System.out.print(Math.round(dryAreaOfTurkey));
      System.out.print(" km2 dry land and ");
      System.out.print(Math.round(waterAreaOfTurkey));
      System.out.println(" km2 water. ");
      System.out.print("Turkey has ");
      System.out.print(totalDryLandPerTurkeyInWorld);
      System.out.println(" percent of the Earth's dry land.");
      System.out.print("Turkey has ");
      System.out.print(totalWaterPerTurkeyInWorld);
      System.out.println(" percent of the Earth's water.");





       

    }
}

