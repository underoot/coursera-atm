public class StrawStack
{
  private String[] a;
  private int N = 0;

  public StrawStack(int max)
  {
    a = new String[max];
  }

  void push(String item)
  {
    a[N++] = item;
  }

  String pop()
  {
    return a[--N];
  }

  boolean isEmpty()
  {
    return N == 0;
  }

  int size()
  {
    return N;
  }

  public static void main(String[] args)
  {
    int max = Integer.parseInt(args[0]);
    StrawStack stack = new StrawStack(max);
    while (!StdIn.isEmpty())
    {
      String item = StdIn.readString();
      if (item.equals("-"))
        StdOut.print(stack.pop() + " ");
      else
        stack.push(item);
    }
    StdOut.println();
  }
}
