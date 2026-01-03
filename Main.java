import java.math.BigInteger;
import java.util.Scanner;

/*
🧮 *Assignment: Calculator System*

*Entities:* User, Adder, Multiplier

─────────────────
*LEVEL 1: Basic (V1)*
─────────────────

*User.java*
• num1, num2, num3, calculatorType
• calculatorId, result
• getters/setters

*Adder.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 + num2 + num3

*Multiplier.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 * num2 * num3

*Main:* Pass data User → Main → Adder/Multiplier → Main → User


*Note all should be with Terminal inputs*

─────────────────
*LEVEL 2: Association (V2)*
─────────────────

*Problem:* Main is middleman

*Solution:* Share addresses!

*User:*
• Remove: calculatorId, result
• Add: adder variable, multiplier variable

*Adder:*
• Remove: num1, num2, num3
• Add: user variable

*Multiplier:*
• Remove: num1, num2, num3
• Add: user variable

─────────────────
*LEVEL 3: Redundancy (Abstract)*
─────────────────

*Problem:* Adder & Multiplier have duplicate code

*Solution:* Create abstract class!
─────────────────
*LEVEL 4: Security (Interface)*
─────────────────

*Problem:* Implementation exposed

*Solution:* Create interfaces!

*CalculatorInterface*
• getCalculatorId(), setCalculatorId()
• getResult(), setResult()
• compute()

*AdderInterface extends CalculatorInterface*

*MultiplierInterface extends CalculatorInterface*

*Updated Classes:*
• Calculator implements CalculatorInterface
• Adder extends Calculator implements AdderInterface
• Multiplier extends Calculator implements MultiplierInterface

─────────────────
*LEVEL 5: Overloading*
─────────────────

*Concept:* Same method name, different parameters

*Add to Calculator.java:*

calculate(int a) → return a + a

calculate(int a, int b) → return a + b

calculate(int a, int b, int c) → return a + b + c

*Usage in Main:*
calculator.calculate(5) → 10
calculator.calculate(5, 3) → 8
calculator.calculate(5, 3, 2) → 10

─────────────────
*LEVEL 6: Overriding*
─────────────────

*Concept:* Child changes parent's method

*Calculator (Parent):*
compute() → num1 + num2

*Adder (Child) - OVERRIDES:*
@Override compute() → num1 + num2 + num3

*Multiplier (Child) - OVERRIDES:*
@Override compute() → num1 * num2 * num3
─────────────────
*INPUT:*
─────────────────

User1: num1=5, num2=3, num3=2, type=Adder
User2: num1=4, num2=3, num3=2, type=Multiplier

─────────────────
*OUTPUT:*
─────────────────

*USER1 (Adder):*
Overload: 10, 8, 10
Override: 10

*USER2 (Multiplier):*
Overload: 8, 7, 9
Override: 24

─────────────────
*PROGRESSION:*
─────────────────

📗 Level 1 → V1 Basic (Separate classes, Main passes data)
📘 Level 2 → V2 Association (Objects hold references)
📙 Level 3 → Abstract class (Remove redundancy)
📕 Level 4 → Interface (Add security)
📓 Level 5 → Overloading (Same name, different params)
📔 Level 6 → Overriding (Child changes parent method)

 */
public class Main {
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        BigInteger num1,num2,num3;
        System.out.println("User 1\n enter num1:");
        num1=new BigInteger(sc.nextLine());
        System.out.println("\n enter num2:");
        num2=new BigInteger(sc.nextLine());
        System.out.println("\n enter num3:");
        num3=new BigInteger(sc.nextLine());
        System.out.println("\n Enter Type:");
        String type1=(sc.nextLine());
        BigInteger unum1,unum2,unum3;
        System.out.println("User 1\n enter num1:");
        unum1=new BigInteger(sc.nextLine());
        System.out.println("\n enter num2:");
        unum2=new BigInteger(sc.nextLine());
        System.out.println("\n enter num3:");
        unum3=new BigInteger(sc.nextLine());
        System.out.println("\n Enter Type:");
        String type2=(sc.nextLine());
UserInterface user1=new User(num1.intValue(),num2.intValue(),num3.intValue(),type1);
UserInterface user2=new User(unum1.intValue(),unum2.intValue(),unum3.intValue(),type2);
Calculator c=new Calculator();
if(user1.getType().equals("Adder")) {
    AdderInterface a=new Adder();
    System.out.println("====USER 1 ADDER====");
    System.out.println("OVERLOADED:");
    System.out.println(c.calculate(1));
    System.out.println(c.calculate(1, 2));
    System.out.println(c.calculate(1, 2, 3));
    System.out.println("Overrided");
    a.setUser(user1);
    System.out.println(a.compute());
}
        if(user2.getType().equals("Multiplier")) {
            MultiplierInterface a=new Multiplier();
            System.out.println("====USER 1 ADDER====");
            System.out.println("OVERLOADED:");
            System.out.println(c.calculate(1));
            System.out.println(c.calculate(1, 2));
            System.out.println(c.calculate(1, 2, 3));
            System.out.println("Overrided");
            System.out.println(a.compute());
            a.setUser(user2);
        }

}
}