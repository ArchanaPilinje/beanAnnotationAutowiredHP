package hp;

public class Display {
private int resolution;
private float display_size;
public Display() {
}
public Display(int resolution, float display_size) {
	this.resolution = resolution;
	this.display_size = display_size;
}
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}
public float getDisplay_size() {
	return display_size;
}
public void setDisplay_size(float display_size) {
	this.display_size = display_size;
}
@Override
public String toString() {
	return "Display [resolution=" + resolution + ", display_size=" + display_size + "]";
}

}
