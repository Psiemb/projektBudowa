package metody.InvoiceExpense;

import java.sql.SQLOutput;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        SiteManager siteM = new SiteManager();
        Accountant acc = new Accountant();

        System.out.println("Czy faktura właściwa"+ siteM.verifyInvoice(inv));
        System.out.println("Faktura właściwa?"+ inv.isCorrect());
        siteM.verifyInvoice(inv);
        System.out.println(inv.isCorrect());

        System.out.println(acc.accountInvoice(inv));

        System.out.println(inv.isCorrect());
        acc.accountInvoice(inv);
        System.out.println(inv.isCorrect());


    }
}
