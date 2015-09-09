void setup()
{
  size(300,300);
  strokeWeight(1);
  background(0);
  frameRate(6);
}
void draw()
{	
	//set stroke color
	int strokeY = (int)(Math.random()*255);
	stroke(255,255, strokeY); 
	//while loop repeats until endY is off the screen
	int startX=0;
	int startY=0; 
	int endX=0; 
	int endY=0;
	startX = (int)(Math.random()*getWidth());
	while (endY < getHeight()){
		int randomX = (int)(Math.random()*18-9);
		endX = startX + randomX;
		int randomY = (int)(Math.random()*9);
		endY = startY + randomY;
		line (startX, startY, endX, endY);
		startX = endX;
		startY = endY;
	}

}

