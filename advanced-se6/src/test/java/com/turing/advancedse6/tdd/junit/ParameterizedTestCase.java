package com.turing.advancedse6.tdd.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.platform.commons.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParameterizedTestCase {
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
		log.info("Candidate "+candidate);
	    assertTrue(candidate.length()>2);
	}
	
	@ParameterizedTest
	@CsvSource({ "apple,3", "banan,4", "orange,5" })
	void testCSV(String name,int qty) {
		log.info("CSV Name "+name+" Qty "+qty);
	    assertTrue(qty>2);
	}
	
	@ParameterizedTest
	@MethodSource("stringProvider")
	void testWithExplicitLocalMethodSource(String argument) {
		log.info("String Provider "+argument);
	    assertNotNull(argument);
	}

	static Stream<String> stringProvider() {
	    return Stream.of("apple", "banana");
	}
	
	@ParameterizedTest
	@MethodSource("stringIntAndListProvider")
	void testWithMultiArgMethodSource(String str, int num, List<String> list) {
	    assertEquals(5, str.length());
	    assertTrue(num >=1 && num <=2);
	    assertEquals(2, list.size());
	}

	static Stream<Arguments> stringIntAndListProvider() {
	    return Stream.of(
	        Arguments.of("apple", 1, Arrays.asList("a", "b")),
	        Arguments.of("lemon", 2, Arrays.asList("x", "y"))
	    );
	}
	
}
