package cts.clase;

public class LongTermAgreement extends CarRentalAgreement{

    public LongTermAgreement(){
        super();
    }

    public LongTermAgreement(String carModel, int carYear, String carRentalPlate, String manufacturer, String clientName, String phoneNumber, String clientBirth) {
        super(carModel, carYear, carRentalPlate, manufacturer, clientName, phoneNumber, clientBirth);
    }

    @Override
    public CarRentalAgreement copy(String clientName, String clientBirth, String phoneNumber) {
        LongTermAgreement agreement = new LongTermAgreement();
        agreement.clientName = clientName;
        agreement.clientBirth = clientBirth;
        agreement.phoneNumber = phoneNumber;
        agreement.carModel = this.carModel;
        agreement.carYear = this.carYear;
        agreement.manufacturer = this.manufacturer;
        return agreement;
    }
}
