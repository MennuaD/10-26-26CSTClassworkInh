
public class rectangle  {
    private int width, length, area;

    public rectangle(int length, int width){
        this.length = length;
        this.width = width;
        area = 0;
        calcArea();
    }


    public int getLength(){
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calcArea(){
        this.area = this.getLength() * this.getLength();
    }

    public int getArea() {
        return this.area;
    }
}
