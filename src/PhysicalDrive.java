import java.util.UUID;

public class PhysicalDrive extends PhysicalVolume      {
    private UUID id;
    public PhysicalDrive(int size, String name{
        super(size,name);
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return super.getId();
    }
}
