package week3.opgave83foreachverwijderen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class VerwijderenForEach {

        public static void main(String[] args) {
            ArrayList<String> lijst = new ArrayList<String>();

            for (int i = 0; i < 4; i++) {
                lijst.add("element: " + i);
                System.out.println(lijst.get(i));
            }

             /*
             - het lukt niet om alle elementen met deze foreach loop te verwijderen
             - een foreach loop gedraagd zich eigenlijk hetzelfde als een for loop, alleen wordt de index waarde niet getoond
             - om veilig elementen te verwijderen met een foreach loop moet gebruik gemaakt worden van een Iterator
//              */
//            for (String element : lijst) {
//                System.out.println(element);
//                lijst.remove(element);
//            }

            // een voorbeeld van een foreach loop die een Iterator gebruikt, met deze loop worden de elementen wel op een juiste wijze één voor één verwijdert
            System.out.println(lijst);
            for(Iterator<String> i = lijst.iterator(); i.hasNext();) {
                String name = i.next();
                //Do Something
                i.remove();
            }
            System.out.println(lijst);
    }
}
