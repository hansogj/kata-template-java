package kata;

import kata.Example;
import org.junit.Test;

public final class ExampleTest {
    
    @Test
    public void exampleUsingJunitAssertion() {
        org.junit.Assert.assertEquals(Example.sum(1,2,3), 6);
    }
    
    @Test
    public void exampleUsingHamcrestAssert() {
        org.hamcrest.MatcherAssert.assertThat(Example.sum(1,2,3), org.hamcrest.CoreMatchers.is(6));
    }
    
    @Test
    public void exampleUsingFestAssert() {
        org.fest.assertions.Assertions.assertThat(Example.sum(1,2,3)).isEqualTo(6);
    }

    @Test
    public void nullIsNull() {
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(0)).isEqualTo("null");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(1)).isEqualTo("en");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(2)).isEqualTo("to");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(3)).isEqualTo("tre");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(4)).isEqualTo("fire");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(5)).isEqualTo("fem");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(6)).isEqualTo("seks");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(7)).isEqualTo("sju");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(8)).isEqualTo("åtte");
        org.fest.assertions.Assertions.assertThat(Example.singleDigit(9)).isEqualTo("ni");

    }
    
}
