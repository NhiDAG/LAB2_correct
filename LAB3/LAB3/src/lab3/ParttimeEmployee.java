/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author ASUS
 */
public class ParttimeEmployee extends Employee {
    private double discountRate;

    public ParttimeEmployee(int ID, String fullName, int age, String birthday, int workDay, double discountRate) {
        super(ID, fullName, age, birthday,workDay, discountRate);
        this.discountRate = discountRate;
    }
    
    public ParttimeEmployee(){
    } 
    
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    

    @Override
    public long calculateSalary(){
        return (long) (getWorkDay()*1000000*discountRate);
    }
    
    @Override
    public String toString() {
        return "ParttimeEmployee:\n" +super.toString();
    }
}
