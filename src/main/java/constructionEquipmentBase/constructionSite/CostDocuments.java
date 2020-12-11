package constructionEquipmentBase.constructionSite;

public class CostDocuments {

//    private Invoice invoice = new Invoice();
    private Invoice invoice;
    private PayrollList payrollList = new PayrollList();

    public CostDocuments() {
    }

    public CostDocuments(Invoice invoice, PayrollList payrollList) {
        this.invoice = invoice;
        this.payrollList = payrollList;
    }

    public Invoice getInvoice() {
//        System.out.println("Lista faktur za wybrany miesiąc: \n");
        return invoice;
    }

    public PayrollList getPayrollList() {
        System.out.println("Lista płac za wybrany miesiąc: \n");
        return payrollList;
    }

    @Override
    public String toString() {
        return "CostDocuments{" +
                "invoice=" + invoice +
                ", payrollList=" + payrollList +
                '}';
    }
}
