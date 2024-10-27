package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        bankAccount jeremyPanjaitan = new bankAccount(100);
        jeremyPanjaitan.deposit(10);
        System.out.println(jeremyPanjaitan.getSaldo());
    }
}
