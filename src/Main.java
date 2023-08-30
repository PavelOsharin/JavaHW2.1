public class Main {
    public static void main(String[] args) {

        int TicketPrice = 25_676; //стоимость билета
        int BonusMoney = 20; // количетсво рублей за которые начисляется 1 миля
        int Miles = TicketPrice / BonusMoney; // количество миль

        System.out.println(Miles + " бонусных миль");
    }
}