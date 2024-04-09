package behavioral.visitor;

import behavioral.visitor.room.DeluxeRoom;
import behavioral.visitor.room.DoubleRoom;
import behavioral.visitor.room.Room;
import behavioral.visitor.room.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Single Room Visited");
        room.setRoomPrice(1500);
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Double Room Visited");
        room.setRoomPrice(2000);
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Deluxe Room Visited");
        room.setRoomPrice(4000);
    }
}
