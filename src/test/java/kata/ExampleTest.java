package kata;

import java.lang.reflect.Array;

import com.google.common.collect.ImmutableList;

import org.junit.Test;

import static org.junit.Assert.assertThat;

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
    public void oneDigits() {
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(0)).isEqualTo("null");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(1)).isEqualTo("en");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(2)).isEqualTo("to");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(3)).isEqualTo("tre");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(4)).isEqualTo("fire");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(5)).isEqualTo("fem");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(6)).isEqualTo("seks");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(7)).isEqualTo("sju");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(8)).isEqualTo("åtte");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(9)).isEqualTo("ni");
    }

    @Test
    public void twoDigits() {
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(1)).isEqualTo("ti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(2)).isEqualTo("tjue");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(3)).isEqualTo("tretti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(4)).isEqualTo("førti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(5)).isEqualTo("femti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(6)).isEqualTo("seksti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(7)).isEqualTo("sytti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(8)).isEqualTo("åtti");
        org.fest.assertions.Assertions.assertThat(Example.secondPosition(9)).isEqualTo("nitti");
    }

    @Test
    public void splitDigits(){
        org.fest.assertions.Assertions.assertThat(Example.splitDigits(1)).isEqualTo(ImmutableList.of(1));
        org.fest.assertions.Assertions.assertThat(Example.splitDigits(12)).isEqualTo(ImmutableList.of(1,2));
        org.fest.assertions.Assertions.assertThat(Example.splitDigits(123)).isEqualTo(ImmutableList.of(1,2,3));

    }
}
