/**
 * Created by Basov Stepan on 26.08.2018.
 */

//операция Вычитания, наследуем класс Chisla
public class Minus extends Operation{

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public double calculateResult() {
        return getA()-getB();
    }
}