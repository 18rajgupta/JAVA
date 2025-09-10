package dsa;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    } 
}

public class DoublyLinkedList {
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node back = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, back);
            back.next = temp;
            back = temp;
        }

        return head;
    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;

        return head;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node temp = tail.prev;
        temp.next = null;
        tail.prev = null;

        return head;
    }

    static Node removeKth(Node head, int k) {
        if (head == null)
            return null;
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }

        Node prev = temp.prev;
        Node front = temp.next;
        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }

        prev.next = front;
        front.prev = prev;
        temp.next = null;
        temp.prev = null;
        return head;
    }

    static Node insertBeforeHead(Node head, int val) {
        Node newHead = new Node(val, head, null);
        head.prev = newHead;
        head = newHead;

        return head;
    }

    static Node insertBeforeTail(Node head, int val) {
        if (head.next == null) {
            return insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node prev = tail.prev;
        Node newNode = new Node(val, tail, prev);
        prev.next = newNode;
        tail.prev = newNode;

        return head;
    }

    static Node insertBeforeKth(Node head, int k, int val) {
        if (k == 1) {
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }

        Node prev = temp.prev;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.prev = newNode;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };
        Node head = convertArr2DLL(arr);
        print(head);
        // head = removeKth(head, 4);
        // head = insertBeforeHead(head, 10);
        // head = insertBeforeTail(head, 10);
        head = insertBeforeKth(head, 4, 10);
        print(head);
    }
}