import org.junit.Test;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class Geometry {

    private List<Normalizer.Form> forms = new ArrayList<>();

    public void addForm(Normalizer.Form form) {
        forms.add(form);
    }

    public double calculateCombinedArea() {
        double combinedArea = 0;
        for (Normalizer.Form form : forms) {
            combinedArea += form.calculateArea();
        }
        return combinedArea;
    }
}
