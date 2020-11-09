package hp;

public class Laptop {
String processor;
float  display_size;
int  ram_capacity;
public Laptop() {
}
public Laptop(String processor, float display_size, int ram_capacity) {
	this.processor = processor;
	this.display_size = display_size;
	this.ram_capacity = ram_capacity;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public float getDisplay_size() {
	return display_size;
}
public void setDisplay_size(float display_size) {
	this.display_size = display_size;
}
public int getRam_capacity() {
	return ram_capacity;
}
public void setRam_capacity(int ram_capacity) {
	this.ram_capacity = ram_capacity;
}
@Override
public String toString() {
	return "Laptop [processor=" + processor + ", display_size=" + display_size + ", ram_capacity=" + ram_capacity + "]";
}

}
