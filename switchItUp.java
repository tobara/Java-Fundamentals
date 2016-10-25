// When provided with a number between 0-9, return it in words.

// Input :: 1

// Output :: "One".



public class switchItUp
{
  public static String switchItUp(int number)
  {
    String[] arrayTextNumber = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    return arrayTextNumber[number];
 }
}

//Try using "Switch" statements.

public class switchItUp
{
  public static String switchItUp(int number)
  {
     switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
          }
            return "Nine";
  }
}
