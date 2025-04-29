import java.util.Scanner;

class Node {
    String word;
    Node next;

    Node(String word) {
        this.word = word;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    void add(String word) {
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void printList() {
        Node curr = head;
        System.out.print("[");
        while (curr != null) {
            System.out.print(curr.word);
            if (curr.next != null) System.out.print(", ");
            curr = curr.next;
        }
        System.out.print("]");
    }
}

class GroupAnagramCustomLinkedList {
    static String sortString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words separated by spaces:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int n = words.length;
        MyLinkedList[] groups = new MyLinkedList[n];  // Max n groups
        String[] groupKeys = new String[n];           // Keys (sorted words)
        int groupCount = 0;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            String sorted = sortString(word);
            boolean added = false;
            for (int j = 0; j < groupCount; j++) {
                if (sorted.equals(groupKeys[j])) {
                    groups[j].add(word);
                    added = true;
                    break;
                }
            }
            if (!added) {
                groups[groupCount] = new MyLinkedList();
                groups[groupCount].add(word);
                groupKeys[groupCount] = sorted;
                groupCount++;
            }
        }
        System.out.println("\nGrouped Anagrams:");
        System.out.print("[");
        for (int i = 0; i < groupCount; i++) {
            groups[i].printList();
        }
        System.out.print("]");
        scanner.close();
    }
}