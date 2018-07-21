package zaj5;

import Programowanie.zaj5.ArythmeticalHelper;
        import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assume.assumeTrue;

//TESTUJEMY SUME
@RunWith(Parameterized.class)
public class ArythmeticalHelperTest {

    private enum Opearation {
        SUM, MULT, maxAbs
    }

    private Double val1; //pierwszy argument testowanej metody
    private Double val2; //---drugi----
    private Double val3; //wynik - wartosc oczekiwana
    private Opearation op;

    public ArythmeticalHelperTest(Double val1, Double val2, Double val3, Opearation op) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.op = op;
    }

    //tametoda przygotowuje konkretne dane ktore beda aplikowane asercji
    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        //dwuwymiarowa tablice obiektow zamieniamy na liste jednowymiarowych tablic
        Object[][] params = new Object[][]{
                {-2.0, 2.0, 0.0, Opearation.SUM},
                {4.5, 2.3, 6.8,  Opearation.SUM},
                {-4.0, 2.0, -2.0,  Opearation.SUM},
                {0.0, 2.3, 2.3,  Opearation.SUM},
                {0.0, 2.3, 0.0,  Opearation.MULT},
                {-3.0, -4.0, 12.0,  Opearation.MULT},
                {-3.0, 2.0, 3.0, Opearation.maxAbs},
                {5.0, 2.0, 5.0, Opearation.maxAbs},
        };
        return Arrays.asList(params);
    }

    @Test
    public void testSum() {
        assumeTrue(op == Opearation.SUM);
        assertEquals(val3, ArythmeticalHelper.sum(val1, val2));
    }

    @Test
    public void testMult() {
        assumeTrue(op == Opearation.MULT);
        assertEquals(val3, ArythmeticalHelper.mult(val1, val2));
    }

    @Test
    public void testMaxAbs() {
        assumeTrue(op == Opearation.maxAbs);
        assertEquals(val3, ArythmeticalHelper.maxAbs(val1, val2));
    }
}