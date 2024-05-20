package consultation;

public class SalaryUtil {
    public double getNettoSalary(double bruttoSalary) {
        if (bruttoSalary < 2000) {
            return bruttoSalary;
        }
        if (bruttoSalary > 2000 && bruttoSalary < 3500) {
            return bruttoSalary - (bruttoSalary * 5) / 100;
        }
        if (bruttoSalary > 3500 && bruttoSalary < 5000) {
            return bruttoSalary - (bruttoSalary * 10) / 100;
        }
        return bruttoSalary - (bruttoSalary * 15) / 100;

    }
}