package com.proyecto.cinema;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import org.kordamp.bootstrapfx.BootstrapFX;
import org.kordamp.ikonli.javafx.FontIcon;

import static javafx.scene.layout.BackgroundPosition.CENTER;

public class Login {
    final BorderPane root;

    public Login() {
        root = new BorderPane();

        root.setBackground(new Background(new BackgroundImage(new Image("C:\\Users\\Blossom\\IdeaProjects\\Cinema\\src\\main\\resources\\com\\proyecto\\cinema\\bg-Login.png"), null, null, CENTER, null)));

        VBox form = new VBox();
        form.setAlignment(Pos.CENTER);

        Rectangle rectangle = new Rectangle(350, 500);
        rectangle.setFill(Color.WHITESMOKE);
        rectangle.setStyle("-fx-arc-height: 40; -fx-arc-width: 40");
        rectangle.setOpacity(0.8);

        FontIcon closeIcon = new FontIcon("mdi2c-close");
        closeIcon.setIconSize(30);
        closeIcon.setTranslateX(150);
        closeIcon.setTranslateY(40);

        ImageView logo = new ImageView("C:\\Users\\Blossom\\IdeaProjects\\Cinema\\src\\main\\resources\\com\\proyecto\\cinema\\logo.png");
        logo.setFitWidth(150);
        logo.setFitHeight(150);

        Label principalLabel = new Label("Iniciar sesión");
        principalLabel.setStyle("-fx-font-size: 25; -fx-font-weight: bold");
        principalLabel.setTranslateY(-30);

        Label secondaryLabel = new Label("Ingresar correo y contraseña para iniciar sesión");
        secondaryLabel.setStyle("-fx-font-size: 13");
        secondaryLabel.setTranslateY(-45);

        Label emailLabel = new Label("Correo electrónico");
        emailLabel.setTranslateX(-100);
        TextField emailField = new TextField();
        emailField.setStyle("-fx-background-radius: 15px;");
        emailField.setPromptText("Ingresar correo electrónico");
        emailField.setMaxWidth(300);
        emailField.setTranslateY(-10);
        Label passwordLabel = new Label("Contraseña");
        passwordLabel.setTranslateX(-120);
        PasswordField passwordField = new PasswordField();
        passwordField.setStyle("-fx-background-radius: 15px;");
        passwordField.setMaxWidth(300);
        passwordField.setPromptText("Ingresar contraseña");
        passwordField.setTranslateY(-10);

        Line divider = new Line();
        divider.setStrokeWidth(3);
        divider.setStartX(50);
        divider.setEndX(350);

        Hyperlink signIn = new Hyperlink("¿Aún no tienes una cuenta? Regístrate aquí");

        Button buttonLogIn = new Button("Iniciar Sesión");
        buttonLogIn.getStyleClass().addAll("btn-warning");
        buttonLogIn.setMaxWidth(300);
        form.setSpacing(15);
        form.setTranslateY(-35);
        form.getChildren().addAll(closeIcon,logo, principalLabel, secondaryLabel, emailLabel, emailField, passwordLabel, passwordField,divider,buttonLogIn, signIn );

        StackPane both = new StackPane();

        both.getChildren().addAll(rectangle, form);

        root.setCenter(both);

        String bootstrapUrl = BootstrapFX.bootstrapFXStylesheet();
        root.getStylesheets().addAll(bootstrapUrl);
    }

    public BorderPane getRoot() {
        return root;
    }
}