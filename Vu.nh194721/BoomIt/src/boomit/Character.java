package boomit;

import java.awt.Graphics;
import java.awt.Image;

public class Character {
	private int x, y;
	private int chara;
	private long t = 0;
	private int dir = 1;
	private int phase = 1;
	
	public static final int STAY = 0;
	public static final int GO_UP = -1;
	public static final int GO_DOWN = 1;
	public static final int GO_LEFT = -2;
	public static final int GO_RIGHT = 2;
	private int vector;
	
	public void setVector(int v) {
		this.vector = v;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}
	
	public Character(int x, int y, int character) {
		this.x = x;
		this.y = y;
		chara = character;
	}
	

	public void update() {
		if(System.currentTimeMillis() - t > 50) {
			if(vector == Character.GO_UP) {
				if (y == 1) {
					
				}
				else if (y == 3) {
					y = y -2;
				}
				else if (y == 2) {
					y = y - 1;
				}
				else if(x>=2 && x + 2 <=GameScreen.length - 1) {
					if(GameScreen.bg[x-1][y-3]==1 || GameScreen.bg[x][y-3]==1 || GameScreen.bg[x+1][y-3]==1) {
						
					}
					else if(GameScreen.bg[x-2][y-3] == 1) {
						y = y - 1;
						x = x + 1;
					}
					else if(GameScreen.bg[x+2][y-3] == 1) {
						y = y - 1;
						x = x - 1;
					}
					else if(GameScreen.bg[x-2][y-4] == 1 || GameScreen.bg[x-1][y-4] == 1 || GameScreen.bg[x][y-4] == 1 || GameScreen.bg[x+1][y-4] == 1 || GameScreen.bg[x+2][y-4] == 1){
						y = y - 1;
					}
					else {
						y = y - 2;
					}
				}
				else if(x == 1 || x + 1 == GameScreen.length - 1) {
					if(GameScreen.bg[x][y-4]== 1 ) {
						y = y - 1;
					}
					else if(GameScreen.bg[x][y-3]== 1 ) {
						
					}
					else {
						y = y - 2;
					}
				}
				
				
				
				/*
				if (y - 2 > 0) y = y - 2;
				else if (y - 1 > 0) y = y - 1;
				*/
			}
			if(vector == Character.GO_DOWN) {
				if (y + 1 == GameScreen.length - 1) {
					
				}
				else if (y + 2 == GameScreen.length - 1) {
					y = y + 1;
				}
				else if (y + 3 == GameScreen.length - 1) {
					y = y + 2;
				}
				else if (x>=2 && x + 2 <=GameScreen.length - 1) {
					if(GameScreen.bg[x-1][y+3]==1 || GameScreen.bg[x][y+3]==1 || GameScreen.bg[x+1][y+3]==1) {
						
					}
					else if(GameScreen.bg[x-2][y+3] == 1) {
						y = y + 1;
						x = x + 1;
					}
					else if(GameScreen.bg[x+2][y+3] == 1) {
						y = y + 1;
						x = x - 1;
					}
					else if(GameScreen.bg[x-2][y+4] == 1 || GameScreen.bg[x-1][y+4] == 1 || GameScreen.bg[x][y+4] == 1 || GameScreen.bg[x+1][y+4] == 1 || GameScreen.bg[x+2][y+4] == 1){
						y = y + 1;
					}
					else {
						y = y + 2;
					}
				}
				else if(x == 1 || x + 1 == GameScreen.length - 1) {
					if(GameScreen.bg[x][y+4]== 1 ) {
						y = y + 1;
					}
					else if(GameScreen.bg[x][y+3]== 1 ) {
						
					}
					else {
						y = y + 2;
					}
				}
				
				
				/*
				if (y + 2 < GameScreen.length - 1) y = y + 2;
				else if (y + 1 < GameScreen.length - 1) y = y + 1;
				*/
			}
			if(vector == Character.GO_LEFT) {
				if (x == 1) {
					
				}
				else if (x == 3) {
					x = x -2;
				}
				else if (x == 2) {
					x = x - 1;
				}
				else if(y>=2 && y + 2 <=GameScreen.length - 1) {
					if(GameScreen.bg[x-3][y-1]==1 || GameScreen.bg[x-3][y]==1 || GameScreen.bg[x-3][y+1]==1) {
						
					}
					else if(GameScreen.bg[x-3][y-2] == 1) {
						x = x - 1;
						y = y + 1;
					}
					else if(GameScreen.bg[x-3][y+2] == 1) {
						x = x - 1;
						y = y - 1;
					}
					else if(GameScreen.bg[x-4][y-2] == 1 || GameScreen.bg[x-4][y-1] == 1 || GameScreen.bg[x-4][y] == 1 || GameScreen.bg[x-4][y+1] == 1 || GameScreen.bg[x-4][y+2] == 1){
						x = x - 1;
					}
					else {
						x = x - 2;
					}
				}
				else if(y == 1 || y + 1 == GameScreen.length - 1) {
					if(GameScreen.bg[x-4][y]== 1 ) {
						x = x - 1;
					}
					else if(GameScreen.bg[x-3][y]== 1 ) {
						
					}
					else {
						x = x - 2;
					}
				}
				
				/*
				if (x - 2 > 0) x = x - 2;
				else if (x - 1 > 0) x = x - 1;
				*/
			}
			if(vector == Character.GO_RIGHT) {
				if (x + 1 == GameScreen.length - 1) {
					
				}
				else if (x + 2 == GameScreen.length - 1) {
					x = x + 1;
				}
				else if (x + 3 == GameScreen.length - 1) {
					x = x + 2;
				}
				else if (y>=2 && y + 2 <=GameScreen.length - 1) {
					if(GameScreen.bg[x+3][y-1]==1 || GameScreen.bg[x+3][y]==1 || GameScreen.bg[x+3][y+1]==1) {
						
					}
					else if(GameScreen.bg[x+3][y-2] == 1) {
						x = x + 1;
						y = y + 1;
					}
					else if(GameScreen.bg[x+3][y+2] == 1) {
						x = x + 1;
						y = y - 1;
					}
					else if(GameScreen.bg[x+4][y-2] == 1 || GameScreen.bg[x+4][y-1] == 1 || GameScreen.bg[x+4][y] == 1 || GameScreen.bg[x+4][y+1] == 1 || GameScreen.bg[x+4][y+2] == 1){
						x = x + 1;
					}
					else {
						x = x + 2;
					}
				}
				else if(y == 1 || y + 1 == GameScreen.length - 1) {
					if(GameScreen.bg[x+4][y] == 1 ) {
						x = x + 1;
					}
					else if(GameScreen.bg[x+3][y] == 1 ) {
						
					}
					else {
						x = x + 2;
					}
				}
				/*
				if(x + 2 < GameScreen.length - 1) x = x + 2;
				else if(x + 1 < GameScreen.length - 1) x = x + 1;
				*/
				
			}
			t = System.currentTimeMillis();
		}
	}
	
