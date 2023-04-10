public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(60, 1.67);
        System.out.println(bmi + "индекс массы тела");
    }

}