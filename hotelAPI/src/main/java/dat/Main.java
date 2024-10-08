package dat;

import dat.config.ApplicationConfig;

        public class Main {

            public static void main(String[] args) {

                ApplicationConfig.startServer(7777);
            }
        }


      /*  // Initialize Javalin
        Javalin app = Javalin
                .create(ApplicationConfig::configuration)
                .start(7777);

        // Error handling for 404 Not Found (missing routes and missing resources)
        app.error(404, ctx -> ctx.status(404).result("404 Not Found. The requested resource or endpoint could not be found"));

        // Exception handling for IllegalStateException
        app.exception(IllegalStateException.class, (e, ctx) -> {
            ctx.status(400); // Bad Request
            ctx.result(e.getMessage());
        });

    }*/
