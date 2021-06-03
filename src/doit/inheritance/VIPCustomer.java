package doit.inheritance;

public class VIPCustomer extends Customer {
    private int agentID; //VIP 고객 상담원 ID
    double saleRatio; // 할인율

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
