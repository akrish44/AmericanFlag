import java.awt.*;


public class Rectangle {
	private Point topLeft;
	private int width, height;
	private Color color;


	public Rectangle(Point topLeft, int width, int height, Color color) {
		setTopLeft(topLeft);
		setWidth(width);
		setHeight(height);
		setColor(color);
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public void setWidth(int width) {
		if (width > 0) {
		this.width = width;
		}
	}

	public void setHeight(int height) {
		if (height > 0) {
		this.height = height;
		}
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics g){
		g.setColor(this.color);
		g.fillRect(this.topLeft.x(), this.topLeft.y(), this.width, this.height);
	}
}
