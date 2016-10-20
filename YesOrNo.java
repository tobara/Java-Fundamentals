// Given: a boolean value

// Return: a 'Yes' string for true and a 'No' string for false

class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    String response;
    if (b == true) {
      response = "Yes";
  } else {
      response = "No";
  }
   return response;
  }

}
