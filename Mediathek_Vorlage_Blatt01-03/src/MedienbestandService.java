import java.util.List;

/**
 * Ein Medienbestand-Service ist ein Service, der alle zur Verfügung stehenden
 * Medien enthält. Diese können in den Bestand eingepflegt, gelöscht und
 * verändert werden. Zu einem bestimmten Titel kann es mehrere Medien-Objekte im
 * Bestand geben. So kann z.B. die gleiche CD mehrfach vorhanden sein.
 * 
 * MedienbestandService ist ein ObservableService, als solcher bietet er die
 * Möglichkeit über Änderungen am Medienbestand zu informieren. Beobachter
 * müssen das Interface ServiceObserver implementieren.
 * 
 * @author SE2-Team
 * @version SoSe 2019
 */
public interface MedienbestandService extends ObservableService
{

    /**
     * Entfernt ein Medium aus dem Medienbestand, z.B. wenn es verloren gegangen
     * ist oder so veraltet, dass es von den Mediathek-Kunden nicht mehr
     * nachgefragt wird.
     * 
     * @param medium Ein zu entfernendes Medium
     * 
     */
    void entferneMedium(Medium medium);

    /**
     * Gibt Auskunft, ob ein Medium im Medienbestand enthalten ist.
     * 
     * @param medium Ein Medium
     * @return true, wenn Medium im Medienbestand enthalten ist, andernfalls
     *         false.
     *         
     */
    boolean enthaeltMedium(Medium medium);

    /**
     * Fügt ein weiteres, neu angeschafftes Medium in den Bestand ein. Ist ein
     * Medium mehrfach angeschafft worden, so kann es auch mehrfach eingepflegt
     * werden. Jedes Exemplar im Bestand repräsentiert ein real existierendes
     * Medium.
     * 
     * @param neuesMedium Ein neues Medium
     */
    void fuegeMediumEin(Medium neuesMedium);

    /**
     * Liefert alle vorhandenen Medien.
     * 
     * @return Eine Kopie der Liste mit allen vorhandenen Medien.
     */
    List<Medium> getMedien();

    /**
     * Informiert diesen Service darüber, dass Medien von einem Werkzeug
     * geändert wurden. Eine Implementation wird daraufhin wahrscheinlich alle
     * ServiceBeobachter darüber informieren.
     */
    void medienWurdenGeaendert();

}
