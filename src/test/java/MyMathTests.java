import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyMathTests {

    @Mock
    MyMath myMathMock = new MyMath();

    @Test
    public void test1Positive() {
        MyMath math = new MyMath();
        assertEquals(3, math.add(1, 2), 0);
    }

    @Test
    public void test2Negative() {
        MyMath math = new MyMath();
        assertNotEquals(4, math.add(1, 2), 0);
    }

    @Test
    public void test3Mock() {
        double expected = 50;
        when(myMathMock.add(10.0,20.0)).thenReturn(expected);
        assertEquals(expected, myMathMock.add(10,20), 0);

    }

    @Test
    public void test4Mock() {
        double expected = -50;
        when(myMathMock.add(10.0,20.0)).thenReturn(expected);
        assertEquals(expected, myMathMock.add(10,20), 0);

    }
}
