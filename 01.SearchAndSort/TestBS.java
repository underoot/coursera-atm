public class TestBS
{
  public static int search(String key, String[] a)
  {
    return search(key, a, 0, a.length);
  }

  public static int search(String key, String[] a, int lo, int hi)
  {
    if (hi <= lo) return -1;
    int mid = lo + (hi - lo) / 2;
    int cmp = a[mid].compareTo(key);

    if (cmp > 0) return search(key, a, lo, mid);
    else if (cmp < 0) return search(key, a, mid + 1, hi);
    else return mid;
  }

  public static void main(String[] args)
  {
    String[] words = StdIn.readAllStrings();
    int N = words.length;
    double start = System.currentTimeMillis();
    for (int i = 0; i < 10 * N; i++)
    {
      String key = words[StdRandom.uniform(N)];
      if (search(key, words) == -1)
        StdOut.println(key);
    }
    double now = System.currentTimeMillis();
    StdOut.println(Math.round(now-start) + " seconds");
  }
}
