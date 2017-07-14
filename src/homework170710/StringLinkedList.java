package homework170710;

public class StringLinkedList {

    Node first;  // null

    Node last;  // null

    int size;  // 0

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;

        size++;
    }


    public boolean remove(String value) {

        boolean result = false;

        Node current = first;

        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;
        }

        if (first == null) {
            last = null;
        }

        return result;
    }

    public String remove(int index) {
        if (index > size) {
            return null;
        }
        if (index == size) {
            return last.value;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public String toString() {
        // traverse

        StringBuilder result = new StringBuilder("[");

        if (first != null) {
            result.append(first.value);

            Node current = first.next;

            while (current != null) {
                result.append(", ").append(current.value);
                current = current.next;
            }
        }

        result.append("]");

        return result.toString();
    }
}
