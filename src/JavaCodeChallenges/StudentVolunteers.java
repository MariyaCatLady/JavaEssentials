package JavaCodeChallenges;


import java.util.*;

public class StudentVolunteers {

    static List<String> findWithIncompleteEvents(List<String> students, Map<String, List<String>> attendeesMapping) {
        Map<String, Integer> myMap = new HashMap<>();

        for (String student : students) {
            myMap.put(student, 0);
        }

        for (Map.Entry<String, List<String>> entry : attendeesMapping.entrySet()) {
            List<String> attendees = entry.getValue();
            for (String student : attendees) {
                if (myMap.containsKey(student)) {
                    int numberOfEvents = myMap.get(student);
                    myMap.put(student, numberOfEvents + 1);
                }
            }
        }

        List<String> studentsWithIncompleteEvents = new ArrayList<>();
        for (String student : myMap.keySet()) {
            int numberOfAttendances = myMap.get(student);
            if (numberOfAttendances < 2) {
                studentsWithIncompleteEvents.add(student);
            }
        }

        return studentsWithIncompleteEvents;
    }

    public static void main(String[] args) {

        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of(
                "Farmer's Market", List.of("Sally", "Molly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));
        System.out.println(findWithIncompleteEvents(students, attendeesMapping));
    }
}
