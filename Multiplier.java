public class Multiplier extends Calculator implements MultiplierInterface{
    private UserInterface user;
    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }

    public Multiplier()
    {

    }
    public Multiplier(String calculateId)
    {
        this.setCalculatorId(calculateId);
    }

@Override
public int compute()
{
    setResult(user.getNum1()*user.getNum2()*user.getNum3());
    return this.getResult();
}

}
