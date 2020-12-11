package constructionEquipmentBase;

import constructionEquipmentBase.constructionSite.ConstructionSite;
import constructionEquipmentBase.constructionSite.CostDocuments;
import constructionEquipmentBase.constructionSite.Invoice;

import java.util.Objects;
import java.util.Optional;

public class OptionalBudowaMain {

    public static void main(String[] args) {

        ConstructionSite constructionSite = new ConstructionSite();

        CostDocuments costDocuments = constructionSite.getCostDocuments();

        Invoice invFirst = costDocuments.getInvoice();

        if(Objects.isNull(invFirst)) {
            // nic nie robimy
        }
        else {
            System.out.println(invFirst);

        }

        String wynik = Optional.ofNullable(constructionSite)
                .map(e -> e.getCostDocuments())
                .map(e -> e.getInvoice())
                .map(e -> e.getDostawca())
//                .orElse("Wiosenna");
        .orElseGet(() -> returnSomething(constructionSite));

        if(Objects.isNull(wynik)){
            //nic nie robimy bo WIEMY, że poleci NPE
        }
        else {
            System.out.println(wynik);
        }
    }

    private static String returnSomething(ConstructionSite constructionSite) {
        return constructionSite.getName();
    }
}
