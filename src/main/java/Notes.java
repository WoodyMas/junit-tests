public class Notes {

    public static void main(String[] args) {
        System.out.println("\nIn JavaFX, FXML is used to define the user interface of an application, while a controller class is used to define the behavior of the user interface. The controller class is associated with the FXML file through the \"fx:controller\" attribute, which specifies the fully-qualified class name of the controller. When the FXML file is loaded by the FXMLLoader, an instance of the controller" +
                "" +
                "When the FXML file is loaded by the FXMLLoader, an instance of the controller is created and its \"initialize\" method is called. This method can be used to initialize the controller's state and perform any necessary setup before the user interface is displayed.\n" +
                "\n" +
                "The controller can also define methods that are invoked by the user interface elements defined in the FXML file. These methods are specified in the FXML file using the \"onAction\" attribute (for buttons and other input controls) or the \"fx:id\" attribute (for other user interface elements).\n" +
                "\n" +
                "In this way, the controller acts as an intermediary between the user interface defined in the FXML file and the application logic. It allows the user interface to interact with the application logic in a clear and maintainable way.");


    }
}
