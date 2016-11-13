/**
 * Created by MarcR on 02.11.2016.
 */
public class GameObjects {

    long posX;
    long posY;

    long sizeX;
    long sizeY;

    public GameObjects(long posX, long posY, long sizeX, long sizeY){

        setPosX(posX);
        setPosY(posY);

        setSizeX(sizeX);
        setSizeY(sizeY);

    }

    public long getPosX() {
        return posX;
    }

    public long getPosY() {
        return posY;
    }

    public long getSizeX() {
        return sizeX;
    }

    public long getSizeY() {
        return sizeY;
    }

    public void setPosX(long posX) {
        this.posX = posX;
    }

    public void setPosY(long posY) {
        this.posY = posY;
    }

    public void setSizeX(long sizeX) {
        this.sizeX = sizeX;
    }

    public void setSizeY(long sizeY) {
        this.sizeY = sizeY;
    }

    @Override
    public String toString() {
        return " Position "+getPosX()+"/"+getPosY()+" the size of "+getSizeX()+"/"+getSizeY();
    }
}
