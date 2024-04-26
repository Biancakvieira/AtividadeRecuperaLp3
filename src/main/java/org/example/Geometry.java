package org.example;

import java.util.ArrayList;
import java.util.List;

public class Geometry {

    private final List<Form> forms = new ArrayList<>();

    public void addForm(Form form) {
        forms.add(form);
    }

    public double calculateCombinedArea() {
        double combinedArea = 0;
        for (Form form : forms) {
            combinedArea += form.calculateArea();
        }
        return combinedArea;
    }
    public double calculateCombinedPerimeter() {
        double combinedPerimeter = 0;
        for (Form form : forms) {
            combinedPerimeter += form.calculatePerimeter();
        }
        return combinedPerimeter;
    }
}
