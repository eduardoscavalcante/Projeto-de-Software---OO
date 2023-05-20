package classes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class DataEntry {

    private final SimpleIntegerProperty id;

    public DataEntry(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public abstract StringProperty nomeProperty();

    public abstract StringProperty emailProperty();

    public abstract StringProperty cargoProperty();
}
