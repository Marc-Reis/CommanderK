/**
 * Created by MarcR on 02.11.2016.
 */
public class Aliens extends GameObjects {

    private String name;
    private int health;

    public Aliens(String name, int health, long posX, long posY, long sizeX, long sizeY) {
        super( posX,  posY,  sizeX,  sizeY);
        setHealth(health);
        setName(name);

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "An Alien "+getName() +"@"+ super.toString() +  " has " + getHealth();
    }
}
