package com.kodilla.collections.adv.exercise.dictionary;

import java.util.Objects;

public class EnglishWord {
    private String word;
    private PartOfSpeach partOfSpeach;

    public EnglishWord(PartOfSpeach partOfSpeach, String word) {
        this.word = word;
        this.partOfSpeach = partOfSpeach;
    }

    public String getWord() {
        return word;
    }

    public PartOfSpeach getPartOfSpeach() {
        return partOfSpeach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return Objects.equals(word, that.word) &&
                partOfSpeach == that.partOfSpeach;
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, partOfSpeach);
    }
}
