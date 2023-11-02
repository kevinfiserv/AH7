class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    // todo
    int sum = 0;
    while (head != null) {
      sum += head.val;
      head = head.next;

    }
    return sum;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));

    Node<Integer> r = new Node<>(1);
    Node<Integer> aa= new Node<>(2);
    Node<Integer> m = new Node<>(3);
    Node<Integer> o = new Node<>(4);
    Node<Integer> s = new Node<>(5);

    r.next = aa;
    aa.next = m;
    m.next = o;
    o.next = s;


    // 2 -> 8 -> 3 -> -1 -> 7

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(r));
  }
}
