package slickadventure;

import java.util.ArrayList;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.tiled.TiledMap;

public class AGE extends BasicGameState {

	public Statue artifact;
        public ArrayList<Statue> winning = new ArrayList();
              
	private boolean[][] hostiles;

	private static TiledMap grassMap;

	private static AppGameContainer app;

	private static Camera camera;
	
	public static int counter = 0;

	// Player stuff

	private Animation sprite, up, down, left, right, wait;

	/**
	 * 
	 * The collision map indicating which tiles block movement - generated based
	 * 
	 * on tile properties
	 */

	// changed to match size of sprites & map

	private static final int SIZE = 32;

	// screen width and height won't change

	private static final int SCREEN_WIDTH = 1000;

	private static final int SCREEN_HEIGHT = 750;

	public AGE(int xSize, int ySize) {

	}

	public void init(GameContainer gc, StateBasedGame sbg)

	throws SlickException {
		
		 gc.setTargetFrameRate(60);

		gc.setShowFPS(false);

		// *******************

		// Scenerey Stuff

		// ****************

		grassMap = new TiledMap("res/anewhope.tmx");

		// Ongoing checks are useful

		camera = new Camera(gc, grassMap);

		// *********************************************************************************

		// Player stuff --- these things should probably be chunked into methods
		// and classes

		// *********************************************************************************

		SpriteSheet runningSS = new SpriteSheet(
				"res/MageOP.png",64, 64, 0);

		
		up = new Animation();

		up.setAutoUpdate(true);

		up.addFrame(runningSS.getSprite(0, 8), 330);

		up.addFrame(runningSS.getSprite(1, 8), 330);

		up.addFrame(runningSS.getSprite(2, 8), 330);

		up.addFrame(runningSS.getSprite(3, 8), 330);

		up.addFrame(runningSS.getSprite(4, 8), 330);

		up.addFrame(runningSS.getSprite(5, 8), 330);

		up.addFrame(runningSS.getSprite(6, 8), 330);

		up.addFrame(runningSS.getSprite(7, 8), 330);

		up.addFrame(runningSS.getSprite(8, 8), 330);

		down = new Animation();

		down.setAutoUpdate(false);

		down.addFrame(runningSS.getSprite(0, 10), 330);

		down.addFrame(runningSS.getSprite(1, 10), 330);

		down.addFrame(runningSS.getSprite(2, 10), 330);

		down.addFrame(runningSS.getSprite(3, 10), 330);

		down.addFrame(runningSS.getSprite(4, 10), 330);

		down.addFrame(runningSS.getSprite(5, 10), 330);

		down.addFrame(runningSS.getSprite(6, 10), 330);

		down.addFrame(runningSS.getSprite(7, 10), 330);

		down.addFrame(runningSS.getSprite(8, 10), 330);

		left = new Animation();

		left.setAutoUpdate(false);

		left.addFrame(runningSS.getSprite(0, 9), 330);

		left.addFrame(runningSS.getSprite(1, 9), 330);

		left.addFrame(runningSS.getSprite(2, 9), 330);

		left.addFrame(runningSS.getSprite(3, 9), 330);

		left.addFrame(runningSS.getSprite(4, 9), 330);

		left.addFrame(runningSS.getSprite(5, 9), 330);

		left.addFrame(runningSS.getSprite(6, 9), 330);

		left.addFrame(runningSS.getSprite(7, 9), 330);

		left.addFrame(runningSS.getSprite(8, 9), 330);

		right = new Animation();

		right.setAutoUpdate(false);

		right.addFrame(runningSS.getSprite(0, 11), 330);

		right.addFrame(runningSS.getSprite(1, 11), 330);

		right.addFrame(runningSS.getSprite(2, 11), 330);

		right.addFrame(runningSS.getSprite(3, 11), 330);

		right.addFrame(runningSS.getSprite(4, 11), 330);

		right.addFrame(runningSS.getSprite(5, 11), 330);

		right.addFrame(runningSS.getSprite(6, 11), 330);

		right.addFrame(runningSS.getSprite(7, 11), 330);

		right.addFrame(runningSS.getSprite(8, 11), 330);

		wait = new Animation();

		wait.setAutoUpdate(true);

		wait.addFrame(runningSS.getSprite(0, 14), 733);

		wait.addFrame(runningSS.getSprite(1, 14), 733);

		wait.addFrame(runningSS.getSprite(2, 14), 733);

		wait.addFrame(runningSS.getSprite(3, 14), 733);

		// wait.addFrame(runningSS.getSprite(2, 14), 733);

		// wait.addFrame(runningSS.getSprite(5, 14), 333);

		sprite = wait;

		// *****************************************************************

		// Obstacles etc.

		// build a collision map based on tile properties in the TileD map

		Blocked.blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];

		// System.out.println("Map height:" + grassMap.getHeight());

		// System.out.println("Map width:" + grassMap.getWidth());

