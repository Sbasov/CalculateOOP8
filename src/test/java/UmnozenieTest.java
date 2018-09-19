import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by User on 19.09.2018.
 */
public class UmnozenieTest {
    @Test
    public void getOperator() throws Exception {
        Umnozenie oper=new Umnozenie();
        String actual=oper.getOperator();
        String expected="*";
        assertEquals(expected,actual);
        System.out.println("Знак умножения корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Umnozenie summat=new Umnozenie();
        double actual = summat.calculateResult();
        double expected = 15;
        assertThat(expected,equalTo(actual));
        System.out.println("Умножение отрабатывает корректно");
    }

}