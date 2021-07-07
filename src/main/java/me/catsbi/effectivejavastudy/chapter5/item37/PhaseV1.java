package me.catsbi.effectivejavastudy.chapter5.item37;

public enum PhaseV1 {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                {null, MELT, SUBLIME},
                {FREEZE, null, BOIL},
                {DEPOSIT, CONDENSE, null}
        };

        public static Transition from(PhaseV1 from, PhaseV1 to) {
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }
    }
}
