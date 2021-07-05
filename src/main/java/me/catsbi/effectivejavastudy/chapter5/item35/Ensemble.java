package me.catsbi.effectivejavastudy.chapter5.item35;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians(){ return ordinal() + 1; }

}
