import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost:3306/ventes";
    static final String USER = "root";
    static final String PASS = "gr007,,";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String requete = null;
        ResultSet resultSet = null;
        int noArticle = 0;
        String description = null;
        Double prixUnitaire = null;
        int quantiteEnStock = 0;
        try {

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connexion établie avec succes vers la bd...");

            //Delete la donnée
            System.out.println("Requête supprimée effectuée...");
            requete = "DELETE FROM article WHERE noArticle = 100";
            preparedStatement = connection.prepareStatement(requete);
            preparedStatement.executeUpdate(requete);

            //Insert une donnée dans table Article
            System.out.println("Requête Insert effectuée...");
            requete = "INSERT INTO Article (noArticle, description, prixUnitaire, quantiteEnStock) VALUES  ('100', 'Cle USB', 30, 20) ";
            preparedStatement = connection.prepareStatement(requete);
            preparedStatement.executeUpdate(requete);


            //Update cette dernière donnée
            System.out.println("Requête Update effectuée");
            requete = "UPDATE article SET quantiteEnStock = 50 WHERE noArticle = 100";
            preparedStatement = connection.prepareStatement(requete);
            preparedStatement.executeUpdate(requete);


            //Select * from Article
            System.out.println("Exécuter un select: de la table Article");
            requete = "SELECT * FROM Article";
            preparedStatement = connection.prepareStatement(requete);
            resultSet = preparedStatement.executeQuery();

            //Extraire les donnée et les afficher
            while (resultSet.next()) {
                noArticle = resultSet.getInt("noArticle");
                //description
                description = resultSet.getString("description");
                prixUnitaire = resultSet.getDouble("prixUnitaire");
                quantiteEnStock = resultSet.getInt("quantiteEnStock");

                //Afficher les valeurs
                System.out.print("noArticle: " + noArticle);
                System.out.print(", description: " + description);
                System.out.print(", prixUnitaire: " + prixUnitaire);
                System.out.println(", quantiteEnStock: " + quantiteEnStock);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("On ferme tout ici");
            resultSet.close();
            preparedStatement.close();
            connection.close();

        }
    }
}
