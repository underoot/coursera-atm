public class TestSS
{
  public static int search(String key, String[] a)
  {
    for (int i = 0; i < a.length; i++)
      if ( a[i].compareTo(key) == 0 ) return i;
    return -1;
  }

  public static void main(String[] args)
  {
    String[] words = StdIn.readAllStrings();
    int N = words.length;
    double start = System.currentTimeMillis() / 1000.0;
    for (int i = 0; i < 10 * N; i++)
    {
      String key = words[StdRandom.uniform(N)];
      if (search(key, words) == -1)
        StdOut.println(key);
    }
    double now = System.currentTimeMillis() / 1000.0;
    StdOut.println(Math.round(now-start) + " seconds");
  }
}
