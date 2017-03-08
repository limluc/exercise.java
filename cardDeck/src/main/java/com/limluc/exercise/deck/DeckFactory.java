package com.limluc.exercise.deck;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.NoSuchElementException;

@SuppressWarnings("WeakerAccess")
public class DeckFactory {
    private static final Map<String, Class> deckTypes = new ImmutableMap.Builder<String, Class>()
            .put("StandardPlayingDeck", StandardPlayingDeck.class)
            .build();

    public static Deck getDeck(final String deckType) throws Exception {
        if (deckType == null) {
            throw new IllegalArgumentException(String.format("Please provide deckType [%s]", deckTypes.keySet()));
        } else {
            Class aClass = deckTypes.get(deckType);
            if (aClass == null) {
                throw new NoSuchElementException(String.format("Please provide deckType [%s]", deckTypes.keySet()));
            }
            return (Deck) aClass.newInstance();

        }
    }

}