		// There can be more than 1 layer. You'll check whatever layer has the
		// obstacles.

		// You could also use this for planning traps, etc.

		// System.out.println("Number of tile layers: "
		// +grassMap.getLayerCount());

		System.out.println("The grassmap is " + grassMap.getWidth() + " by "
				+ grassMap.getHeight());

		for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {

			for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {

				// int tileID = grassMap.getTileId(xAxis, yAxis, 0);

				// Why was this changed?

				// It's a Different Layer.

				// You should read the TMX file. It's xml, i.e.,human-readable
				// for a reason

				int tileID = grassMap.getTileId(xAxis, yAxis, 1);

				String value = grassMap.getTileProperty(tileID,

				"blocked", "false");

				if ("true".equals(value)) {

					//System.out.println("The tile at x " + xAxis + " and y axis "
					//		+ yAxis + " is blocked.");

					Blocked.blocked[xAxis][yAxis] = true;

				}

			}

		}

		System.out.println("Array length " + Blocked.blocked[0].length);

		// A remarkably similar process for finding hostiles

		hostiles = new boolean[grassMap.getWidth()][grassMap.getHeight()];
                artifact = new Statue(3070, 75);
                winning.add(artifact);
                
		//speedpotion = new Item1(100,150);
		//speedpotion1 = new Item1(450,100);	
		//stuff1.add(speedpotion);
		//stuff1.add(speedpotion1);
		
		//antidote = new Itemwin(3004,92);
		//stuffwin.add(antidote);
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)

	throws SlickException {

		camera.centerOn((int) Player.x, (int) Player.y);

		camera.drawMap();

		camera.translateGraphics();

		// it helps to add status reports to see what's going on

		// but it gets old quickly

		//System.out.println("Current X: " +Player.x + " \n Current Y: "+ Player.y);

		sprite.draw((int) Player.x, (int) Player.y);
		
		//g.drawString("x: " + (int)Player.x + "y: " +(int)Player.y , Player.x, Player.y - 10);

		g.drawString("Time Left: " + Player.health/1000, camera.cameraX + 10,
				camera.cameraY + 10);
		for (Statue s: winning) {
			if (s.isvisible) {
				s.currentImage.draw(s.x, s.y);
				// draw the hitbox
				//g.draw(w.hitbox);

			}
		}
        }

	public void update(GameContainer gc, StateBasedGame sbg, int delta)

	throws SlickException {
		
		counter += delta;

		Input input = gc.getInput();
		float fdelta = delta * Player.speed;
		Player.setpdelta(fdelta);
		double rightlimit = (grassMap.getWidth() * SIZE) - (SIZE * 0.75);
		float projectedright = Player.x + fdelta + SIZE;
		boolean cangoright = projectedright < rightlimit;
		// there are two types of fixes. A kludge and a hack. This is a kludge.

                if (input.isKeyDown(Input.KEY_UP)) {

			sprite = up;

			float fdsc = (float) (fdelta - (SIZE * .15));

			if (!(isBlocked(Player.x, Player.y - fdelta) || isBlocked((float) (Player.x + SIZE + 1.5), Player.y - fdelta))) {

				sprite.update(delta);

				// The lower the delta the slower the sprite will animate.

				Player.y -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_DOWN)) {

			sprite = down;

			if (!isBlocked(Player.x, Player.y + SIZE*2 + fdelta)

			&& !isBlocked(Player.x + SIZE - 1, Player.y + SIZE*2 + fdelta)) {

				sprite.update(delta);

				Player.y += fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_LEFT)) {

			sprite = left;

			if (!(isBlocked(Player.x - fdelta, Player.y) || isBlocked(Player.x

			- fdelta, Player.y + SIZE - 1))) {

				sprite.update(delta);

				Player.x -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_RIGHT)) {

			sprite = right;

			// the boolean-kludge-implementation

			if (cangoright
					&& (!(isBlocked(Player.x + SIZE + fdelta,

					Player.y) || isBlocked(Player.x + SIZE + fdelta, Player.y
							+ SIZE - 1)))) {

				sprite.update(delta);

				Player.x += fdelta;

			} // else { System.out.println("Right limit reached: " +
				// rightlimit);}

		}

		Player.rect.setLocation(Player.getplayershitboxX(),
				Player.getplayershitboxY());

                for (Statue s : winning) {

			if (Player.rect.intersects(s.hitbox)) {
				//System.out.println("yay");
				if (s.isvisible) {
					s.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
					
				}

			}
		}
		 
		Player.health -= counter/1000;
		if(Player.health <= 0){
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
		}

	}

	public int getID() {

		return 1;

	}

	public void makevisible(){
		}
	
	private boolean isBlocked(float tx, float ty) {

		int xBlock = (int) tx / SIZE;

		int yBlock = (int) ty / SIZE;

		return Blocked.blocked[xBlock][yBlock];

		// this could make a better kludge

	}

}
