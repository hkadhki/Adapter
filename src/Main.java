public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Ints ints = new IntsCalculator();
        System.out.println("Сумма " + a + " и " + b + " равна: " + ints.sum(a,b) );
        System.out.println("Произведение " + a + " и " + b + " равно: " + ints.mult(a,b) );
        System.out.println(a + " в степени " + b + " равно: " + ints.pow(a,b) );
    }

}