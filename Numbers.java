// Each floating-point number should be formatted that only the first two decimal places are returned. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

// Don't round the numbers! Just cut them after two decimal places!

import java.text.DecimalFormat;
import java.math.*;

public class Numbers
{
  public static double twoDecimalPlaces(double number)
  {
    DecimalFormat decimalFormat = new DecimalFormat(".00");
    decimalFormat.setRoundingMode(RoundingMode.DOWN);
    String numberAsString = decimalFormat.format(number);
    double newNum = Double.valueOf(numberAsString);
    return newNum;
  }
}
