public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(89, 1.82);
        System.out.println(" Индекс массы тела " + index);
    }
}