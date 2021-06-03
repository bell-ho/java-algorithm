package doit.inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade; //하위 클래스에게 변수접근을 허용
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVBR";   //기본등급
        bonusRatio = 0.01;  //보너스 포인트 기본 적립 비율
        System.out.println("Customer() 생성자 호출");
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}
