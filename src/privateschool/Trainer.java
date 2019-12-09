
package privateschool;


/**
 *
 * @author Georgia_Papavgeri
 */
public class Trainer {
    
    private String trFirstName;
    private String trLastName;
    private String trSubject;

    public Trainer(String trFirstName, String trLastName, String trSubject) {
        this.trFirstName = trFirstName;
        this.trLastName = trLastName;
        this.trSubject = trSubject;
    }

    public String getTrFirstName() {
        return trFirstName;
    }

    public void setTrFirstName(String trFirstName) {
        this.trFirstName = trFirstName;
    }

    public String getTrLastName() {
        return trLastName;
    }

    public void setTrLastName(String trLastName) {
        this.trLastName = trLastName;
    }

    public String getTrSubject() {
        return trSubject;
    }

    public void setTrSubject(String trSubject) {
        this.trSubject = trSubject;
    }
    
    @Override
    public String toString() {
        return "Trainer's Name: " + trFirstName + " " + trLastName + " / Subject: " + trSubject + "}\n";
    }
    
    
}
