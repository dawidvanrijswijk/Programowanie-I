import Programowanie.zaj2.ColorPoint3d;
import Programowanie.zaj3.PointsHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

public class PointsHelperTest {

    @Test
    public void testUniquePoints() {
        ColorPoint3d[] colorPoint3ds = {new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 2.0d, 1.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(2.0d, 2.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 1.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.RED),
                new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.GREEN)};

        Assert.assertEquals(true, PointsHelper.uniquePoints(colorPoint3ds));

        ColorPoint3d[] colorPoint3ds2 = {new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 2.0d, 1.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(2.0d, 2.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 1.0d, 3.0d, ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.RED),
                new ColorPoint3d(1.0d, 2.0d, 3.0d, ColorPoint3d.Color.GREEN),
                new ColorPoint3d(1.0d, 1.0d, 3.0d, ColorPoint3d.Color.BLUE)};
        Assert.assertEquals(false, PointsHelper.uniquePoints(colorPoint3ds2));

        System.out.println("Test UniquePoints Passed");
    }

    @Test
    public void testConvert()
    {
        ColorPoint3d[] colorPoint3ds1 = {new ColorPoint3d(1.0d,2.0d,3.0d,ColorPoint3d.Color.BLUE),
                new ColorPoint3d(3.0d,3.0d,3.0d,ColorPoint3d.Color.RED),
                new ColorPoint3d(1.0d,2.0d,1.0d,ColorPoint3d.Color.RED),
                new ColorPoint3d(2.0d,3.0d,3.0d,ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d,1.0d,1.0d,ColorPoint3d.Color.BLUE),
                new ColorPoint3d(1.0d,2.0d,2.0d,ColorPoint3d.Color.RED),
                new ColorPoint3d(3.0d,4.0d,3.0d,ColorPoint3d.Color.GREEN),
                new ColorPoint3d(2.0d,2.0d,3.0d,ColorPoint3d.Color.GREEN)};

        Set<ColorPoint3d> colorPoint3dsSet1 = PointsHelper.convert(colorPoint3ds1);

        Iterator iterator = colorPoint3dsSet1.iterator();

        Assert.assertEquals( new ColorPoint3d(1.0d,1.0d,1.0d,ColorPoint3d.Color.BLUE), iterator.next());
        Assert.assertEquals( new ColorPoint3d(1.0d,2.0d,1.0d,ColorPoint3d.Color.RED), iterator.next());
        Assert.assertEquals( new ColorPoint3d(1.0d,2.0d,2.0d,ColorPoint3d.Color.RED), iterator.next());
        Assert.assertEquals( new ColorPoint3d(1.0d,2.0d,3.0d,ColorPoint3d.Color.BLUE), iterator.next());
        Assert.assertEquals( new ColorPoint3d(2.0d,2.0d,3.0d,ColorPoint3d.Color.GREEN), iterator.next());
        Assert.assertEquals( new ColorPoint3d(2.0d,3.0d,3.0d,ColorPoint3d.Color.BLUE), iterator.next());
        Assert.assertEquals( new ColorPoint3d(3.0d,3.0d,3.0d,ColorPoint3d.Color.RED), iterator.next());
        Assert.assertEquals( new ColorPoint3d(3.0d,4.0d,3.0d,ColorPoint3d.Color.GREEN), iterator.next());

        System.out.println("Test Convert Passed");
    }
}