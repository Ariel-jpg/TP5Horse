import java.util.Stack;
import java.util.function.Function;

public interface Caballo {
    public void move(Integer movementNumber);
    public Stack getMove();
    public Boolean checkPreviousPosition(Integer movementNumber);
    public Integer[] getCurrentPosition(); // Check
}
