import org.junit.After;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by User on 19.09.2018.
 */
public class SummaTest {
       @Test
    public void getOperator() throws Exception {
           Summa oper=new Summa();
           String actual=oper.getOperator();
           String expected="+";
           assertEquals(expected,actual);
           System.out.println("Знак суммы корректен");
    }

    @Test
    public void calculateResult() throws Exception {
        Summa summat=new Summa();
        double actual = summat.calculateResult();
        double expected = 15;
        assertThat(expected,equalTo(actual));
        System.out.println("Сумма отрабатывает корректно");

}

    }

