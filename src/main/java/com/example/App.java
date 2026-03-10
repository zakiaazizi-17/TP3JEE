package com.example;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import presentation.Presentation2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Presentation2.class);

        // Récupérer le bean métier
        IMetier metier = context.getBean(IMetier.class);

        // Afficher le résultat
        System.out.println("Résultat: " + metier.calcul());

        // Fermer le contexte
        context.close();
    }
    }

