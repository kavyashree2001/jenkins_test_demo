import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result=Addition.add(1,2);
        int correct_result=3;
        assertEquals(correct_result, result);
    }
}