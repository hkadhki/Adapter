public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        double sum = target.newFormula()
                    .addOperand(arg0)
                    .addOperand(arg1)
                    .calculate(Calculator.Operation.SUM)
                    .result;
        return (int)sum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double mult = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int)mult;
    }

    @Override
    public int pow(int a, int b) {
        double pow = 1;
        for (int i = 0;i < b;i++){
            pow = target.newFormula()
                    .addOperand(pow)
                    .addOperand(a)
                    .calculate(Calculator.Operation.MULT)
                    .result;
        }
        return (int)pow;
    }
}