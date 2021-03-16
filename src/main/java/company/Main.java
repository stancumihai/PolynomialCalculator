package company;

import company.controller.PolyCalcController;
import company.model.PolyCalcModel;
import company.validator.PolynomValidator;
import company.view.PolyCalcView;

public class Main {

    public static void main(String[] args) {

        PolyCalcModel polyCalcModel = new PolyCalcModel();
        PolyCalcView polyCalcView = new PolyCalcView();
        PolynomValidator polynomValidator = new PolynomValidator();
        PolyCalcController polyCalcController = new PolyCalcController(polyCalcView, polynomValidator, polyCalcModel);
        polyCalcView.setVisible(true);
    }
}
