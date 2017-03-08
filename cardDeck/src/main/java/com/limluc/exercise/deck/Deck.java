package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.Card;

public interface Deck {

    Card deal();

    void shuffle();
}
