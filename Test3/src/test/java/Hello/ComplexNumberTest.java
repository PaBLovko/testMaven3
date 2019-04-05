package Hello;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {
    private final static double EPSILON = 0.0000001;

    @Test
    public void add() {
        final ComplexNumber cn1 = new ComplexNumber("1+3i");
        final ComplexNumber cn2 = new ComplexNumber("1+3i");
        assertEquals("2.0+6.0i",ComplexNumber.add(cn1,cn2).toString());
    }

    @Test
    public void dif() {
        final ComplexNumber cn1 = new ComplexNumber("2+6i");
        final ComplexNumber cn2 = new ComplexNumber("1+3i");
        assertEquals("1.0+3.0i",ComplexNumber.dif(cn1,cn2).toString());
    }

    @Test
    public void TestDoString() {
        double a = 13.5;
        double b = -21.6;
        if (EPSILON > 0) {
            long jark = Math.round (1./EPSILON);
            a = Math.rint (a*jark)/jark;
            b = Math.rint (b*jark)/jark;
        }
        String rS = String.valueOf (a);
        String iS = String.valueOf (b);
        assertEquals("13.5-21.6i",rS + (iS.startsWith ("-") ? "" : "+") + iS + "i");
    }
}