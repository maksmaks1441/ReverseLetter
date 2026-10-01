package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void reverseLetter_shouldReverseOnlyLettersAndKeepNonLettersInPlace(){
        String result = reverse.reverseLetter("J@va the be$t!123");
        Assertions.assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    public void reverseLetter_shouldReturnEmptyStringWhenInputIsEmpty(){
        String result = reverse.reverseLetter("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverseLetter_shouldReturnEmptyStringWhenInputIsNull(){
        String result = reverse.reverseLetter(null);
        Assertions.assertEquals("", result);
    }

    @Test
    public void reverseLetter_shouldReturnSameStringWhenInputIsSingleLetter(){
        String result = reverse.reverseLetter("a");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void reverseLetter_shouldReturnUnchangedWhenInputHasNoLetters(){
        String result = reverse.reverseLetter("123 !@#");
        Assertions.assertEquals("123 !@#", result);
    }

    @Test
    public void reverseLetter_shouldReverseEntireStringWhenInputContainsOnlyLetters(){
        String result = reverse.reverseLetter("abcd");
        Assertions.assertEquals("dcba", result);
    }

    @Test
    public void reverseLetter_shouldKeepNonLettersInPlaceAtEdgesAndMiddle(){
        String result = reverse.reverseLetter("123abc a23b efg321");
        Assertions.assertEquals("123gfe b23a cba321", result);
    }

    @Test
    public void reverseLetter_shouldPreserveLetterCaseDuringReverse(){
        String result = reverse.reverseLetter("123Abc a23B efg321");
        Assertions.assertEquals("123gfe B23a cbA321", result);
    }

}
