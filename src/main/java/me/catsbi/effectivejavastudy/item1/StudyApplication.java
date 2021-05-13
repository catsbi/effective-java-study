package me.catsbi.effectivejavastudy.item1;

import me.catsbi.effectivejavastudy.item1.classroom.ClassRoomFactory;
import me.catsbi.effectivejavastudy.item1.domain.ClassRoom;
import me.catsbi.effectivejavastudy.item1.domain.Study;
import me.catsbi.effectivejavastudy.item1.study.StudyFactory;

import java.rmi.NoSuchObjectException;

public class StudyApplication {
    public static void main(String[] args) throws NoSuchObjectException {
        StudyFactory studyFactory = StudyFactory.getInstance();
        Study study = studyFactory.getStudy("수학", 25);

        ClassRoom classRoom = ClassRoomFactory.getClassRoom(study.getLimit());

        System.out.println("study = " + study);
        System.out.println("classRoom = " + classRoom.getCapacity());
    }
}
