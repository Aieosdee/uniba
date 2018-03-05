public class MergeSort {

  /**
   * Mergesort algorithm for int arrays.
   **/
  public static void sort(int[] array) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.

    int[] tmp = new int[array.length];
    sort(array, tmp, 0, array.length - 1);

  }

  /**
   * Sortiert das array zwischen Positionen lo und (einschliesslich) hi.
   **/
  private static void sort(int[] array, int[] tmp, int lo, int hi) {
    // Aufgabe 2 (c)
    // Bitte kommentieren Sie folgenden Code ein und ersetzen Sie jeweils ...
    // durch sinnvollen Code.

    if (hi <= lo) {
      return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(array, tmp, lo, mid);
    sort(array, tmp, mid + 1, hi);
    merge(array, tmp, lo, mid, hi);

  }

  /**
   * Die Methode kombiniert zwei bereits sortierte, benachbarte Teilbereiche des Eingabearrays zu
   * einer sortierten Folge. Es wird angenommen, dass array[lo] bis array[mid] und array[mid + 1]
   * bis array[hi] bereits korrekt sortiert sind. Die sortierte Folge befindet sich am Ende in
   * array[lo] bis array[hi].
   **/
  private static void merge(int[] array, int[] tmp, int lo, int mid, int hi) {
    // Aufgabe 2 (b)
    // Sie dürfen annehmen, dass tmp die gleiche Grösse wie array hat. Verwenden
    // Sie das Array tmp, um Werte aus array zwischenzuspeichern.

    int i = lo;
    int j = mid + 1;

    for (int k = lo; k <= hi; k++) {

      if (j > hi || (i <= mid && array[i] <= array[j])) {
        tmp[k] = array[i];
        i++;
      } else {
        tmp[k] = array[j];
        j++;
      }
    }

    for (int k = lo; k <= hi; k++) {
      array[k] = tmp[k];
    }
  }
}
