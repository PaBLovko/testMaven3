package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberInAlgebraicFormTest {

    @Test
    public void toCartesianForm() {
        String str = "12.00-65.30i";
        ComplexNumberInAlgebraicForm complex = new ComplexNumberInAlgebraicForm(str);
        assertEquals("12,00-65,30i",complex.toCartesianForm());
    }

    @Test
    public void toExponencialForm() {
        String str = "12.00-65.30i";
        ComplexNumberInAlgebraicForm complex = new ComplexNumberInAlgebraicForm(str);
        assertEquals("66,39e^-1,39i",complex.toExponencialForm());
    }

    @Test
    public void getArgument() {
        String str = "12.00-65.30i";
        ComplexNumberInAlgebraicForm complex = new ComplexNumberInAlgebraicForm(str);
        assertEquals(-1.38,complex.getArgument(), 1);
    }

    @Test
    public void getModule() {
        String str = "12.00-65.30i";
        ComplexNumberInAlgebraicForm complex = new ComplexNumberInAlgebraicForm(str);
        assertEquals(66.39,complex.getModule(), 1);
    }
}