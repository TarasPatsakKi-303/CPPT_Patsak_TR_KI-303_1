package Lab4;

public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=sin(x)/tg(4x)   = " + calc.doCalculation(200));
        System.out.println("  y=sin(x)/tg(4x)   = " + calc.doCalculation(30));
        System.out.println("  y=sin(x)/tg(4x)   = " + calc.doCalculation(-2222));

        System.out.println("  y=sin(x)/tg(4x)   = " + calc.doCalculationWithInputInside());
    }
}


