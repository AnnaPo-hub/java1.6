public class MilesCalculator {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 34000;
        int bonus = service.calculate(ticketPrice);
        System.out.println("После покупки этого билета Вам будет начислено " + bonus + " миль");
    }
}
