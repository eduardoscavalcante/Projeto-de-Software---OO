package model;

import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class DataEntryFuncionarios extends DataEntry {
    private final StringProperty nome;
    private final StringProperty email;
    private final StringProperty cargo;

    public DataEntryFuncionarios(int id, String nome, String email, String cargo) {
        super(id);
        this.nome = new SimpleStringProperty(nome);
        this.email = new SimpleStringProperty(email);
        this.cargo = new SimpleStringProperty(cargo);
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public StringProperty emailProperty() {
        return email;
    }

    public StringProperty cargoProperty() {
        return cargo;
    }
}
