package com.cpg.addition.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cpg.addition.Addition;

public class AdditionTest {

	@Disabled
	@Test
	public void test() {
		fail("Not yet implemented");
		
	}
	
	@Test
	void aditionTest()
	{
		Addition ob=new Addition();
		assertEquals(4, ob.addition(2, 2),"Addition is Wrong");
	}

}
