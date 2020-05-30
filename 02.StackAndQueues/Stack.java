package dev.underoot.coursera.atm

public class Stack<Item>
{
  private Node first = null;
  private int N = 0;

  private class Node
  {
    private Item item;
    private Node next;
  }

  public void push(Item item)
  {
    Node second = first;
    first = new Node();
    first.item = item;
    first.next = second;
    N++;
  }

  public Item pop()
  {
    Item item = first.item;
    first = first.next;
    N--;

    return item;
  }

  public int size()
  {
    return N;
  }

  public Boolean isEmpty()
  {
    return N == 0;
  }

  public static void main(String[] args)
  {
    Stack<String> stack = new Stack<String>();

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
