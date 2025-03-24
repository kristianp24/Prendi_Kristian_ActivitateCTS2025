package ro.cts.clase;

public class ShortTermAgreement extends CarRentalAgreement {
    protected int numberOfMonths;

    public ShortTermAgreement(String carModel, int carYear, String carRentalPlate, String manufacturer, String clientName, String phoneNumber, String clientBirth, int numberOfMonths) {
        super(carModel, carYear, carRentalPlate, manufacturer, clientName, phoneNumber, clientBirth);
        this.numberOfMonths = numberOfMonths;
    }

    public ShortTermAgreement(){
        super();
    }
    @Override
    public CarRentalAgreement copy(String clientName, String clientBirth, String phoneNumber) {
        ShortTermAgreement agreement = new ShortTermAgreement();
        agreement.clientName = clientName;
        agreement.clientBirth = clientBirth;
        agreement.phoneNumber = phoneNumber;
        agreement.carModel = this.carModel;
        agreement.carYear = this.carYear;
        agreement.manufacturer = this.manufacturer;
        agreement.numberOfMonths = this.numberOfMonths;
        return agreement;

    }
}
