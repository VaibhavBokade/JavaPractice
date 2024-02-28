package firstQuestion;

public class HomeLoan implements ILoan {
    private double interestRate;

    public HomeLoan(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculatePayableAmount(double principleAmount, int noOfYears) {
        double payableAmount = principleAmount+((principleAmount * interestRate * noOfYears) / 100);
        return payableAmount;
    }

}
