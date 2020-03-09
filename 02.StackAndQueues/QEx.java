public class QEx
{
  public static String[] readAllStrings()
  {
    Queue<String> q = new Queue<String>();
    while (!StdIn.isEmpty())
      q.enqueue(StdIn.readString());

    int N = q.size();
    for (int i = 0; i < N; i++)
    {
      words[i] = q.dequeue();
    }

    return words;
  }

  public static void main(String[] args)
  {
    String[] words = readAllStrings();
    for (int i = 0; i < words.length; i++)
    {
      StdOut.println(words[i]);
    }
  }
}
