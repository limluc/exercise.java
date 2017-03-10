package com.limluc.exercise.deck;

import com.limluc.exercise.deck.card.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ModernisedCardDeckTest {
    private CardDeck cardDeck;

    @Before
    public void setUp() throws Exception {
        this.cardDeck = new ModernisedPlayingDeck(2);
        assertEquals(54, cardDeck.countRemaining());

    }

    @Test
    public void shouldReturnPlayingCard() throws Exception {
        assertEquals("StandardFrenchPlayingCardWithJoker",
                this.cardDeck.whichCardDeck());
        assertEquals("Should Return 2",
                2, ((ModernisedPlayingDeck) cardDeck).countJokerLeft());
    }

    @Test
    public void shouldReturnCountAfterDeal() throws Exception {
        //act
        this.cardDeck.deal();
        assertEquals(53, this.cardDeck.countRemaining());
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