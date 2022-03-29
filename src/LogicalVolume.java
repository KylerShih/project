public class LogicalVolume extends Space{
    private int size;
    private VolumeGroup volumeGroup;

    public LogicalVolume(String name, int size, VolumeGroup VG) {
        super(name);
        this.size = size;
        this.volumeGroup = VG;
    }

    public int getSize() {
        return size;
    }

    public VolumeGroup getVG() {
        return volumeGroup;
    }
}