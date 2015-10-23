package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	
	@Test
	public void testIfFacingNorthCommandRightChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		String command = "l";
		String facing = "North";
		
		planetExplorer.facing("l", "North");

		
		assertEquals("West",planetExplorer.getFacing());
		
	}
}
