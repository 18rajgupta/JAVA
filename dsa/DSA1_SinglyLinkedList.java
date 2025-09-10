package dsa;

public class DSA1_SinglyLinkedList {
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        DSA1_SinglyLinkedList ll = new DSA1_SinglyLinkedList();
        // ll.print();

        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.add(2, 3);
        // ll.print();

        // ll.removeFirst();
        // ll.print();
        //
        // ll.removeLast();
        // ll.print();
        //
        // System.out.println(size);

        // System.out.println(ll.itrSearch(4)); // KEY FOUND....
        // System.out.println(ll.itrSearch(10)); // KEY NOT FOUND....

        // System.out.println(ll.recSearch(4)); // KEY FOUND....
        // System.out.println(ll.recSearch(10)); // KEY NOT FOUND....

        // ll.reverse();
        // ll.print();
        //
        // ll.deleteNthFromEnd(3);
        // ll.print();

        // ll.print();
        // System.out.println(ll.checkPalindrome());

        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(5);
        head.next.next = temp;
        head.next.next.next = new Node(3);
        head.next.next.next.next = temp;
        // 1->2->3->1
        System.out.println(ll.isCycle());
        removeCycle();
        System.out.println(ll.isCycle());
        ll.print();
    }

    public static void removeCycle() {
        boolean isCycle = false;
        // DETECT CYCLE
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        // FIND MEETING POINT
        if (isCycle) {
            slow = head;
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            // REMOVE CYCLE -> LAST.NEXT = NULL
            prev.next = null;
        }
    }

    public void addFirst(int data) { // TO ADD DATA IN STARTING POSITION...O(1)
        // STEP1 - CREATE NEW NODE
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // STEP2 - newNode next = head
        newNode.next = head; // LINK

        // STEP3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) { // TO ADD DATA IN LAST POSITION....O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // TO PRINT A LINKEDLIST....O(n)
        if (head == null) {
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) { // TO ADD NODE IN THE MIDDLE....
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        int val = tail.data;
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;

        }
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // KEY FOUND
                return i;
            }
            temp = temp.next;
            i++;
        }

        // KEY NOT FOUND
        return -1;
    }

    public int helper(Node head, int key) { // O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // CALCULATE SIZE...
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // REMOVE FIRST
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public Node findMid() { // SLOW-FAST APPROACH....#HELPER
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // SLOW IS MY MIDDLE NOW
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid();

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // head of right half
        Node left = head; // head of left half

        // step3 - check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) { // Cycle exists
                return true;
            }
        }

        return false; // Cycle doesn't exist
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
