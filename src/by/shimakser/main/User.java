package by.shimakser.main;

public class User {

    private static int totalUsers = 0;
    final int ID = totalUsers++;

    private String name;
    private String lastname;
    private String patronymic;
    private String adress;
    private long creditCardNumber;
    private double debit; // поступление
    private double credit; //расход
    private double urbanTimeCalls;
    private double longDistanceCalls;

    public User(String lastname, String name, String patronymic, String adress,
                long creditCardNumber, double debet, double credit, double urbanTimeCalls, double longDistanceCalls) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCardNumber = creditCardNumber;
        this.debit = debet;
        this.credit = credit;
        this.longDistanceCalls = longDistanceCalls;
        this.urbanTimeCalls = urbanTimeCalls;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getUrbanTimeCalls() {
        return urbanTimeCalls;
    }

    public double getLongDistanceCalls() {
        return longDistanceCalls;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\t Name: %s %s %s.", ID + 1, lastname.toUpperCase(), name.toUpperCase(), patronymic.toUpperCase()) + "\n"
                + String.format("\t\t\tAdress: %s; CreditCardNumber: %d; Debit:%10.2f; Credit:%10.2f.", adress, creditCardNumber, debit, credit) + "\n"
                + "\t\t\tUrban Time Calls: " + urbanTimeCalls + "sec; Long Distance Calls: " + longDistanceCalls + "sec";
    }
}