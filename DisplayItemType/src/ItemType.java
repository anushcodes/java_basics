public class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public double getDeposit() {
        return deposit;
    }
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    
    public void display(){
        System.out.println("Item type details\nName : "+this.name);
        System.out.printf("CostPerDay : %.2f\n",this.costPerDay);
        System.out.printf("Deposit : %.2f\n",this.deposit);
    }
    
}
