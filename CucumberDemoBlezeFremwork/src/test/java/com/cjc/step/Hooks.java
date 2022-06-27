package com.cjc.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforesc()
	{
		System.out.println("----Before done----");
	}
	
	@After
	public void aftersc()
	{
		System.out.println("----After done----");
	}


}
