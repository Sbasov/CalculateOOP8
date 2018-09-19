/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция умножения, наследуем класс Chisla
public class Umnozenie extends Operation{

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public double calculateResult() {
        return getA()*getB();
    }
}