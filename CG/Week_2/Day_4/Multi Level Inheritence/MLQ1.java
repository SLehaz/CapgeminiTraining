import java.time.LocalDate;
class Order{
    int orderId;
    LocalDate date;
    Order() {
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(){
    }
}
class DeliveredOrder extends ShippedOrder{
    LocalDate deliveryDate;
    DeliveredOrder(int trackingNumber, LocalDate deliveryDate,int orderId,LocalDate date) {
        this.trackingNumber=trackingNumber;
        this.orderId=orderId;
        this.date=date;
        this.deliveryDate=deliveryDate;
    }
    void getOrderStatus(){
        System.out.println("Order ID : "+orderId);
        System.out.println("Order Date : "+date);
        System.out.println("Tracking Number : "+trackingNumber);
        System.out.println("Delivery Date : "+deliveryDate);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args){
        DeliveredOrder d1 = new DeliveredOrder(1234, LocalDate.of(2025,04,15),1,LocalDate.of(2025,04,04));
        DeliveredOrder d2 = new DeliveredOrder(2345, LocalDate.of(2025,04,12),2,LocalDate.of(2025,04,02));
        d1.getOrderStatus();
        d2.getOrderStatus();
    }
}