package me.catsbi.effectivejavastudy.chapter1.item1.study;

import me.catsbi.effectivejavastudy.chapter1.item1.domain.Study;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class StudyFactory {
    private static final Map<String, Study> store = new HashMap<>();
    private static StudyFactory instance = new StudyFactory();

    private StudyFactory() { }

    public static StudyFactory getInstance() {
        if (Objects.isNull(instance)) {
            instance = new StudyFactory();
        }
        return instance;
    }

    public synchronized Study getStudy(String name, int limit) {
        Study study = store.get(name);
        if (Objects.isNull(study)) {
            study = Study.newStudy(name, limit);
            store.put(name, study);
        }
        return study;
    }
}
