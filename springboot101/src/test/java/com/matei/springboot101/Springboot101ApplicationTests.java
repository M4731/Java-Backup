package com.matei.springboot101;

import com.matei.springboot101.repositories.ProductRepositoryDB;
import com.matei.springboot101.services.ProductService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class Springboot101ApplicationTests {

	@MockBean
	private ProductRepositoryDB productRepository;

	@Autowired
	private ProductService productService;

	/*
	@Before   --->  @BeforeEach
    @BeforeClass  ---> @BeforeAll
    @After
    @AfterClass
	 */

	@BeforeAll
	static void beforeClass(){
		System.out.println(":D");
	}

	@BeforeEach
	void before() {
		System.out.println(":)");
	}

	@Test
	void noProductsReturnedTest() {
		given(productRepository.getProductNamesTest()).willReturn(Collections.emptyList());

		List<String> res = productService.getProductNamesWithEvenNoOfCharactersTest();

		assertTrue(res.isEmpty());
	}

	@Test
	void moreProductsAreFoundTest() {
		List<String> input = Arrays.asList("aa", "bbbb", "ccc");

		given(productRepository.getProductNamesTest()).willReturn(input);

		List<String> res = productService.getProductNamesWithEvenNoOfCharactersTest();

		assertEquals(2, res.size());
		//verify(productRepository, times(2)).addProductTest(any());
	}

}
