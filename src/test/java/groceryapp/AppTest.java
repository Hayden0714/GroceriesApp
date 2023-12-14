package groceryapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	App app = new App();
	@Test
	public void test() {
		
		assertEquals("Welcome to the groceries app!", app.printGreeting());
	}

}
