import io.javalin.Javalin;

public class HelloJavalin {

    public static void main(String[] args) {
        Javalin javalinApp = Javalin.create().start(8989);
        javalinApp.get("/", context -> {
            context.result("Hello Universe from Usman Ali Ansari.");
        });
        javalinApp.get("/creator", context -> {
            context.result("Usman Ali Ansari");
        });
    }

}
