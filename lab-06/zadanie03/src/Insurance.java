abstract class Insurance {
    public String type;
    public double monthlyPrice;

    Insurance(String type) {
        this.type = type;
    };

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    abstract void setCost();
    abstract void display();
}