	public void drawChar(Graphics g) {
		switch(chara) {
		case 1:
			g.drawImage(CharSprite_1(this.vector,this.dir, this.phase), (x-1) * GameScreen.block, (y-1) * GameScreen.block-16, 30, 44, null);
			break;
		case 2:
			g.drawImage(CharSprite_2(this.vector,this.dir, this.phase), (x-1) * GameScreen.block, (y-1) * GameScreen.block-16, 30, 44, null);
			break;
		case 3:
			g.drawImage(CharSprite_3(this.vector,this.dir, this.phase), (x-1) * GameScreen.block, (y-1) * GameScreen.block-16, 30, 44, null);
			break;
		case 4:
			g.drawImage(CharSprite_4(this.vector,this.dir, this.phase), (x-1) * GameScreen.block, (y-1) * GameScreen.block -16, 30, 44, null);
			break;
		}
	}
	
	private Image CharSprite_1(int vector, int dir, int phase) {
		if(dir == Character.GO_UP) {
			if(vector == Character.STAY)
				return Data.imageChar1_UP_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar1_UP_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar1_UP_1;
				}
				else{
					PhaseCounter();
					return Data.imageChar1_UP_3;
				}
			}
		}
		
		if(dir == Character.GO_DOWN) {
			if(vector == Character.STAY)
				return Data.imageChar1_DOWN_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar1_DOWN_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar1_DOWN_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar1_DOWN_3;
				}
			}
		}
		
		if(dir == Character.GO_LEFT) {
			if(vector == Character.STAY)
				return Data.imageChar1_LEFT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar1_LEFT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar1_LEFT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar1_LEFT_3;
				}
				
			}
		}
		
		if(dir == Character.GO_RIGHT) {
			if(vector == Character.STAY)
				return Data.imageChar1_RIGHT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar1_RIGHT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar1_RIGHT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar1_RIGHT_3;
				}
			}
		}
		return null;
	}
	
	private Image CharSprite_2(int vector, int dir, int phase) {
		if(dir == Character.GO_UP) {
			if(vector == Character.STAY)
				return Data.imageChar2_UP_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar2_UP_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar2_UP_1;
				}
				else{
					PhaseCounter();
					return Data.imageChar2_UP_3;
				}
			}
		}
		
		if(dir == Character.GO_DOWN) {
			if(vector == Character.STAY)
				return Data.imageChar2_DOWN_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar2_DOWN_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar2_DOWN_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar2_DOWN_3;
				}
			}
		}
		
		if(dir == Character.GO_LEFT) {
			if(vector == Character.STAY)
				return Data.imageChar2_LEFT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar2_LEFT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar2_LEFT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar2_LEFT_3;
				}
				
			}
		}
		
		if(dir == Character.GO_RIGHT) {
			if(vector == Character.STAY)
				return Data.imageChar2_RIGHT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar2_RIGHT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar2_RIGHT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar2_RIGHT_3;
				}
			}
		}
		return null;
	}
	
	private Image CharSprite_3(int vector, int dir, int phase) {
		if(dir == Character.GO_UP) {
			if(vector == Character.STAY)
				return Data.imageChar3_UP_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar3_UP_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar3_UP_1;
				}
				else{
					PhaseCounter();
					return Data.imageChar3_UP_3;
				}
			}
		}
		
		if(dir == Character.GO_DOWN) {
			if(vector == Character.STAY)
				return Data.imageChar3_DOWN_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar3_DOWN_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar3_DOWN_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar3_DOWN_3;
				}
			}
		}
		
		if(dir == Character.GO_LEFT) {
			if(vector == Character.STAY)
				return Data.imageChar3_LEFT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar3_LEFT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar3_LEFT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar3_LEFT_3;
				}
				
			}
		}
		
		if(dir == Character.GO_RIGHT) {
			if(vector == Character.STAY)
				return Data.imageChar3_RIGHT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar3_RIGHT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar3_RIGHT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar3_RIGHT_3;
				}
			}
		}
		return null;
	}
	
	private Image CharSprite_4(int vector, int dir, int phase) {
		if(dir == Character.GO_UP) {
			if(vector == Character.STAY)
				return Data.imageChar4_UP_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar4_UP_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar4_UP_1;
				}
				else{
					PhaseCounter();
					return Data.imageChar4_UP_3;
				}
			}
		}
		
		if(dir == Character.GO_DOWN) {
			if(vector == Character.STAY)
				return Data.imageChar4_DOWN_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar4_DOWN_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar4_DOWN_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar4_DOWN_3;
				}
			}
		}
		
		if(dir == Character.GO_LEFT) {
			if(vector == Character.STAY)
				return Data.imageChar4_LEFT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar4_LEFT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar4_LEFT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar4_LEFT_3;
				}
				
			}
		}
		
		if(dir == Character.GO_RIGHT) {
			if(vector == Character.STAY)
				return Data.imageChar4_RIGHT_1;
			else {
				if (phase == 2) {
					PhaseCounter();
					return Data.imageChar4_RIGHT_2;
				}
				else if(phase == 1 || phase == 3) {
					PhaseCounter();
					return Data.imageChar4_RIGHT_1;
				}
				else {
					PhaseCounter();
					return Data.imageChar4_RIGHT_3;
				}
			}
		}
		return null;
	}
	
	private void PhaseCounter(){
		if(phase == 1 || phase == 2 || phase == 3) phase++;
		else if (phase == 4) phase = 1;
	}
	
	
}
