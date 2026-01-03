public class Calculator {
    private String calculatorId;
    private int result;
    private UserInterface user;


    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
       public int calculate(int a) {return a + a;}

       public int calculate(int a, int b){
           return a + b;
        }

       public int calculate(int a, int b, int c){
                    return a + b + c;
    }
    int compute() {
        return user.getNum1() + user.getNum2();
    }

    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }
}
