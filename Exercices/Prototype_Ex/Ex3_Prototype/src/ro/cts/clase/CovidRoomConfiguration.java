package ro.cts.clase;

public class CovidRoomConfiguration extends RoomConfiguration{


    public CovidRoomConfiguration(String bedType, boolean hasPrivateBathroom, boolean hasAC, boolean hasTV, boolean hasWIFI, int floorNumber) {
        super(bedType, hasPrivateBathroom, hasAC, hasTV, hasWIFI, floorNumber);
    }

    public CovidRoomConfiguration() {
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    @Override
    public RoomConfiguration copiaza() {
        RoomConfiguration roomConfiguration = new CovidRoomConfiguration();
        roomConfiguration.floorNumber = this.floorNumber;
        roomConfiguration.bedType = this.bedType;
        roomConfiguration.hasAC = this.hasAC;
        roomConfiguration.hasPrivateBathroom = this.hasPrivateBathroom;
        roomConfiguration.hasWIFI = this.hasWIFI;
        roomConfiguration.hasTV = this.hasTV;
        return roomConfiguration;
    }
}
