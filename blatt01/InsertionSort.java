public class InsertionSort {

  /**
   * Insertionsort algorithm for int arrays, sorting the input array in place.
   **/

  public static void sort(int[] array) {
    // Aufgabe 1 (a)

    int minimum;
    int index = 0;

    int wasSmallest;
    int nowSmallest;

    for (int i = 0; i < array.length - 1; i++) {
      minimum = array[i];

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < minimum) {
          minimum = array[j];
          index = j;
        }
      }
      if (i != index) {

        wasSmallest = array[i];
        nowSmallest = array[index];

        array[i] = nowSmallest;
        array[index] = wasSmallest;

      }
    }
  }

  /**
   *  Insertionsort algorithm for arbitrary comparable arrays, sorting the input array in place.
   **/
  public static <T extends Comparable<T>> void sort(T[] array) {

    T minimum;
    int index = 0;

    T wasSmallest;
    T nowSmallest;

    for (int i = 0; i < array.length - 1; i++) {
      minimum = array[i];

      for (int j = i + 1; j < array.length; j++) {

        if (minimum.compareTo(array[j]) > 0) {
          minimum = array[j];
          index = j;

        }
      }
      if (i != index) {

        wasSmallest = array[i];
        nowSmallest = array[index];

        array[i] = nowSmallest;
        array[index] = wasSmallest;

      }
    }
  }

}
