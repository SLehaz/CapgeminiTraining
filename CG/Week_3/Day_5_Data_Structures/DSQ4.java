class Inventory {
    String itemName;
    int itemID, quantity;
    double itemPrice, totalPrice;
    Inventory next;

    Inventory(int itemID, String itemName, int quantity, double itemPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.totalPrice = itemPrice * quantity;
        this.next = null;
    }
}

class InventoryLL {
    Inventory head = null;

    void addAtBeginning(int itemID, String itemName, int quantity, double itemPrice) {
        Inventory newItem = new Inventory(itemID, itemName, quantity, itemPrice);
        newItem.next = head;
        head = newItem;
    }

    void addAtEnd(int itemID, String itemName, int quantity, double itemPrice) {
        Inventory newItem = new Inventory(itemID, itemName, quantity, itemPrice);
        if (head == null) {
            head = newItem;
        } else {
            Inventory temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    void addAtPosition(int itemID, String itemName, int quantity, double itemPrice, int position) {
        Inventory newItem = new Inventory(itemID, itemName, quantity, itemPrice);
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            newItem.next = head;
            head = newItem;
        } else {
            Inventory temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }

    void deleteRecord(int itemID) {
        if (head == null) return;

        if (head.itemID == itemID) {
            head = head.next;
            System.out.println("Deletion Successful");
            return;
        }

        Inventory temp = head;
        while (temp.next != null && temp.next.itemID != itemID) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Deletion Successful");
        } else {
            System.out.println("Item not found.");
        }
    }

    void searchWithID(int itemID) {
        Inventory temp = head;
        while (temp != null && temp.itemID != itemID) {
            temp = temp.next;
        }

        if (temp != null) {
            System.out.println("\nItem with ID " + itemID + " is found");
        } else {
            System.out.println("Item with ID " + itemID + " is not found");
        }
    }

    void searchWithName(String itemName) {
        Inventory temp = head;
        while (temp != null && !temp.itemName.equals(itemName)) {
            temp = temp.next;
        }

        if (temp != null) {
            System.out.println("\nItem with name '" + itemName + "' is found");
        } else {
            System.out.println("Item with name '" + itemName + "' is not found");
        }
    }

    void updateQuantity(int itemID, int quantity) {
        Inventory temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) {
                temp.quantity = quantity;
                temp.totalPrice = quantity * temp.itemPrice;
                System.out.println("Item quantity for ID " + itemID + " has been updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemID + " not found.");
    }

    void displayList() {
        Inventory temp = head;
        while (temp != null) {
            System.out.println("\nItem ID       : " + temp.itemID);
            System.out.println("Item Name     : " + temp.itemName);
            System.out.println("Item Price    : " + temp.itemPrice);
            System.out.println("Item Quantity : " + temp.quantity);
            System.out.println("Total Price   : " + temp.totalPrice);
            temp = temp.next;
        }
    }

    void sortAscending() {
        if (head == null || head.next == null) return;

        for (Inventory i = head; i.next != null; i = i.next) {
            for (Inventory j = i.next; j != null; j = j.next) {
                if (i.itemPrice > j.itemPrice) {
                    int tempID = i.itemID;
                    String tempName = i.itemName;
                    int tempQty = i.quantity;
                    double tempPrice = i.itemPrice;
                    double tempTotal = i.totalPrice;

                    i.itemID = j.itemID;
                    i.itemName = j.itemName;
                    i.quantity = j.quantity;
                    i.itemPrice = j.itemPrice;
                    i.totalPrice = j.totalPrice;

                    j.itemID = tempID;
                    j.itemName = tempName;
                    j.quantity = tempQty;
                    j.itemPrice = tempPrice;
                    j.totalPrice = tempTotal;
                }
            }
        }
    }
    void totalBill(){
        double total=0;
        for(Inventory i =head;i.next!=null;i=i.next){
            total+=i.totalPrice;
        }
        System.out.println("\nThe total bill : "+total);
    }
}

class Main3 {
    public static void main(String[] args) {
        InventoryLL inventory = new InventoryLL();
        inventory.addAtBeginning(1, "Apple", 5, 20);
        inventory.addAtEnd(2, "Banana", 3, 13);
        inventory.addAtPosition(3, "Carrot", 2, 14, 2);
        System.out.println("Inventory List Before Sorting:");
        inventory.displayList();
        inventory.sortAscending();
        System.out.println("\nInventory List After Sorting (by price):");
        inventory.displayList();
        inventory.deleteRecord(1);
        inventory.searchWithID(1);
        inventory.searchWithName("Apple");
        inventory.updateQuantity(2,8);
        inventory.displayList();
        inventory.totalBill();
    }
}
