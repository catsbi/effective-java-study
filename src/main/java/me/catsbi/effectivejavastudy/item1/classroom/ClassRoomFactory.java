package me.catsbi.effectivejavastudy.item1.classroom;

import me.catsbi.effectivejavastudy.item1.domain.BigClassRoom;
import me.catsbi.effectivejavastudy.item1.domain.ClassRoom;
import me.catsbi.effectivejavastudy.item1.domain.MediumClassRoom;
import me.catsbi.effectivejavastudy.item1.domain.SmallClassRoom;

import java.rmi.NoSuchObjectException;
import java.util.Objects;

public class ClassRoomFactory {
    public static final String NOT_FOUND_CLASS_ROOM_FROM_LIMIT_COUNT = "Not Found ClassRoom from limitCount:";
    private static ClassRoomFactory instance = new ClassRoomFactory();

    private ClassRoomFactory() {
    }

    public static ClassRoomFactory getInstance() {
        if (Objects.isNull(instance)) {
            instance = new ClassRoomFactory();
        }
        return instance;
    }

    public static ClassRoom getClassRoom(int limitCount) throws NoSuchObjectException {
        if (SmallClassRoom.supported(limitCount)) {
            return new SmallClassRoom();
        }

        if (MediumClassRoom.supported(limitCount)) {
            return new MediumClassRoom();
        }

        if (BigClassRoom.supported(limitCount)) {
            return new BigClassRoom();
        }
        throw new NoSuchObjectException(NOT_FOUND_CLASS_ROOM_FROM_LIMIT_COUNT + limitCount);
    }


}
