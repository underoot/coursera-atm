public class ST<Key extends Comparable<Key>, Value>
{
  private class Node
  {
    private Key key;
    private Value value;
    private Node left;
    private Node right;
    public Node(Key key, Value value)
    { this.key = key; this.value = value; }
  }
  void put(Key key, Value value);
}
