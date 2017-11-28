import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    public void greet() {
        String actual = Greeter.greet("Dieter");

        assertThat(actual).isEqualTo("Hello Dieter!");
    }
}