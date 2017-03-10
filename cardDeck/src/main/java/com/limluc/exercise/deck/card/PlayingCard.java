package com.limluc.exercise.deck.card;

public class PlayingCard implements Card {
    private final Pip pip;
    private final Suit suit;

    public PlayingCard(Pip pip, Suit suit) {
        this.pip = pip;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayingCard)) return false;

        PlayingCard that = (PlayingCard) o;

        return pip == that.pip && suit == that.suit;
    }

    @Override
    public int hashCode() {
        int result = pip != null ? pip.hashCode() : 0;
        result = 31 * result + (suit != null ? suit.hashCode() : 0);
        return result;
    }
}
