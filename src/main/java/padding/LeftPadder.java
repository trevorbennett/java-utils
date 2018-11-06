package padding;

import org.apache.commons.lang3.StringUtils;

public class LeftPadder{

    public static final int FIXED_LENGTH = 17;
    public String padFixed(int input)    {
        String output = String.format("%0" + FIXED_LENGTH + "d", input);
            return output;
        }

        public String padFixedString(String input){
            return StringUtils.leftPad(input, FIXED_LENGTH, "0");
        }

}