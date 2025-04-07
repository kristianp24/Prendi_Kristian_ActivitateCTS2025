package ro.cts.clase;

public abstract class RoomConfiguration {
    protected String bedType;
    protected boolean hasPrivateBathroom;
    protected boolean hasAC;
    protected boolean hasTV;
    protected boolean hasWIFI;
    protected int floorNumber;

    public RoomConfiguration(String bedType, boolean hasPrivateBathroom, boolean hasAC, boolean hasTV, boolean hasWIFI, int floorNumber) {
        this.bedType = bedType;
        this.hasPrivateBathroom = hasPrivateBathroom;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
        this.hasWIFI = hasWIFI;
        if (this.floorNumber > 10){
            this.floorNumber = 3;
        }
        else{
            this.floorNumber = floorNumber;
        }

    }

    public RoomConfiguration() {
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public abstract RoomConfiguration copiaza();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RoomConfiguration{");
        sb.append("bedType='").append(bedType).append('\'');
        sb.append(", hasPrivateBathroom=").append(hasPrivateBathroom);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append(", hasWIFI=").append(hasWIFI);
        sb.append(", floorNumber=").append(floorNumber);
        sb.append('}');
        return sb.toString();
    }
}
