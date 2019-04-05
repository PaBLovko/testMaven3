package Hello;

import javafx.beans.property.SimpleBooleanProperty;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractNumberTest {

    @Test
    public void add() {
        final ComplexNumberInAlgebraicForm cn1 = new ComplexNumberInAlgebraicForm("1+3i");
        final ComplexNumberInAlgebraicForm cn2 = new ComplexNumberInAlgebraicForm("1+4i");
        assertEquals("2,00+7,00i", ComplexNumberInAlgebraicForm.add(cn1,cn2,new SimpleBooleanProperty(false)));
        assertEquals("7,28e^1,29i", ComplexNumberInAlgebraicForm.add(cn1,cn2,new SimpleBooleanProperty(true)));
    }

    @Test
    public void dif() {
        final ComplexNumberInAlgebraicForm cn1 = new ComplexNumberInAlgebraicForm("1+3i");
        final ComplexNumberInAlgebraicForm cn2 = new ComplexNumberInAlgebraicForm("1+4i");
        assertEquals("0,00-1,00i", ComplexNumberInAlgebraicForm.dif(cn1,cn2,new SimpleBooleanProperty(false)));
        assertEquals("1,00e^-1,57i", ComplexNumberInAlgebraicForm.dif(cn1,cn2,new SimpleBooleanProperty(true)));
    }

    @Test
    public void mul() {
        final ComplexNumberInAlgebraicForm cn1 = new ComplexNumberInAlgebraicForm("1+3i");
        final ComplexNumberInAlgebraicForm cn2 = new ComplexNumberInAlgebraicForm("1+4i");
        assertEquals("-11,00+7,00i", ComplexNumberInAlgebraicForm.mul(cn1,cn2,new SimpleBooleanProperty(false)));
        assertEquals("13,04e^-0,57i", ComplexNumberInAlgebraicForm.mul(cn1,cn2,new SimpleBooleanProperty(true)));
    }

    @Test
    public void div() {
        final ComplexNumberInAlgebraicForm cn1 = new ComplexNumberInAlgebraicForm("1+3i");
        final ComplexNumberInAlgebraicForm cn2 = new ComplexNumberInAlgebraicForm("1+4i");
        assertEquals("0,76-0,06i", ComplexNumberInAlgebraicForm.div(cn1,cn2,new SimpleBooleanProperty(false)));
        assertEquals("0,77e^-0,08i", ComplexNumberInAlgebraicForm.div(cn1,cn2,new SimpleBooleanProperty(true)));
    }
}