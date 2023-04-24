public class BmiService {
    public int calculate(double weightkg, double heightM) {
        int index = (int) (weightkg / (heightM * heightM));
        System.out.println(" Вес " + weightkg + " кг ");
        System.out.println(" Рост " + heightM + " м ");
        return index;

    }
}
