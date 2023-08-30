public class Main {
    public static void main(String[] args) {

        int x = 25_676; //стоимость билета
        int y = 20; // количетсво рублей за которые начисляется 1 миля
        int z = x / y; // количество миль

        System.out.println(z + " бонусных миль");
    }
}