import java.util.UUID;

public class LogicalVolume {
    private int size;
    private String name;
    private UUID id;

    public LogicalVolume(int size, String name){
        this.size = size;
        this.name = name;
        id = UUID.randomUUID();
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
