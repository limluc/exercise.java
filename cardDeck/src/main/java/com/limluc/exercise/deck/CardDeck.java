package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.Card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public abstract class CardDeck implements Deck {

    final List<Card> cardList = new LinkedList<>();

    public int countRemaining() {
        return cardList.size();
    }

    public String whichCardDeck(){
        return getClass().getSimpleName();
    }

    public Card peak(){
        return cardList.get(0);
    }

    public Card peak(int i){
        return cardList.get(i);
    }

    @Override
    public Card deal() {
        return cardList.remove(0);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cardList);
    }
}
