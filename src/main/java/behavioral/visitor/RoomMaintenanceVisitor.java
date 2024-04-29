package behavioral.visitor;

import behavioral.visitor.room.DeluxeRoom;
import behavioral.visitor.room.DoubleRoom;
import behavioral.visitor.room.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Performing maintenance for Single Room");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Performing maintenance for Double Room");
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Performing maintenance for Deluxe Room");
    }
}
