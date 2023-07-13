package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameServiceTest {

	@ParameterizedTest
	@MethodSource("data")
	void test(String output, String input) {
		GameService gs = new GameService();
		assertEquals(output, gs.authorSearch(input));
	}

	@Test
	void test1() {
		GameService gs = new GameService();
		assertNotNull(gs.viewAll());
	}

	public static Collection data() {
		return Arrays.asList(new Object[][] { { null, "B" }, { "SnowBird", "danny" }, { "FreshFood", "Ram" },
				{ null, "X" }, { "YammyTommy", "NarayAn" } });
	}

}