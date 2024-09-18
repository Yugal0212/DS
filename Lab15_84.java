class Node {
    String name;
    String phoneNumber;
    Node left, right;

    Node(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        left = right = null;
    }
}

class PhoneBookBST {
    private Node root;

    public PhoneBookBST() {
        root = null;
    }

    public void addEntry(String name, String phoneNumber) {
        root = addRecursive(root, name, phoneNumber);
    }

    private Node addRecursive(Node node, String name, String phoneNumber) {
        if (node == null) {
            return new Node(name, phoneNumber);
        }
        int cmp = name.compareTo(node.name);
        if (cmp < 0) {
            node.left = addRecursive(node.left, name, phoneNumber);
        } else if (cmp > 0) {
            node.right = addRecursive(node.right, name, phoneNumber);
        } else {
            node.phoneNumber = phoneNumber;
        }
        return node;
    }

    public void removeEntry(String name) {
        root = removeRecursive(root, name);
    }

    private Node removeRecursive(Node node, String name) {
        if (node == null) {
            return null;
        }
        int cmp = name.compareTo(node.name);
        if (cmp < 0) {
            node.left = removeRecursive(node.left, name);
        } else if (cmp > 0) {
            node.right = removeRecursive(node.right, name);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node smallest = findSmallest(node.right);
            node.name = smallest.name;
            node.phoneNumber = smallest.phoneNumber;
            node.right = removeRecursive(node.right, smallest.name);
        }
        return node;
    }

    private Node findSmallest(Node node) {
        return node.left == null ? node : findSmallest(node.left);
    }

    public String searchPhoneNumber(String name) {
        Node result = searchRecursive(root, name);
        return result != null ? result.phoneNumber : "Entry not found";
    }

    private Node searchRecursive(Node node, String name) {
        if (node == null) {
            return null;
        }
        int cmp = name.compareTo(node.name);
        if (cmp < 0) {
            return searchRecursive(node.left, name);
        } else if (cmp > 0) {
            return searchRecursive(node.right, name);
        } else {
            return node;
        }
    }

    public void listEntriesAscending() {
        listAscendingRecursive(root);
    }

    private void listAscendingRecursive(Node node) {
        if (node != null) {
            listAscendingRecursive(node.left);
            System.out.println("Name: " + node.name + ", Phone Number: " + node.phoneNumber);
            listAscendingRecursive(node.right);
        }
    }

    public void listEntriesDescending() {
        listDescendingRecursive(root);
    }

    private void listDescendingRecursive(Node node) {
        if (node != null) {
            listDescendingRecursive(node.right);
            System.out.println("Name: " + node.name + ", Phone Number: " + node.phoneNumber);
            listDescendingRecursive(node.left);
        }
    }
}

public class Lab15_84 {
    public static void main(String[] args) {
        PhoneBookBST phoneBook = new PhoneBookBST();

        phoneBook.addEntry("Alice", "123-456-7890");
        phoneBook.addEntry("Bob", "987-654-3210");
        phoneBook.addEntry("Charlie", "555-555-5555");

        System.out.println("Phone book entries in ascending order:");
        phoneBook.listEntriesAscending();

        System.out.println("\nPhone book entries in descending order:");
        phoneBook.listEntriesDescending();

        System.out.println("\nSearching for Bob:");
        System.out.println(phoneBook.searchPhoneNumber("Bob"));

        phoneBook.removeEntry("Alice");

        System.out.println("\nPhone book entries after removing Alice:");
        phoneBook.listEntriesAscending();
    }
}
