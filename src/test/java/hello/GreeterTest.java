package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void shouldGetTheMessage() {
        assertThat(greeter.saySomethingElse(), equalTo("something else"));
    }


}