package firstQuestion;

public class CarLoan implements ILoan {
    private double intersetRate;

    public CarLoan(double intersetRate) {
        this.intersetRate = intersetRate;
    }

    public double getIntersetRate() {
        return intersetRate;
    }

    public void setIntersetRate(double intersetRate) {
        this.intersetRate = intersetRate;
    }

    @Override
    public double calculatePayableAmount(double principleAmount, int noOfYears) {
        double payableAmount = principleAmount+ ((principleAmount * intersetRate * noOfYears) / 100);
        return payableAmount;
    }
}
