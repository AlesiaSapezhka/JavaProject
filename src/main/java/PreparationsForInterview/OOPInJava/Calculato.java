package PreparationsForInterview.OOPInJava;

public class Calculato {

    private final Operation operation;

    public Calculato(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
         return operation.apply(a,b);
    }
}
