
public class Cuboid extends rectangle{

    private int height;
    private int area;

    public Cuboid(){
        super(1, 1);
        this.height = 1;
        this.area = 0;
        super.calcArea();
        this.calcArea();

    }

    public Cuboid(int length){
        super(length, 1);
        this.height = 1;
        this.area = 0;
        super.calcArea();
        this.calcArea();

    }

    public Cuboid(int length, int width){
        super(length, width);
        this.height = 1;
        this.area = 0;
        super.calcArea();
        this.calcArea();

    }

    public Cuboid(int length, int width, int height){
        super(length, width);
        this.height = height;
        this.area = 0;
        super.calcArea();
        this.calcArea();

    }

    @Override
    public int getLength(){
        return super.getLength();
    }

    @Override
    public int getWidth(){
        return super.getWidth();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDimensions(){
        super.setLength(1);
        super.setWidth(1);
        this.setHeight(1);
    }

    public void setDimensions(int length){
        super.setLength(length);
        super.setWidth(1);
        this.setHeight(1);
    }

    public void setDimensions(int length, int width){
        super.setLength(length);
        super.setWidth(width);
        this.setHeight(1);
    }

    public void setDimensions(int length, int width, int height){
        super.setLength(length);
        super.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public void calcArea(){
        this.area = super.getLength() * super.getWidth() * getHeight();
    }

    @Override
    public int getArea(){
        return this.area;
    }

    public int get3DArea(){
        return this.getArea();
    }

    public int get2DArea(){
        return super.getArea();
    }

}
