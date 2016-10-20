// Your task is to make two functions, max and min (maximum and minimum in PHP)
// that take a(n) array/vector of integers list as input and outputs, respectively,
// the largest and lowest number in that array/vector

public class Value {

  public int min(int[] list) {
    int min = 0;
    for(int i = 0; i < list.length; i++) {
      if (list[i] < min) {
        min = list[i];
      }
    }

    return min;
  }

  public int max(int[] list) {
    int max = 0;
    for(int i = 0; i < list.length; i++) {
      if (list[i] > max) {
        max = list[i];
      }
    }

    return max;
  }
}
