import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Plane plane2;

    @Before
    public void before() {
        plane1 = new Plane("CS123", PlaneType.CESSNA);
    }

    @Test
    public void hasName() {
        assertEquals("CS123", plane1.getName());
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.CESSNA, plane1.getPlaneType());
    }


    @Test
    public void checkWeightLimit() {
        assertEquals(400, plane1.getWeightLimit());
    }
}
