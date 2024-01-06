package lst.tpjava.Phase2;


import lst.tpjava.Phase2.DataAccess.DepartementDAO;
import lst.tpjava.Phase2.controllers.DepartementsController;
import lst.tpjava.Phase2.services.DepartementServices;
import lst.tpjava.models.Enseignant;
import lst.tpjava.services.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public static boolean isNull(Object ob) {
        return ob == null;
    }

    public static int getIntInput(String... msg) {
        Scanner scanner = new Scanner(System.in);

        String message = "Enter an integer: ";
        if (msg.length > 0) {
            message = msg[0];
        }

        System.out.print(message);
        return scanner.nextInt();
    }

    public static String getStringInput(String... msg) {
        Scanner scanner = new Scanner(System.in);

        String message = "Enter a text: ";
        if (msg.length > 0) {
            message = msg[0];
        }

        System.out.print(message);
        return scanner.nextLine();
    }

    public static void showDepartementMenu(DepartementsController departementsController) {
        while (true) {
            System.out.println("-------------------------[ Departement Management ]---------------------------");
            System.out.println("1. Add Departement");
            System.out.println("2. Show Departements");
            System.out.println("3. Update/Delete Departement");
            System.out.println("4. Delete Departement");
            System.out.println("0. Exit");

            int option = getIntInput("Select an option: ");
            switch (option) {
                case 1:
                    departementsController.createDepartement();
                    break;
                case 2:
                    departementsController.showDepartements();
                    break;
                case 3:
                    departementsController.editDepartement();
                    break;
                case 4:
                    departementsController.destroyDepartement();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
//        try {Class.forName("com.mysql.cj.jdbc.Driver");
//            // Establish a connection to your MySQL database
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
//
//            // Initialize DAOs, Services, and Controllers
//            DepartementDAO departementDAO = new DepartementDAO(connection);
//            DepartementServices departementServices = new DepartementServices(departementDAO);
//            DepartementsController departementsController = new DepartementsController(departementServices);
//
//            // Show the Departement menu
//            Enseignant enseignant = new Enseignant();
//            enseignant.setNom("Amine");
//            enseignant.setPrenom("Ben Charif");
//            enseignant.setEmail("test@gmail.com");
//            enseignant.setGrade("PES");
//            enseignant.setId(DB.getEnsId());
//            DB.enseignants.add(enseignant);
//            showDepartementMenu(departementsController);
//
//            // Close the database connection when done
//            connection.close();
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//

    }
}