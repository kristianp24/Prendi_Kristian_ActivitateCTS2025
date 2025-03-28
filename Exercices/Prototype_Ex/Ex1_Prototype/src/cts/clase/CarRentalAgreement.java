package cts.clase;

public abstract class CarRentalAgreement {
     protected String carModel;
     protected int carYear;
     protected String carRentalPlate;
     protected String manufacturer;

     protected String clientName;
     protected String phoneNumber;
     protected String clientBirth;

    public CarRentalAgreement() {

    }

    public CarRentalAgreement(String carModel, int carYear, String carRentalPlate, String manufacturer, String clientName, String phoneNumber, String clientBirth) {
        this.carModel = carModel;
        this.carYear = carYear;
        this.carRentalPlate = carRentalPlate;
        this.manufacturer = manufacturer;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.clientBirth = clientBirth;
    }

    public abstract CarRentalAgreement copy(String clientName, String clientBirth, String phoneNumber);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarRentalAgreement{");
        sb.append("carModel='").append(carModel).append('\'');
        sb.append(", carYear=").append(carYear);
        sb.append(", carRentalPlate='").append(carRentalPlate).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", clientName='").append(clientName).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", clientBirth='").append(clientBirth).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
