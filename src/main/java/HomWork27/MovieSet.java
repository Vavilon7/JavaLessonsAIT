package HomWork27;

import java.util.ArrayList;

public class MovieSet {
    public static void main(String[] args) {
        ArrayList<FilmStudioEmployee> filmStudioEmployees = new ArrayList<>();
        Director director = new Director("lew", " Direktor", 10);
        SoundEngineer soundEngineer = new SoundEngineer("Ivan", "Sound Enginer", 6);
        CameraOperator cameraOperator = new CameraOperator("Maxim", " Kameraman", 15);
        FinancialDirector financialDirector = new FinancialDirector(" Djonson", "Financial Director ", 5);

        filmStudioEmployees.add(director);
        filmStudioEmployees.add(soundEngineer);
        filmStudioEmployees.add(cameraOperator);
        filmStudioEmployees.add(financialDirector);
        for (final FilmStudioEmployee filmStudioEmployee : filmStudioEmployees) {
            filmStudioEmployee.work();
        }
    }
}
