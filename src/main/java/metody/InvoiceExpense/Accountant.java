package metody.InvoiceExpense;

public class Accountant {
    public String accountInvoice(Invoice invoiceToBeAccounted){
        if (invoiceToBeAccounted.isCorrect()) {
            return "Faktura nie zaksięgowana";
        }
        else {
            invoiceToBeAccounted.setCorrect(true);
            return "Faktura zaksięgowana";
        }
    }

}
