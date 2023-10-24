package openclose;

public class StandartCinema extends Cinema{
    public StandartCinema(double price){
        this.price = price;
    }
    @Override
    Double calculateAdminFee(){
        return this.price * 10/100;
    }
}
