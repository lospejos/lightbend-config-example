import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class App {

    public static void main(String[] args) {
        final Config conf = ConfigFactory.load(App.class.getClassLoader()); // see https://github.com/lightbend/config#debugging-your-configuration

        try {
            System.out.println("db_server = " + conf.getString("db_server"));
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }

        try {
            System.out.println("db_url = " + conf.getString("db_url"));
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
    }
}
