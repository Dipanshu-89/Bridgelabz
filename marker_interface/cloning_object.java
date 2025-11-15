package Bridgelabz.marker_interface;
class Prototype implements Cloneable {
    int id;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

