import java.util.UUID;
import java.util.ArrayList;

public class PhysicalVolume extends Space{
    private int size;
    private UUID id;
    private VolumeGroup volumeGroup;
    private PhysicalDrive hardDrive;
    public boolean isDrive;

    public PhysicalVolume(int size,String name,PhysicalDrive hardDrive){
        super(name);
        this.size = size;
        isDrive = false;
        this.hardDrive = hardDrive;
    }


    public UUID getId() {
        return id;
    }

    public PhysicalDrive getHardDrive() {
        return hardDrive;
    }
    public VolumeGroup getVolumeGroup(){
        return volumeGroup;
    }

    public int getSize() {
        return size;
    }

    public void setVolumeGroup(VolumeGroup volumeGroup)
    {
        isDrive = true;
        this.volumeGroup = volumeGroup;
    }
    public boolean isDrive() {
        return isDrive;
    }


}
