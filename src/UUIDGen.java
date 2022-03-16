
import java.util.UUID;
public class UUIDGen{
        private int size;
        private int name;
        private UUID id;

        public UUIDGen(int size,int name){
                this.size = size;
                this.name = name;
                id = UUID.randomUUID();
        }

        public int getName() {
                return name;
        }

        public int getSize() {
                return size;
        }

        public UUID getId() {
                return id;
        }


}

