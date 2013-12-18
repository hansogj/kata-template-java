package kata;

import com.google.common.collect.ImmutableList;
import org.junit.Ignore;
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
    public void oneDigits() {
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(0)).isEqualTo("null");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(1)).isEqualTo("ett");
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
        org.fest.assertions.Assertions.assertThat(Example.splitDigits(12)).isEqualTo(ImmutableList.of(2, 1));
        org.fest.assertions.Assertions.assertThat(Example.splitDigits(123)).isEqualTo(ImmutableList.of(3, 2, 1));
    }

    @Test
    public void combineDigitAndPosition() {
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(1, 1)).isEqualTo("ett");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(1, 2)).isEqualTo("ti");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(1, 3)).isEqualTo("etthundre");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(1, 4)).isEqualTo("ettusen");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(1, 5)).isEqualTo("titusen");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(2, 1)).isEqualTo("to");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(2, 2)).isEqualTo("tjue");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(2, 3)).isEqualTo("tohundre");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(2, 4)).isEqualTo("totusen");
        org.fest.assertions.Assertions.assertThat(Example.combineDigitAndPostion(2, 5)).isEqualTo("tjuetusen");

    }
    public void getNumberAsString() {
        org.fest.assertions.Assertions.assertThat(Example.getNumberAsString(1)).isEqualTo("en");
        org.fest.assertions.Assertions.assertThat(Example.getNumberAsString(100)).isEqualTo("etthundre");
        org.fest.assertions.Assertions.assertThat(Example.getNumberAsString(300)).isEqualTo("trehundre");
        org.fest.assertions.Assertions.assertThat(Example.getNumberAsString(333)).isEqualTo("trehundretrettitre");
        org.fest.assertions.Assertions.assertThat(Example.getNumberAsString(1450)).isEqualTo("ettusenfirehundreogfemti");
    }

    @Ignore
    @Test
    public void betweenTenAndTwenty() {
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(10)).isEqualTo("ti");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(11)).isEqualTo("elleve");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(12)).isEqualTo("tolv");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(13)).isEqualTo("tretten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(14)).isEqualTo("fjorten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(15)).isEqualTo("femten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(16)).isEqualTo("seksten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(17)).isEqualTo("sytten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(18)).isEqualTo("atten");
        org.fest.assertions.Assertions.assertThat(Example.firstPosition(19)).isEqualTo("nitten");

    }

}
