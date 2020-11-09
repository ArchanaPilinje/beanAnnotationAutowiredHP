package hp;

import org.springframework.beans.factory.annotation.Autowired;

public class HP {
@Autowired
private Printer p;

@Autowired
private Laptop l;


@Autowired
private Display d;


public HP(Printer p, Laptop l, Display d) {
	this.p = p;
	this.l = l;
	this.d = d;
}
public HP() {
}
public Printer getP() {
	return p;
}
public void setP(Printer p) {
	this.p = p;
}
public Laptop getL() {
	return l;
}
public void setL(Laptop l) {
	this.l = l;
}
public Display getD() {
	return d;
}
public void setD(Display d) {
	this.d = d;
}
@Override
public String toString() {
	return "HP [Printer=" + p + ", Laptop=" + l + ", Display=" + d + "]";
}


}
