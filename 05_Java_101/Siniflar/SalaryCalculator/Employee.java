package SalaryCalculator;

public class Employee {
    String nameOfEmployee;
    int salaryOfEmployee, workHoursOfEmployee, hiringYearOfEmployee, bonus = 0;
    double tax = 0.0, rateOfRise;

    public Employee(String nameOfEmployee, int workHoursOfEmployee, int salaryOfEmployee, int hiringYearOfEmployee){
        this.nameOfEmployee=nameOfEmployee;
        this.workHoursOfEmployee = workHoursOfEmployee;
        this.salaryOfEmployee=salaryOfEmployee;
        this.hiringYearOfEmployee=hiringYearOfEmployee;
    }

    public double tax(int salary){
        if (salary < 1000){
            tax = 0;
        }
        else{
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus(int workHoursOfEmployee){
        if (workHoursOfEmployee - 40 > 0){
            final int BONUS_AMOUNT_PER_HOUR = 30;
            bonus = (workHoursOfEmployee - 40) * BONUS_AMOUNT_PER_HOUR;
        }
        return bonus;
    }

    public double salaryRaise(int hiringYearOfEmployee){
        final int CURRENT_YEAR = 2022;
        if (CURRENT_YEAR - hiringYearOfEmployee < 10){
            rateOfRise = .05;
        } else if (CURRENT_YEAR - hiringYearOfEmployee >= 10 && CURRENT_YEAR - hiringYearOfEmployee <= 20){
            rateOfRise = .1;
        } else{
            rateOfRise = .15;
        }
        return salaryOfEmployee * rateOfRise;
    }

    public void toStrings(){
        System.out.println("Adı: " + nameOfEmployee);
        System.out.println("Maaşı: " + salaryOfEmployee);
        System.out.println("Çalışma Saati: " + workHoursOfEmployee);
        System.out.println("Vergi: " + tax(salaryOfEmployee));
        System.out.println("Bonus: " + bonus(workHoursOfEmployee));
        System.out.println("Maaş artışı: " + salaryRaise(hiringYearOfEmployee));
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (salaryOfEmployee + bonus - tax));
        System.out.println("Zamlı Maaş: " + (salaryOfEmployee + salaryOfEmployee*rateOfRise));
    }
}