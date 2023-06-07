import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CalculadoraFx extends Application{

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Calculadora JavaFX!");

        GridPane layout = new GridPane();

        int buttonCount = 1;
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){

                Button botao = new Button(Integer.toString(buttonCount));
                botao.setMinSize(50,50);

                botao.setOnAction(e -> {
                    System.out.println("Botão " + botao.getText() + " clicado!");
                });

                layout.add(botao, col, row);

                buttonCount++;
            }
        }

        Scene scene = new Scene(layout); 

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args){ 
        launch(args);

    }
    
}
