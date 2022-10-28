public class plate {

    private int size;
    private String material;

    plate () {}

    plate(int size, String material) {

        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }

    public void platePrinter (int a) {

        switch(a) {
            case 1:
                System.out.println("   (__)");
                break;
            case 2:
                System.out.println("  (____)");
                break;
            case 3:
                System.out.println(" (______)");
                break;
            case 4:
                System.out.println("(________)");
                break;
        }
    }
}
