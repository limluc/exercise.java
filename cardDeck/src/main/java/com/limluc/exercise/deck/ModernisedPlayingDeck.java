package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.ModernPip;
import com.limluc.exercise.deck.card.ModernSuit;
import com.limluc.exercise.deck.card.PlayingCard;

import java.util.stream.IntStream;

@SuppressWarnings("WeakerAccess")
public final class ModernisedPlayingDeck extends StandardPlayingDeck {

    @SuppressWarnings("SameParameterValue")
    public ModernisedPlayingDeck(int countOfJoker) {

        super();
        IntStream.range(0, countOfJoker).forEach(s -> this.cardList.add(newJoker()));
    }

    public long countJokerLeft() {
        return this.cardList.stream()
                .filter(s -> s.equals(newJoker()))
                .count();
    }

    @Override
    public String whichCardDeck() {
        return "StandardFrenchPlayingCardWithJoker";
    }

    private PlayingCard newJoker() {
        return new PlayingCard(ModernPip.ZERO, ModernSuit.JOKER);
    }
}
