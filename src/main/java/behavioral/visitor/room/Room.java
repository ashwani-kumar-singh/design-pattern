package behavioral.visitor.room;

import behavioral.visitor.RoomVisitor;

public interface Room {
    void accept(RoomVisitor visitor);
}
