package istiklal.edu.tr;

import java.util.ArrayList;
import java.util.Date;

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    @Override
    public String toString() {
        return "Loan: Tutar = $" + loanAmount + ", Yıllık Faiz = %" + annualInterestRate + ", Yıl = " + numberOfYears;
    }
}

class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: Yarıçap = " + radius + ", Alan = " + String.format("%.2f", getArea());
    }
}

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan(3.5, 5, 25000)); 
        list.add(new Date());               
        list.add("Java Programlama");       

        System.out.println("--- Listede Yer Alan Elemanlar ---\n");
        for (Object element : list) {
            System.out.println(element.toString()); 
            System.out.println("----------------------------------------");
        }
    }
}