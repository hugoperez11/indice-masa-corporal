package dev.hugo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.hugo.models.CalculatorImc;
import dev.hugo.models.Person;

public class CalculatorImcTest {

    CalculatorImc calculator;
    Person person;
    
    @BeforeEach
    void setUp() {
        person = new Person(80.00, 1.70);
        calculator = new CalculatorImc(person);
    }

    @Test
    void CalculatorImcHas1Field() {
        assertThat(calculator.getClass().getDeclaredFields().length, is(1));
    }

    @Test
    void testCalculatorImcCanReturnPerson() {
        assertThat(calculator.getPerson(), is(equalTo(person)));
    }
    @Test
    void testCalculatorImcCanReturnImc() {
        assertThat(calculator.getImc(), is(equalTo(0.0)));
    }
    @Test
    void testCalculatorImcCanReturnPersonImc() {
        calculator.calculate();
        assertThat(calculator.getImc(), is(27.68));
    }
    @Test
    void testCalculatorImcCategory() {
        calculator.calculate();
        assertThat(calculator.getImcCategory(), is("Sobrepeso"));
    }
    
}
