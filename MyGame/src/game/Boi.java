package game;

public class Boi {
	
	private int posX;
	private int posY;
	
	private double exactPosX;
	private double exactPosY;
	
	private Direction boiDirectoin = Direction.STAND;
	
	
	public Boi(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.exactPosX = this.posX;
		this.exactPosY = this.posY;
	}


	public int getPosX() {
		return posX;
	}


	public void moveX(double moveX) {
		exactPosX += moveX;
		this.posX = (int)exactPosX;
	}


	public int getPosY() {
		return posY;
	}


	public void moveY(double moveY) {
		exactPosY += moveY;
		this.posY = (int)exactPosY;
	}


	public Direction getBoiDirectoin() {
		return boiDirectoin;
	}


	public void setBoiDirectoin(Direction boiDirectoin) {
		this.boiDirectoin = boiDirectoin;
	}
	
	

}
