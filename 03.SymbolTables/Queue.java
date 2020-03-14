import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>
{
  private class Node
  {
    public Node next;
    public Item item;

    public Node(Item item) { this.item = item; }
  }

  private class QueueIterator implements Iterator<Item>
  {
    private Node root = null;

    public QueueIterator(Node root)
    { this.root = root; }

    public boolean hasNext()
    { return root != null; }

    public Item next()
    {
      Item item = root.item;
      root = root.next;
      return item;
    }
  }

  private Node root = null;
  private Node top = null;
  private int N = 0;

  public void enqueue(Item item)
  {
    Node node = new Node(item);

    N++;

    if (root == null) {
      root = top = node;
      return;
    }

    top.next = node;
    top = node;
  }

  public Item dequeue()
  {
    if (root == null) {
      return null;
    }

    Node node = root;
    root = root.next;

    N--;

    return node.item;
  }

  public int size()
  {
    return N;
  }

  public Iterator<Item> iterator()
  { return new QueueIterator(root); }

  public static void main(String[] args)
  {
    String[] words = StdIn.readAllStrings();
    Queue<String> queue = new Queue<String>();

    for (int i = 0; i < words.length; i++)
    {
      queue.enqueue(words[i]);
    }

    for (String key: queue)
    {
      StdOut.println(key);
    }
  }
}
