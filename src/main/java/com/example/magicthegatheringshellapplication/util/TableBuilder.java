package com.example.magicthegatheringshellapplication.util;

import com.example.magicthegatheringshellapplication.dto.SetObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@Service
public class TableBuilder {
    private List<String[]> rows;

    public TableBuilder() {
        this.rows = new ArrayList<>();
    }

    public TableBuilder createTableFromMap(Map<Integer, String> names) {
        names.forEach((key, value) -> addRow(String.valueOf(key), value));
        return this;
    }

    public TableBuilder buildTableForSets(List<SetObject> setObjects, String sortBy, String reverseSort) {
        String sort = sortBy.replace(",", " ");
        Comparator<SetObject> comparator;
        switch (sort) {
            case "name" -> comparator = Comparator.comparing(SetObject::getName);
            case "code" -> comparator = Comparator.comparing(SetObject::getCode);
            case "card_count" -> comparator = Comparator.comparing(SetObject::getCard_count);
            case "released_at" -> comparator = Comparator.comparing(SetObject::getReleased_at);
            default -> comparator = Comparator.comparing(SetObject::getName);
        }

        if (reverseSort.equals("true")) {
            comparator = comparator.reversed();
        }
        setObjects.sort(comparator);

        setObjects.forEach(
                set -> addRow(set.getName() + " / " + set.getCode(),
                        set.getCard_count() + "      date: " + set.getReleased_at()));
        return this;
    }

    public TableBuilder addRow(String... columns) {
        rows.add(columns);
        return this;
    }

    public void print() {
        // Calculate the maximum width for each column
        int[] maxWidths = new int[rows.get(0).length];
        for (String[] row : rows) {
            for (int i = 0; i < row.length; i++) {
                maxWidths[i] = Math.max(maxWidths[i], row[i].length());
            }
        }

        // Print top border
        printHorizontalBorder(maxWidths);

        for (String[] row : rows) {
            System.out.print("|"); // Left border
            for (int i = 0; i < row.length; i++) {
                // Print each cell with proper padding
                System.out.print(padRight(row[i], maxWidths[i] + 2)); // Adding 2 for border characters
                System.out.print("|"); // Right border
            }
            System.out.println();
            // Print horizontal border between rows
            printHorizontalBorder(maxWidths);
        }

        rows.clear();
    }

    private void printHorizontalBorder(int[] columnWidths) {
        System.out.print("+"); // Left border
        for (int width : columnWidths) {
            for (int i = 0; i < width + 2; i++) { // Adding 2 for border characters
                System.out.print("-");
            }
            System.out.print("+"); // Horizontal border between columns
        }
        System.out.println(); // Right border
    }

    private static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}
