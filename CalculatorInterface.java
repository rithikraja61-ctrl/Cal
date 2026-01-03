public interface CalculatorInterface {
    public void setResult(int result);
    public int getResult();
    public String getCalculatorId();
    public void setCalculatorId(String calculatorId);
    public int calculate(int a);
    public int calculate(int a, int b);
    public int calculate(int a, int b, int c);
}
