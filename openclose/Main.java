package openclose;

public class Main {
    public static void main (String[] args){
        StandartCinema standartCinema = new StandartCinema(100);
        Double adminFee = standartCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
