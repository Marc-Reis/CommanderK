/**
 * Created by MarcR on 02.11.2016.
 */
public class Rocks extends GameObjects{

    private String type;

    public Rocks(String type, long posX, long posY, long sizeX, long sizeY){
        super( posX,  posY,  sizeX,  sizeY);
        setType(type);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "A Rock@" + super.toString() + " of "+getType();
    }
}
