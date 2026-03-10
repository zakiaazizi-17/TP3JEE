package presentation;

import metier.IMetier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"dao","metier","config"})
public class Presentation2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();

        // choisir un profil

        //ctx.getEnvironment().setActiveProfiles("dev");
        //ctx.getEnvironment().setActiveProfiles("prod");
       // ctx.getEnvironment().setActiveProfiles("file");
        ctx.getEnvironment().setActiveProfiles("api");
        ctx.register(Presentation2.class);
        ctx.refresh();

        IMetier metier = ctx.getBean(IMetier.class);

        System.out.println("Résultat = " + metier.calcul());

        ctx.close();
    }
}