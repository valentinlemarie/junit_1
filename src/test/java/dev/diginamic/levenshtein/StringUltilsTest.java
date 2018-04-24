package dev.diginamic.levenshtein;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUltilsTest {

	@Test
	public void test() {
		assertTrue(StringUtils.levenshteinDistance("a", "a") == 0);
		assertTrue(StringUtils.levenshteinDistance("chat", "chats") == 1 ) ;
		assertTrue(StringUtils.levenshteinDistance("machins", "machine") == 1 ) ;;
		assertTrue(StringUtils.levenshteinDistance("aviron", "avion")==1 );
		assertTrue(StringUtils.levenshteinDistance("distance", "instance") == 2 );
		assertTrue(StringUtils.levenshteinDistance("Chien", "Chine") == 2 );
		assertTrue(StringUtils.levenshteinDistance(null, "a") == -1);
		assertTrue(StringUtils.levenshteinDistance("b", null) == -1);
		assertTrue(StringUtils.levenshteinDistance(null, null) == -1);
	}

}
