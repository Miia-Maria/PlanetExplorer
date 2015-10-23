package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;


import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	@Test
	public void testIfFacingNorthCommandLeftChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("l");

		
		assertEquals("West",planetExplorer.getFacing());
		
	}
	
	@Test
	public void testIfFacingNorthCommandRightChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("r");

		
		assertEquals("East",planetExplorer.getFacing());
		
	}
	
	@Test
	public void testIfFacingNorthCommandForwardChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("f");

		
		assertEquals("North",planetExplorer.getFacing());
		
	}
	
	@Test
	public void testIfFacingNorthCommandBacwardChangeItWest(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"North");
		
		planetExplorer.executeCommand("b");

		
		assertEquals("North",planetExplorer.getFacing());
		
	}
	
	@Test
	public void testIfFacingWestCommandLeftChangeItSouth(){
		PlanetExplorer planetExplorer = new PlanetExplorer(0,0,"West");
		
		planetExplorer.executeCommand("l");

		
		assertEquals("South",planetExplorer.getFacing());
		
	}
}

