package padding;

public class LeftPadder{

    public static final int FIXED_LENGTH = 17;
    public String padFixed(int input)    {
        String output = String.format("%0" + FIXED_LENGTH + "d", input);
            return output;
        }

}