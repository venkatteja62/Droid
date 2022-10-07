public class Droid {
    static int batterypercentage;
      Droid ()
    {
        batterypercentage =100;
    }
    public static void  active()
    {
        System.out.println("Activated , Droid is working");
        batterypercentage = batterypercentage - 5;
        System.out.println("Battery percent is:"+batterypercentage+"%");
    }
    public static void chargeBattery(int hours)
    {
        if (hours+batterypercentage > 100) {
            batterypercentage = 100;
            System.out.println("Battery charged & battery percent:"+batterypercentage+"+");
        }
        else {
            batterypercentage = batterypercentage + hours;
            System.out.println("Battery charged & battery percent:" + batterypercentage + "+");
        }
    }
    public static void hover(int feet) {
          if (feet >5)
          {
              System.out.println("i can't fly abov 5 feet");
          }
          else
              batterypercentage -= 10;
        System.out.println("Battery percent:"+batterypercentage+"+");

    }
}
