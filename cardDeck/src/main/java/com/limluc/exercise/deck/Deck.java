package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.Card;

public interface Deck extends IsShufflable {
    Card deal();
}
