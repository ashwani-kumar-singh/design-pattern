package behavioral.visitor.room;

import behavioral.visitor.RoomVisitor;

public class DoubleRoom implements Room {
    int roomPrice;
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }
}
