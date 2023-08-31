public class Main {
    public static void main(String[] args) {

        int ticketPrice = 25_676; //стоимость билета
        int bonusMoney = 20; // количетсво рублей за которые начисляется 1 миля
        int miles = ticketPrice / bonusMoney; // количество миль

        System.out.println(miles + " бонусных миль");
    }
}