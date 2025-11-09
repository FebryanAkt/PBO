public class Tester1 {
    public static void main(String[] args) {
        PermanenEmployee pEMP = new PermanenEmployee("Dedik", 500);
        InternshipEmployee iEMP = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        Employee e;
        Payable p;

        e = pEMP;
        e = iEMP;
        p = pEMP;
        p = eBill;
    }
}
