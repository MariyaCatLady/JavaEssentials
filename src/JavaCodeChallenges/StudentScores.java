package JavaCodeChallenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentScores {
    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly", "Tony", "Harry", "Amy");
        Map<String, List<Double>> studentScores = Map.of("Polly", List.of(64.5, 90.0, 86.0, 56.0), "Harry", List.of(75.0, 85.5, 35.0, 55.5), "Tony", List.of(95.0, 95.0, 75.0, 70.5), "Molly", List.of(75.5, 85.3, 90.5, 95.5), "Amy", List.of(80.5, 85.5, 90.5, 90.5), "Jack", List.of(50.5, 40.3, 65.7, 85.5));

        System.out.println(getAverageScores(students, studentScores) + "\n");
        printMinScore(getAverageScores(students, studentScores));
        printMaxScore(getAverageScores(students, studentScores));
        //printMaxScore2(getAverageScores(students, studentScores));

    }

    public static Map<String, Double> getAverageScores(List<String> students, Map<String, List<Double>> studentScores) {
        Map<String, Double> averageScores = new HashMap<>();
        for (String student : students) {
            if (studentScores.containsKey(student)) {
                double averageScore = 0.0;
                for (double score : studentScores.get(student)) {
                    averageScore += score;
                }
                averageScore = averageScore / studentScores.get(student).size();
                averageScores.put(student, averageScore);
            }
        }

        return averageScores;
    }

    public static void printMinScore(Map<String, Double> averageScores) {
        String name = "";
        boolean nameWasNotSet = true;
        for (Map.Entry<String, Double> entry : averageScores.entrySet()) {
            if (nameWasNotSet || entry.getValue() < averageScores.get(name)) {
                name = entry.getKey();
                nameWasNotSet = false;
            }
        }

        if (!averageScores.isEmpty()) {
            System.out.printf("%s has the lowest score of %.2f.\n", name, averageScores.get(name));
        }
    }

    public static void printMaxScore(Map<String, Double> averageScores) {
        if (averageScores.isEmpty()) {
            return;
        }

        Map.Entry<String, Double> maxEntry = Map.entry("", 0.0);
        boolean maxEntryNotSet = true;

        for (Map.Entry<String, Double> entry : averageScores.entrySet()) {
            if (maxEntryNotSet || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
                maxEntryNotSet = false;
            }
        }

        System.out.printf("%s has the highest score of %.2f.\n", maxEntry.getKey(), maxEntry.getValue());
    }

    public static void printMaxScore2(Map<String, Double> averageScores) {
        if (averageScores.isEmpty()) {
            return;
        }

        Map.Entry<String, Double> maxEntry = averageScores.entrySet().iterator().next();

        for (Map.Entry<String, Double> entry : averageScores.entrySet()) {
            if (entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        System.out.printf("%s has the highest score of %.2f.\n", maxEntry.getKey(), maxEntry.getValue());
    }
}
