package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.PlayingCard;
import com.limluc.exercise.deck.card.Pip;
import com.limluc.exercise.deck.card.Suit;

public final class StandardPlayingDeck extends CardDeck {

    public StandardPlayingDeck() {
        for (Suit suit : Suit.values()) {
            for (Pip pip : Pip.values()) {
                this.cardList.add(new PlayingCard(pip, suit));
            }
        }
    }

    @Override
    public String whichCardDeck() {
        return "StandardFrenchPlayingCard";
    }
}
