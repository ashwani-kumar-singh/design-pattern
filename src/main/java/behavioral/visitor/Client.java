package behavioral.visitor;

import behavioral.visitor.room.DeluxeRoom;
import behavioral.visitor.room.DoubleRoom;
import behavioral.visitor.room.Room;
import behavioral.visitor.room.SingleRoom;

/**
 * Visitor Design Pattern: The purpose of a Visitor pattern is to define a new operation without introducing the modifications to
 * an existing object structure. It encourages open/close principle.
 *
 * @link: https://www.baeldung.com/java-visitor-pattern
 */
public class Client {
    public static void main(String[] args) {
        Room room = new SingleRoom();
        room.accept(new RoomPricingVisitor());
        room.accept(new RoomMaintenanceVisitor());

        room = new DoubleRoom();
        room.accept(new RoomPricingVisitor());
        room.accept(new RoomMaintenanceVisitor());

        room = new DeluxeRoom();
        room.accept(new RoomPricingVisitor());
        room.accept(new RoomMaintenanceVisitor());

    }
}
