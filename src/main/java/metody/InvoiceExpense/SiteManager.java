package metody.InvoiceExpense;

public class SiteManager {
    public String verifyInvoice(Invoice invoiceToBeVeryfied){
        if (invoiceToBeVeryfied.isCorrect()) {
            return "Faktura błędna!!!";
        }
        else {
            invoiceToBeVeryfied.setCorrect(true);
            return "Faktura złożona prawidłowo";
        }
    }
}
