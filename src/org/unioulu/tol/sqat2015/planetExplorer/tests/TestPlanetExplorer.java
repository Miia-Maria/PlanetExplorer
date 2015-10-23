package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
		
	
	@Test
	public void testIfFacingNorthCommandLeftChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("l");

		
		assertEquals("(0, 0), North",planetExplorer.executeCommand(""));
		
	}
	
	@Test
	public void testIfFacingNorthCommandRightChangeItEast(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("r");

		
		assertEquals("(0, 0), East",planetExplorer.executeCommand(""));
		
	}
	
	@Test
	public void testIfFacingNorthCommandForwardReminesNorthAndXPositionChanges(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("f");

		
		assertEquals("(1, 0), North",planetExplorer.executeCommand(""));
		
	}
	
	@Test
	public void testIfFacingNorthCommandBacwardReminesNorthAndXPositionChanges(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("b");

		
		assertEquals("(-1, 0), North",planetExplorer.executeCommand(""));
		
	}
	
	
}

