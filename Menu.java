/*
Author: Benjy R-R
Last Modified 09/14/2017
This class runs the start of the program.
*/

public class Menu{
  
  private Story story;
	
	public Menu(){
		this.story = new Story();
	}
	
	//menu selection
	public void selection(int option){
	
		switch(option){
		
		case 1: 
	    story.readFile("Story.txt");
      break;
		case 2:
			//put option 2 here
			break;
		default:
			break;
			
			//put default here
			
		}
	}

	//draws the menu
	public void drawMenu(){
		System.out.println("1 - Play");
		System.out.println("2 - Quit");
	}
}