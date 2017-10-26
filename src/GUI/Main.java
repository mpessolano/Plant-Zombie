package GUI;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.transition.FadeInTransition;


public class Main extends StateBasedGame {
	public static final String gamename = "Plants vs Zombies";
	public static final int menu = 0;
	public static final int play = 1;
	public static final int pause = 2;
	public static final int gameover = 3;
	public static int HEIGHT=768;
	public static int WIDTH=1024;
	
	public Main(String gamename) throws SlickException {
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	//	this.addState(new Gameover(gameover));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.enterState(menu, new FadeInTransition(new Color(255, 1, 1)), new EmptyTransition());
	}

	
	public static void main (String[] args)  {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Main (gamename));
			appgc.setDisplayMode(WIDTH,HEIGHT, false);
			appgc.start();  //Draw screen
		}catch (SlickException e) {
			e.printStackTrace();
		}
		
	}
}