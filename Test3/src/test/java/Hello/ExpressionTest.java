package Hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionTest {

    @Test
    public void process() {
        final ComplexNumber z1 = new ComplexNumber("2+6i");
        final ComplexNumber z2 = new ComplexNumber("1+3i");
        assertEquals("3.0+9.0i",ComplexNumber.add(z1,z2).toString());
        assertEquals("1.0+3.0i",ComplexNumber.dif(z1,z2).toString());
    }
}