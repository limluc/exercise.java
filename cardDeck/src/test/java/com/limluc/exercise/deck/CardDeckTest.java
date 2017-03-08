package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardDeckTest {
    private CardDeck cardDeck;

    @Before
    public void setUp() throws Exception {
        this.cardDeck = new StandardPlayingDeck();
        assertEquals(52, cardDeck.countRemaining());

    }

    @Test
    public void shouldReturnPlayingCard() throws Exception {
        assertEquals("StandardFrenchPlayingCard",
                this.cardDeck.whichCardDeck());
    }

    @Test
    public void shouldReturnCountAfterDeal() throws Exception {
        //act
        this.cardDeck.deal();
        assertEquals(51, this.cardDeck.countRemaining());
    }

    @Test
    public void shouldShuffleCard() throws Exception {
        final Card firstCard = this.cardDeck.peak();

        //act
        this.cardDeck.shuffle();

        //assert
        assertNotEquals("Unlikely to be equal after shuffle",
                firstCard, this.cardDeck.peak());
    }
}