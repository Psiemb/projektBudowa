package constructionEquipmentBase.constructionSite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InvoiceMain {

    public static void main(String[] args) {

        List<Invoice> invoices = new ArrayList<>();
        Invoice invoice = new Invoice("A", 300);
        Invoice invoice2 = new Invoice("A", 100);

        invoices.add(invoice);
        invoices.add(invoice2);
        invoices.add(new Invoice("A", 100));
        invoices.add(new Invoice("A", 100));
        invoices.add(new Invoice("B", 650));
        invoices.add(new Invoice("B", 650));
        invoices.add(new Invoice("B", 650));
        invoices.add(new Invoice("C", 650));
        invoices.add(new Invoice("C", 650));
        invoices.add(new Invoice("C", 650));
        invoices.add(new Invoice("C", 650));
        invoices.add(new Invoice("C", 650));
        invoices.add(new Invoice("C", 650));


        Double sumaDostawcyA = invoices.stream()
                .filter(inv -> inv.getDostawca().equals("A"))
//                .map(inv -> inv.getInvoiceCost())
                .map(Invoice::getValue)
//                .reduce(0.0, (a, b) -> a + b);
                .reduce(0.0, Double::sum);

        Optional<Double> max = invoices.stream()
                .filter(inv -> inv.getDostawca().equals("A"))
//                .map(inv -> inv.getInvoiceCost())
                .map(Invoice::getValue)
//                .reduce(0.0, (a, b) -> a + b);
                //        .max(Double::compareTo);
                .max((o1, o2) -> o1.compareTo(o2));

        Optional<Double> min = invoices.stream()
                .filter(inv -> inv.getDostawca().equals("B"))
                .map(Invoice::getValue)
                .min(Double::compareTo);

        System.out.println("Suma faktur dostawcy A: " +  sumaDostawcyA);
        System.out.println("Faktura z najwyższym kosztem wśród faktur od dostawcy A: " + max);
        System.out.println("Faktura z najniższym kosztem wśród faktur od dostawcy B: " + min);

    }
}
