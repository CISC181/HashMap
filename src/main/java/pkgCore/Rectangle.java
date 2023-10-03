package pkgCore;

import java.util.Objects;

public class Rectangle {

	private int Length;
	private int Width;
	public Rectangle(int length, int width) {
		super();
		Length = length;
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.Width, this.Length);
	}
	@Override
	public boolean equals(Object obj) {
		
		Rectangle r = (Rectangle)obj;
		
		if (r.hashCode() == this.hashCode())
			return true;
		
		return false;		
	}
	
	
}
