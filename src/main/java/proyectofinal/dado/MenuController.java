package proyectofinal.dado;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import proyectofinal.clases.Dado;
import proyectofinal.clases.Tipos;


public class MenuController {
	
	private static Tipos tipoDado;
	private static int cantidadDeExcel = 1;
	private static List<Dado> dadosTotales = new ArrayList<>();
	
	@FXML
	private ImageView imagenDelPrograma;
	
	
	
	@FXML
	private void generarD6() throws IOException{
		tipoDado = Tipos.D6;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD4() throws IOException{
		tipoDado = Tipos.D4;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD8() throws IOException{
		tipoDado = Tipos.D8;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD10() throws IOException{
		tipoDado = Tipos.D10;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD12() throws IOException{
		tipoDado = Tipos.D12;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void generarD20() throws IOException{
		tipoDado = Tipos.D20;
		App.setRoot("lanzamiento");
		
		
	}
	
	@FXML
	private void salir() throws IOException {
		System.exit(0);
	}
	
	
	
	@FXML
	private void bolsaDeDados() throws IOException{
		App.setRoot("bolsaDeDados");
	}
	
	@FXML
	private void generarExcel()throws IOException{
		Workbook excel = new XSSFWorkbook();
		Sheet hoja = excel.createSheet("Hoja1");
		/*List<Dado> dadosOrdenados = dadosTotales.stream()
		.sorted((d1, d2) -> d1.getTipo().compareTo(d2.getTipo()))
		.collect(Collectors.toList());*/
		
		if (dadosTotales.isEmpty()) {
            Alert alerta = new Alert(AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setHeaderText(null);
            alerta.setContentText("No hay datos para generar el Excel.");
            alerta.showAndWait();
            excel.close();
            return;
        }
		
		
		Row filaEncabezado = hoja.createRow(0);
		filaEncabezado.createCell(0).setCellValue("Tipo de Dado");
        filaEncabezado.createCell(1).setCellValue("Contador de Tiradas");
        /*
        for(int i = 0; i < Tipos.D20.getNumMax(); i++) {
        	Dado dado = dadosTotales.get(i);
        	Row fila = hoja.createRow(i + 1);
        	filaEncabezado.createCell(i+2).setCellValue(i);
        	
        	fila.createCell(3).setCellValue(dado.getCantidadDeLanzamientosAlamacenados().get(i));
        }*/
		
        for (int i = 0; i < dadosTotales.size(); i++) {
            Dado dado = dadosTotales.get(i);
            Row fila = hoja.createRow(i + 1);
            fila.createCell(0).setCellValue(dado.getTipo().getNombreSimple());
            fila.createCell(1).setCellValue(dado.getContadorDeTiradas());
        }
		
		

        try (FileOutputStream fileOut = new FileOutputStream("Lanzamientos"+ cantidadDeExcel +".xlsx")) {
            excel.write(fileOut);
            Alert crearExcel = new Alert(AlertType.INFORMATION);
			crearExcel.setTitle("Archivo creado con exito");
			crearExcel.setHeaderText(null);
			crearExcel.setContentText("Se ha generado un nuevo excel correctamente");
			crearExcel.showAndWait();
            cantidadDeExcel++;
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	

	public static Tipos getTipoDado() {
		return tipoDado;
	}

	public static List<Dado> getDadosTotales() {
		return dadosTotales;
	}
	
}
