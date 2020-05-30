public class BST<Key extends Comparable<Key>, Value>
{
  private class Node
  {
    public Key key;
    public Value value;

    public Node left;
    public Node right;

    public Node(Key key, Value value)
    { this.key = key; this.value = value; }
  }

  private Node root = null;

  public boolean isEmpty()
  { return root == null; }

  public void put(Key key, Value value)
  { root = put(root, key, value); }

  public Node put(Node x, Key key, Value value) {
    if (x == null) return new Node(key, value);
    int cmp = x.key.compareTo(key);
    if (cmp < 0) x.right = put(x.right, key, value);
    else if (cmp > 0) x.left = put(x.left, key, value);
    else x.value = value;

    return x;
  }

  public Value get(Key key)
  { return get(root, key); }

  public Value get(Node x, Key key)
  {
    if (x == null) return null;
    int cmp = x.key.compareTo(key);
    if (cmp < 0) return get(x.right, key);
    else if (cmp > 0) return get(x.left, key);
    else return x.value;
  }

  public boolean contains(Key key)
  { return get(key) != null; }

  private Queue<Key> inorder(Node x, Queue<Key> queue)
  {
    if (x == null) return queue;

    inorder(x.left, queue);
    queue.enqueue(x.key);
    inorder(x.right, queue);

    return queue;
  }

  public Iterable<Key> keys()
  {
    return inorder(root, new Queue<Key>());
  }
}
