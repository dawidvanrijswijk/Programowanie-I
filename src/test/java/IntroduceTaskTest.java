import org.junit.Test;
import Programowanie.zaj1.IntroduceTask;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntroduceTaskTest {

    @Test
    public void testIsPath() {
        assertTrue(IntroduceTask.isPath("GDDGLLPP"));
        assertFalse(IntroduceTask.isPath("GDDGLLPPP"));
        assertTrue(IntroduceTask.isPath("PDDGLG"));
        assertFalse(IntroduceTask.isPath("PDDGDDDDDGLG"));
        assertTrue(IntroduceTask.isPath(""));
    }
}