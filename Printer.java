package hp;

public class Printer {
private int resolution;
private int speed;
private String color;
public Printer() {
}
public Printer(int resolution, int speed, String color) {
	this.resolution = resolution;
	this.speed = speed;
	this.color = color;
}
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Printer [resolution=" + resolution + ", speed=" + speed + ", color=" + color + "]";
}

}
