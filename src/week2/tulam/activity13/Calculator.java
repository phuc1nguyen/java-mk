package week2.tulam.activity13;

public class Calculator {
    private final double operand1;
    private final double operand2;      //Declare bang final thi ko dung setter() duoc nua
    private String operator;

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Calculator(double x, double y, String z) {       //Constructor
        this.operand1 = x;
        this.operand2 = y;
        this.operator = z;
    }

    public double operate() {
        if (this.operator.equals("+")) return (this.operand1 + this.operand2);
        else if (this.operator.equals("-")) return (this.operand1 - this.operand2);
        else if (this.operator.equals("*")) return (this.operand1 * this.operand2);
        else if (this.operator.equals("/")) return (this.operand1 / this.operand2);
        else return (this.operand1 + this.operand2);
    }
}
