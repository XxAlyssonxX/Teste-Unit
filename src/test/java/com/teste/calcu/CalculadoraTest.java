package com.teste.calcu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 5 + 5 dont equals 10");
	}
	
	@Test
	@DisplayName("Teste 5 - 2 = 3")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 2D;
		double esperado = 3D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 5 - 2 dont equals 3");
	}
	
	@Test
	@DisplayName("Teste 10 * 5 = 50")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 10D;
		double valor2 = 5D;
		double esperado = 50D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 10 * 5 dont equals 50");
	}
	
	@Test
	@DisplayName("Teste 50 / 5 = 10")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 50D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, " 50 / 5 dont equals 10");
	}
	
	

}
