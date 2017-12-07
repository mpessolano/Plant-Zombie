package Plants;
import java.util.ArrayList;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import Characters.*;
import Event.*;
import GUI.Main;
import Interface.*;
public class Peashooter extends Plants implements Characters{
	
	private ArrayList<Bullet> bullets=new ArrayList<>();
	private ArrayList<Zombies> zombies=new ArrayList<>();
	Physic phy =new Physic();
	Bullet tempBullet;
	Main screen;
	
	public Peashooter(int x, int y)   {super(x, y);}
	
	@Override
	public void render(Graphics g,Image png) {                // draw bullets
		for(int i=0;i<bullets.size();i++)
		{
			tempBullet=bullets.get(i);
			tempBullet.render(g,png);
		}
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
	
}
