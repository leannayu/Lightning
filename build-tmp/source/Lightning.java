import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

public void setup()
{
  size(300,300);
  strokeWeight(1);
  background(0);
  frameRate(6);
}
public void draw()
{	
	//set stroke color
	int strokeY = (int)(Math.random()*255);
	stroke(255,255, strokeY); 
	//while loop repeats until endY is off the screen
	int startX=0;
	int startY=0; 
	int endX=0; 
	int endY=0;
	startX = (int)(Math.random()*width);
	while (endY < height){
		int randomX = (int)(Math.random()*18-9);
		endX = startX + randomX;
		int randomY = (int)(Math.random()*9);
		endY = startY + randomY;
		line (startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
