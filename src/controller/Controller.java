package controller;

import java.util.HashMap;
import java.util.List;
import model.AnalysisString;
import view.View;

public class Controller {
    private AnalysisString model;
    private View view;

    public Controller(AnalysisString model, View view) {
        this.model = model;
        this.view = view;
    }

    public void analyzeString(String input) {
         HashMap<String, List<Integer>> numberResult = model.getNumber(input);
        HashMap<String, StringBuilder> characterResult = model.getCharacter(input);

        view.display(numberResult);
        view.display(characterResult);
    }
}
