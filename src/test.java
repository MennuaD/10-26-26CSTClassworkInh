
public class test {
    public static void main(String[] args){
        Cuboid one = new Cuboid();
        System.out.println(one.getHeight());
        one.setDimensions(5, 5, 5);
        System.out.println(one.getHeight());
        System.out.println(one.get2DArea());
    }
}
