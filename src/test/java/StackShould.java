import org.example.Stack;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.*;


public class StackShould {

    @Test
    public void push_to_stack(){
        assertTrue(new Stack().isEmpty());
    }
}
