import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head = null;
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newUser;
        }
    }
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(userId2)) user1.friendIds.add(userId2);
        if (!user2.friendIds.contains(userId1)) user2.friendIds.add(userId1);

        System.out.println("Friend connection added between " + user1.name + " and " + user2.name);
    }
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove((Integer) userId2);
        user2.friendIds.remove((Integer) userId1);

        System.out.println("Friend connection removed between " + user1.name + " and " + user2.name);
    }
    public void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int id : user.friendIds) {
            User friend = findUserById(id);
            if (friend != null) {
                System.out.println("- " + friend.name + " (ID: " + friend.userId + ")");
            }
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        List<Integer> mutual = new ArrayList<>();
        for (int id : user1.friendIds) {
            if (user2.friendIds.contains(id)) {
                mutual.add(id);
            }
        }

        System.out.println("Mutual friends of " + user1.name + " and " + user2.name + ":");
        if (mutual.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int id : mutual) {
                User friend = findUserById(id);
                if (friend != null)
                    System.out.println("- " + friend.name + " (ID: " + id + ")");
            }
        }
    }
    public void searchUser(String nameOrId) {
        User temp = head;
        boolean found = false;

        try {
            int id = Integer.parseInt(nameOrId);
            while (temp != null) {
                if (temp.userId == id) {
                    System.out.println("User Found: " + temp.name + ", Age: " + temp.age);
                    found = true;
                    break;
                }
                temp = temp.next;
            }
        } catch (NumberFormatException e) {
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(nameOrId)) {
                    System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + "), Age: " + temp.age);
                    found = true;
                }
                temp = temp.next;
            }
        }

        if (!found) System.out.println("User not found.");
    }
    public void countAllFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friend(s).");
            temp = temp.next;
        }
    }
    public void displayAllUsers() {
        User temp = head;
        System.out.println("\n--- All Users ---");
        while (temp != null) {
            System.out.println("ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
class Main6 {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 22);
        sm.addUser(2, "Bob", 24);
        sm.addUser(3, "Charlie", 21);
        sm.addUser(4, "Daisy", 23);
        sm.displayAllUsers();
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(3, 4);
        sm.displayFriends(1);
        sm.displayFriends(3);
        sm.findMutualFriends(1, 2);
        sm.findMutualFriends(1, 4);
        sm.searchUser("Alice");
        sm.searchUser("3");
        sm.removeFriendConnection(1, 2);
        sm.displayFriends(1);
        sm.countAllFriends();
    }
}