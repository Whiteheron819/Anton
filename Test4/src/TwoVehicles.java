public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();


        // Присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Рассчитать дальность поездки при полном баке

        System.out.println("Минивэн может перевезти " + minivan.passengers
                + " пассажиров на расстояние " + minivan.range() + " миль");
        System.out.println("Спорткар может перевезти " + sportscar.passengers
                + " пассажиров на расстояние " + sportscar.range() + " миль");


    }
}
