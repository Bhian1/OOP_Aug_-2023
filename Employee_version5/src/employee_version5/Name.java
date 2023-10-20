package employee_version5;

import java.util.HashMap;
import java.util.Map;

public class Name {
    private String title;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;

    private static final Map<String, String> titleMap = new HashMap<>();
    static {
        titleMap.put("Mister", "Mr.");
        titleMap.put("Missus", "Mrs.");
        titleMap.put("Doctor", "Dr.");
        titleMap.put("Miss", "Ms.");
    }

    public Name() {
    }

    public Name(String title, String firstName, String lastName, String middleName) {
        this.title = titleMap.getOrDefault(title, title);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Name(String title, String firstName, String lastName, String middleName, String suffix) {
        this.title = titleMap.getOrDefault(title, title);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        if(middleName != null && !middleName.isEmpty()) {
            return middleName.substring(0, 1).toUpperCase();
        } else {
            return "";
        }
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String displayName() {
        StringBuilder displayName = new StringBuilder();

        // if the title exists, append it
        if(title != null && !title.isEmpty()) {
            displayName.append(title).append(" ");
        }

        // append first name
        displayName.append(firstName);

        // do the middle name
        String middleInitial = getMiddleName();
        if(!middleInitial.isEmpty()) {
            displayName.append(" ").append(middleInitial).append(".");
        }

        // append last name
        displayName.append(" ").append(lastName);

        // if the suffix exists, append it as well
        if(suffix != null && !suffix.isEmpty()) {
            displayName.append(" ").append(suffix);
        }
        return displayName.toString();
    }

    @Override
    public String toString() {
        return title + firstName + middleName + lastName + suffix;
    }
}
