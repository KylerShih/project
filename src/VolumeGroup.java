import java.util.ArrayList;
import java.util.UUID;

public class VolumeGroup {
    private int size;
    private String name;
    public static ArrayList<PhysicalVolume> physicalVolumesArr;
    public static ArrayList<LogicalVolume> logicalVolumesArr;
    private UUID id;


    public VolumeGroup(int size,String name){
        this.size = size;
        this.name = name;
        id = UUID.randomUUID();
    }
    public int getSize(){
        int s = 0;
        for(int i =0;i<physicalVolumesArr.size();i++){
            s += physicalVolumesArr.get(i).getSize();
        }
        return s;
    }

    public int getFreeSpace(){
        int s = 0;
        for(int i =0;i<physicalVolumesArr.size();i++){
            s += physicalVolumesArr.get(i).getSize();
        }
        return s - logicalVolumesArr.get(0).getSize();
    }
    public void addPhysicalVolume(PhysicalVolume pv)
    {
        physicalVolumesArr.add(pv);
    }

    public void addLogicalVolume(LogicalVolume lv)
    {
        logicalVolumesArr.add(lv);
    }

    public int getAvailableSpace()
    {
        int use = 0;
        size = getSize();
        for(int n = 0; n < logicalVolumesArr.size(); n++)
        {
            use += logicalVolumesArr.get(n).getSize();
        }
        return size - use;
    }


    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
    public boolean hasLogicalVolume(){
        if(getLogicalVolumesArr().size()!=0){
            return true;
        }
        return false;
    }

    public static ArrayList<LogicalVolume> getLogicalVolumesArr() {
        return logicalVolumesArr;
    }

    public static ArrayList<PhysicalVolume> getPhysicalVolumesArr() {
        return physicalVolumesArr;
    }
}
