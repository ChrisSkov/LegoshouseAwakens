package FunctionLayer;
/**
 @author Chris Skov
 */
public class house {

    private int height,width,length,totalBricks, userID;

    public house(int height, int width, int length, int totalBricks, int userID) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.totalBricks = totalBricks;
        this.userID = userID;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTotalBricks() {
        return totalBricks;
    }

    public void setTotalBricks(int totalBricks) {
        this.totalBricks = totalBricks;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

   
    
    
    
}
