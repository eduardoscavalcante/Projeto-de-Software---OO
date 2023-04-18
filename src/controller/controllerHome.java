package controller;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
//imports para gerar relatório

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class controllerHome {

    @FXML
    private Button botaoRedo;

    @FXML
    private Button botaoRelatorio;

    @FXML
    private Button botaoProduto;

    @FXML
    private Button botaoMovimentacao;

    @FXML
    private Button botaoSair;
    
    @FXML
    private Button botaoFuncionario;

    @FXML
    void exitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void telaProduto(ActionEvent event) {
        App.changeScreen("produto");
    }

    @FXML
    void funcionario(ActionEvent event) {
        App.changeScreen("funcionario");
    }

    @FXML
    void movBotao(ActionEvent event) {
        App.changeScreen("movimentacao");
    }

    
    @FXML
    void telaRedo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gerenciamento");
        alert.setHeaderText("Em reforma!");
        alert.show();
    }

    // Gerar PDF de Relatório
    @FXML
    void telaRelatorio(ActionEvent event) {

        Document document = new Document();
        try {

            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Ronaldo/Documents/arquivos-gerados/RelatorioSGP.pdf"));
            document.open();

            // adicionando um parágrafo no documento
            document.add(new Paragraph("Gerando PDF - BIG TESTE"));
  }
        catch(DocumentException de) {
            System.err.println(de.getMessage());
        }
        catch(IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        document.close();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatório Geral");
        alert.setHeaderText("Relatório Gerado em PDF!");
        alert.show();
    }
}
