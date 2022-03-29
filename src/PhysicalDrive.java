public class PhysicalDrive {
    private String name;
    private int size;

    public PhysicalDrive(String n, int s)
    {
        name = n;
        size = s;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}