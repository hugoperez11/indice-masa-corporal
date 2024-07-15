package dev.hugo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.hugo.models.Person;

public class PersonTest {
    
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(80.00, 1.70);
    }
    @Test
    void testPersonHas2Field() {
        assertThat(person.getClass().getDeclaredFields().length, is(2));
    }

    @Test
    void testName(){
        assertThat(person.getWeight(), is(80.00));
    }

    @Test
    void testPersonHeight() {
        assertThat(person.getHeight(), is(1.70));
    }
}
