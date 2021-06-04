package doit.inheritance;

public class VIPCustomer extends Customer {
    private int agentID; //VIP 고객 상담원 ID
    double saleRatio; // 할인율

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int , String) 생성자 호출");
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    @Override
    public String toString() {
        return "VIPCustomer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusRatio=" + bonusRatio +
                '}';
    }

    public int getAgentID() {
        return agentID;
    }
}
