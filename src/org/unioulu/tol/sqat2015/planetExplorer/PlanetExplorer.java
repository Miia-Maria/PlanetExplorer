package org.unioulu.tol.sqat2015.planetExplorer;


// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 148
// Finish time: 13:35
public class PlanetExplorer {
	
	String facing;
	String command;
	int pos_x = 0;
	int pos_y = 0;
	

	public PlanetExplorer(int x, int y, String obstacles){
		
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public String executeCommand(String command){
		
		facing = "North";
		
		
		if (facing == "North" && command == "l"){
			facing = "West";	
		} else if(facing == "North" && command == "r"){
				facing = "East";
				} else if(facing == "North" && command == "f"){
					facing = "North";
					pos_x++;
					} else if(facing == "North" && command == "b"){
						facing = "North";
						pos_x--;
						} 
		
		return "(" + pos_x + ", " + pos_y + ")" + ", " + facing;
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		
	}
	
	
	
	public Object getFacing() {
		return this.facing;
		
	}

	public Object getPos_X() {
		return this.pos_x;
	}

}
