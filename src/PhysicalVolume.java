import java.util.UUID;
import java.util.ArrayList;

public class PhysicalVolume {
    private int size;
    private String name;
    private UUID id;
    public static ArrayList<PhysicalDrive> drive = new ArrayList<PhysicalDrive>;
    private PhysicalDrive pDrive;

    public PhysicalVolume(int size,String name){
        this.size = size;
        this.name = name;
        id = UUID.randomUUID();
        drive.add(pDrive);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public UUID getId() {
        return id;
    }

    public int getpDriveSize() {
        return pDrive.getSize();
    }
}
