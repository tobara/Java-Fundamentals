// In this simple assignment you are given a number
// and have to make it negative. But maybe the number is already negative?

public class Negative {

  public int min(int[] list) {
    int min = 1;
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
