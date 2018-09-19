/**
 * Created by Basov Stepanon 26.08.2018.
 */

//операция сложения, наследуем класс Chisla


public class Summa extends Operation{

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public double calculateResult() {
        return getA()+getB();
    }
}