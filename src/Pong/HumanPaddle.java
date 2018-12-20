package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class HumanPaddle implements Paddle{
	double y, yVel;
	boolean upAccel, downAccel;
	int player, x;
	final double GRAVITY = 0.94;
	
	public HumanPaddle(int player) {
		upAccel = false; downAccel = false;
		y = 210; yVel = 0;
		if(player == 1) {
			x = 20;
		} else {
			x = 660;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, (int)y, 20, 80);
		
	}

	public void move() {
		if (upAccel) {
			yVel +=1;
		} 
		else if(downAccel) {
			yVel -=1;
		}
		else if(!upAccel && !downAccel) {
			yVel *= GRAVITY;
		}
		y-=(int) yVel;
		
	}
	
	public void setUpAccel(boolean input) {
		upAccel = input;
	}
	
	public void setDownAccel(boolean input) {
		downAccel = input;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return (int)y;
	}

}
