public class Main
{
    public static void main(String[] args)
    {
        //A program that uses home maintenance costs for each of the four seasons and returns the total yearly maintenance costs
        //Again, be clear in the output by echoing the values for the seasonal costs when you display the combined total

        double springMaintenance = 420;
        double summerMaintenance = 518.04;
        double fallMaintenance = 580.08;
        double winterMaintenance = 6969.69;
        double yearMaintenance;

        yearMaintenance = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;
        System.out.println("Your spring cost is " + springMaintenance + " and your summer cost is " + summerMaintenance + " and your fall cost is " + fallMaintenance + " and your winter cost is " + winterMaintenance);
        System.out.println("Your total yearly cost is " + yearMaintenance);
    }
}