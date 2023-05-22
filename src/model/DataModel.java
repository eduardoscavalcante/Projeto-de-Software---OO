package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {

    private ObservableList<DataEntry> dataList;

    public DataModel() {
        dataList = FXCollections.observableArrayList();
    }

    public ObservableList<DataEntry> getDataList() {
        return dataList;
    }

    public void addData(DataEntry dataEntry) {
        dataList.add(dataEntry);
    }

    public void removeData(DataEntry dataEntry) {
        dataList.remove(dataEntry);
    }
}