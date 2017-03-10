package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.PlayingCard;
import com.limluc.exercise.deck.card.Pip;
import com.limluc.exercise.deck.card.StandardPip;
import com.limluc.exercise.deck.card.StandardSuit;
import com.limluc.exercise.deck.card.Suit;

@SuppressWarnings("WeakerAccess")
public class StandardPlayingDeck extends CardDeck {

    public StandardPlayingDeck() {
        for (Suit suit : StandardSuit.values()) {
            for (Pip pip : StandardPip.values()) {
                this.cardList.add(new PlayingCard(pip, suit));
            }
        }
    }

    @Override
    public String whichCardDeck() {
        return "StandardFrenchPlayingCard";
    }
}
