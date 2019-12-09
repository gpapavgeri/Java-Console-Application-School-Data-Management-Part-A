
package privateschool;

import java.time.LocalDateTime;

/**
 *
 * @author Georgia_Papavgeri
 */
public class Assignment {
    
    private String title;
    private String description;
    private LocalDateTime subDateTime;
    private double oralMark;
    private double totalMark;

    public Assignment(String title, String description, LocalDateTime subDateTime, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDateTime subDateTime) {
        this.subDateTime = subDateTime;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment: " + title + " / Description: " + description + " / Submission Date/Time: " + subDateTime + "}\n";
    }

    
}
