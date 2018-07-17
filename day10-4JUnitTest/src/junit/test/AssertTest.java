package junit.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	/**
	 * @test 애너테이션이 붙은 메소드를 자동 실행하여 테스트를 진행
	 * 모든 테스트 메소드는 리턴타입이 void로 지정되어야한다.
	 */
//	@Test
	void testAssertEquals() {
		assertEquals("안녕하세오", "안녕하세오");
	}
	
//	@Test
	void testAssertEquals2() {
		//두 입력값에 대하여 동일 값을 것을 가정하여
		//같은 값이면 테스트가 success라고 판단
		assertEquals("안녕하세오", "안녕못해오");
	}
	
//	@Test
	void testAssertBoolean() {
		//조건이 false일 것을 가정하여
		//false가 들어왔을 때, 테스트가 success라고 판단
		assertFalse("실패-조건이 false가 아님", false);
	}
	
//	@Test
	void testAssertBoolean2() {
		assertTrue("실패-조건이 false가 아님", true);
	}
	
//	@Test
	void testNull() {
		//null이라 success
		assertNull(null);
	}
//	@Test
	void testNull2() {
		//null이 아니라 false
		assertNull("옴뇸뇸");
	}
	
	@Test
	void testAssertArrayEquals() {
		int[] numbers = new int[10];
		int[] copied = numbers;
		
		assertArrayEquals("배열의 내용이 동일함", numbers, copied);
	}
	@Test
	void testAssertByteArrayEqauls() {
		byte[] expected ="테스트".getBytes();
		byte[]	actual = "합니다".getBytes();
		assertArrayEquals(expected, actual);
	}
	
	
}
