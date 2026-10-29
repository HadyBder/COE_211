import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EntryPointInvalidMenuTest {
    public static void main(String[] args) {
        var originalIn = System.in;
        var originalOut = System.out;
        var output = new ByteArrayOutputStream();
        try {
            System.setIn(new ByteArrayInputStream(
                    "not-a-number\n1\nn\n".getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));
            EntryPoint.main(new String[0]);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        String transcript = output.toString(StandardCharsets.UTF_8);
        if (!transcript.contains(
                "Please make sure you pick a number between 1 and 4")) {
            throw new AssertionError("The invalid menu token was not rejected");
        }
        if (!transcript.contains("The basic days of the week are:")) {
            throw new AssertionError(
                    "The valid choice was not executed after reprompting");
        }
    }
}
