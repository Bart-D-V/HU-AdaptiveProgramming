package domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testMachine(){
        //er is kans dat deze werkt.
        assertEquals(" heeft 3 en 4 gegooid.", KansFSM.tweeSteenDobbel("s9"));

        assertEquals(new String[]{"s10", "s11", "s1"}, KansFSM.newpaths("s4"));

        assertEquals("AABA bezocht locaties [s0, s1, s5, s2, s6]", TekstFSM.f("s0", "AABA"));

        assertEquals("error bij locatie: s5, geen pad kunnen vinden voor: C", TekstFSM.f("s3", "ACACAC"));
    }
}
