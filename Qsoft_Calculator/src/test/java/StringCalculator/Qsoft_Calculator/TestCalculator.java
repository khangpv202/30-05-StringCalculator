package StringCalculator.Qsoft_Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	@Test
	public void testAddEmptyString(){
		Calcular calcular = new Calcular();		
		assertEquals(0,calcular.add(""));
	}
	@Test
	public void testAddOneNumber(){
		Calcular calcular = new Calcular();		
		assertEquals(1,calcular.add("1"));
		assertEquals(9,calcular.add("9"));
	}
	@Test
	public void testAddTwoNumber(){
		Calcular calcular = new Calcular();		
		assertEquals(3,calcular.add("1,2"));		
	}
	
	@Test
	public void testAddThreeNumber(){
		Calcular calcular = new Calcular();		
		assertEquals(6,calcular.add("1,2,3"));		
	}
	
	@Test
	public void testAddNewLine(){
		Calcular calcular = new Calcular();		
		assertEquals(6,calcular.add("1\n2,3"));		
	}		
	
	@Test
	public void testAddDelimiters(){
		Calcular calcular = new Calcular();		
		assertEquals(6,calcular.add("//;\n1;2;3"));		
	}
	
	@Test
	public void testAddThrow (){
		Calcular calcular = new Calcular();	
		try {			
			assertEquals(6,calcular.add("-2,3,1"));	
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("negatives not allowed", e.getMessage());
		}
		try {
			assertEquals(6,calcular.add("//,\n-2,3,1"));
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals("negatives not allowed", e.getMessage());
		}
		
	}
}
