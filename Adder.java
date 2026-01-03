public class Adder extends Calculator implements AdderInterface{
    private String calculatorId;
    private UserInterface user;
Adder()
{

}
    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }
  public Adder(String calculatorId)
  {
      this.calculatorId=calculatorId;
  }
    public String getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(String calculatorId) {
        this.calculatorId = calculatorId;
    }
 @Override
   public int compute()
    {
        setResult(user.getNum1()*user.getNum2()*user.getNum3());
        return this.getResult();
    }


}
