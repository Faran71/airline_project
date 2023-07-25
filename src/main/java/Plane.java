public class Plane {

    private int planeId;
    private int range;
    private int capacity;
    Model model;

    public Plane(int planeId, int range, int capacity, Model model){
        this.capacity = capacity;
        this.planeId = planeId;
        this.range = range;
        this.model = model;
    }

    public int getPlaneId() {
        return this.planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Model getModel(){
        return this.model;
    }
}
