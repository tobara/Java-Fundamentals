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
