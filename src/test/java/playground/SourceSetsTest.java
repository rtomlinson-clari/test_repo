package playground;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import playground.SourceSetsObject;

public class SourceSetsTest {

    @Test
    public void whenRun_ThenSuccess() {
        SourceSetsObject underTest = new SourceSetsObject("lorem", "ipsum");

        assertThat(underTest.getUser(), is("lorem"));
        assertThat(underTest.getPassword(), is("ipsum"));
    }
}
