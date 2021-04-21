package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.database.Dao;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public TextArea textInfo;
    public TextField idStudent;
    public TextField name;
    public TextField lastName;
    public TextField group;
    public TextField total;
    public TextField avg_user;
    public TextField rank;
    public TextField russ;
    public TextField math;
    public TextField history;
    public TextField literature;
    public TextField chemistry;
    public TextField language;
    public TextField biology;
    public TextField ecology;
    public TextField geography;
    public ListView<String> listStudent;

    private Dao dao;
    private ArrayList<String> students;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dao = Dao.getInstance();
        students = new ArrayList<>();
    }

    public void printInfo(ActionEvent actionEvent) {

    }

    public void removeUser(ActionEvent actionEvent) {
    }

    public void reset(ActionEvent actionEvent) {
    }

    public void addUser(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void actionList(MouseEvent mouseEvent) {
        String id = listStudent.getFocusModel().getFocusedItem();
    }
}
