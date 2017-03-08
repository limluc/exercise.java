package com.limluc.exercise.deck;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class DeckFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNull() throws Exception {
        DeckFactory.getDeck(null);
        fail("Should Fail here");
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowExceptionWhenNotAvailable() throws Exception {
        DeckFactory.getDeck("IAmNotAvailable");
    }

    @Test
    public void shouldReturnStandardPlayingDeck() throws Exception {
        Deck deck = DeckFactory.getDeck("StandardPlayingDeck");
        assertTrue("Should Return StandardPlayingDeck", deck instanceof StandardPlayingDeck);
    }
}