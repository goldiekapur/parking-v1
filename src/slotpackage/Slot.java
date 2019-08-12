package slotpackage;

public class Slot implements Comparable<Slot>{
    public int slotId;
    public Slot(int slotId){
        this.slotId = slotId;
    }
    
   
    public int getSlotId() {
        return slotId;
    }

    @Override
    public int compareTo(Slot s) {
        if(this.getSlotId()>s.getSlotId()){
            return 1;
        }
        else{
            return 0;
        }
    }
}