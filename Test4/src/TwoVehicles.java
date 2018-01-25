public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16 ,12);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль минивэну требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");


    }
}
