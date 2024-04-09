package behavioral.visitor;

import behavioral.visitor.room.DeluxeRoom;
import behavioral.visitor.room.DoubleRoom;
import behavioral.visitor.room.SingleRoom;

public interface RoomVisitor {
    void visit(SingleRoom room);

    void visit(DoubleRoom room);

    void visit(DeluxeRoom room);
}
