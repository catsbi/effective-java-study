package me.catsbi.effectivejavastudy.chapter1.item1.domain;

import lombok.Data;

import static me.catsbi.effectivejavastudy.chapter1.item1.domain.StudyStatus.DRAFT;
import static me.catsbi.effectivejavastudy.chapter1.item1.domain.StudyStatus.ENDED;

@Data
public class Study {
    private Long id;
    private String name;
    private int limit;
    private StudyStatus studyStatus;

    public Study() {}

    public Study(Long id, String name, int limit, StudyStatus studyStatus) {
        this.id = id;
        this.name = name;
        this.limit = limit;
        this.studyStatus = studyStatus;
    }

    public Study(String name, int limit, StudyStatus studyStatus) {
        this.name = name;
        this.limit = limit;
        this.studyStatus = DRAFT;
    }

    public static Study newStudy(String name, int limit) {
        return new Study(name, limit, DRAFT);
    }

    public static Study endedStudy(String name, int limit) {
        return new Study(name, limit, ENDED);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLimit() {
        return limit;
    }

    public StudyStatus getStudyStatus() {
        return studyStatus;
    }
}
