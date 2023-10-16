import processing.core.PApplet;
import processing.core.PFont;

import java.util.Random;

public class Sketch extends PApplet {

	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    background(173, 216, 230);
  
  }
   Random myRandom = new Random();
    
    int ranR = myRandom.nextInt(256);
    int ranG = myRandom.nextInt(256);
    int ranB = myRandom.nextInt(256);
    int ranY = myRandom.nextInt(601);
    int ranX = myRandom.nextInt(601);
     
  

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  public void draw() {
     if (ranX >= 180 && ranX <= 300){
      ranX = ranX + 180 ;
    } 
  //This determines the colour of day based on the position of time
  
    if (ranX > 300 || ranY > 400){
    background(95, 97, 99);
    fill(255, 255, 255);
    text("Prepare to go to Bed!!", 40, 120);
  }
    if (ranY < 300 && ranX > 300){
      background(237, 142, 59);
    }
    if (ranX > 400 && ranY > 500 || ranX < 50 && ranY > 500){
      background(0,0,0);
       fill(255, 255, 255);
       text("Lights Out!!", 40, 120);
    }
    if (ranY < 400 && ranY > 300){
      background(255, 225, 150);
    }

    
    
    

	  
	// sample code, delete this stuff
    stroke(ranR,ranG,ranB);
    fill(ranR,ranG,ranB);

     //Foreground
    fill(34,139,34);
    rect(0, 500, 600, 100);

//House base
    fill(161, 102, 47);
    rect(180, 300, 200,200);

//House Top
    fill(128,0,0);
    triangle(180, 300, 278, 150, 380, 300);

//Door
    fill(255);
    rect(240, 400, 80, 100);

//Sun
    fill(	255, 174, 66);
    ellipse(ranX, ranY, 150, 150);
//The timer    
   fill(0,0,0); 
   PFont myFont = createFont("Arial", 50);
    textFont(myFont, 20);

    text(hour() + " : " + String.format("%02d", minute()) +
     " : " + String.format("%02d", second()), 470, 560);
    

 
  }

}