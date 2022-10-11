package byr;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

	private TextField buscarText, reemplazarText;
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private CheckBox maymin, regexp, atras, resaltar;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Buscar
		Label buscarLabel = new Label("Buscar:");
		buscarText = new TextField();
		// Reemplazar
		Label reemplazarLabel = new Label("Reemplazar con:");
		reemplazarText = new TextField();
		// checkBox
		maymin = new CheckBox();
		regexp = new CheckBox();
		atras = new CheckBox();
		resaltar = new CheckBox();
		Label mayminLabel = new Label("Mayúsculas y minúsculas");
		Label regexpLabel = new Label("Expresión regular");
		Label atrasLabel = new Label("Buscar hacia atrás");
		Label resaltarLabel = new Label("Resaltar resultados");
		// Botones
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		// Características Botones
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		buscarButton.setDefaultButton(true);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		// Botonera
		GridPane botonera = new GridPane();
		botonera.setPadding(new Insets(5));
		botonera.setHgap(5);
		botonera.setVgap(5);
//		botonera.setGridLinesVisible(true);
		botonera.addRow(0, buscarButton);
		botonera.addRow(1, reemplazarButton);
		botonera.addRow(2, reemplazarTodoButton);
		botonera.addRow(3, cerrarButton);
		botonera.addRow(4, ayudaButton);
		// GridPane checkers
		GridPane checkers = new GridPane();
		checkers.setPadding(new Insets(5));
		checkers.setHgap(5);
		checkers.setVgap(5);
//		checkers.setGridLinesVisible(true);
		checkers.addRow(0, maymin, mayminLabel, atras, atrasLabel);
		checkers.addRow(1, regexp, regexpLabel, resaltar, resaltarLabel);
		// GridPane para lo demás
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
//		root.setGridLinesVisible(true);
		root.addRow(0, buscarLabel, buscarText);
		root.addRow(1, reemplazarLabel, reemplazarText);
		root.addRow(2, new Label(), checkers);
		root.addColumn(2, botonera);
		// Estilo de las columnas
		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints() };
		root.getColumnConstraints().setAll(cols);
		cols[2].setMinWidth(Control.USE_PREF_SIZE);
		// Estilo de las filas
		RowConstraints [] rows = new RowConstraints[3];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = new RowConstraints();
		}
		// Otros estilos
		GridPane.setRowSpan(botonera, 3);
		// Ventana
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(new Scene(root, 515, 208));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
