package Characters;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class Bullet extends GameObject{
	public int dX=40,dY=40;                        //size of bullet
	double speed=0.5;                           // speed of bullet
	private int delayFlying=0;
	private int durationFlying=1000;
	public Bullet(double d,double e)  {super(d,e);}
	public void flying()    
	{
		xPos+=speed;                               //set speed for bullets while flying
	}
	public void flyingtripUP()						//bullet go up
	{
		delayFlying+=1;
		if(delayFlying<durationFlying) 
		{
			xPos+=speed;
			yPos=-xPos;
		}
		else {
			xPos+=speed;
		}
		delayFlying=0;
	}
	public void flyingtripDOWN()						//bullet go down
	{	
		delayFlying+=1;
		if(delayFlying<durationFlying) 
		{
			xPos+=speed;
			yPos=xPos;
		}
		else {
			xPos+=speed;
		}
		delayFlying=0;
	}
	public void draw(Graphics g, Image png)                  // load image
	{
		g.drawImage(png,(int) this.xPos+30,(int)this.yPos+0);
	}
}