/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция деления, наследуем класс Operation
public class Delenie extends Operation{

    @Override
    public String getOperator() {
        return "/";
    }

    @Override
    public double calculateResult() {
        return getA() / getB();


    }
}