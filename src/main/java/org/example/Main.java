package org.example;
import com.exemple.Adresse;
import com.exemple.Etudiant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Utilisez le contexte pour accéder à vos beans

        // Accéder au bean Etudiant
        Etudiant etudiant = context.getBean("etudiantBean", Etudiant.class);

        // Utiliser l'objet Etudiant
        System.out.println("Nom de l'étudiant : " + etudiant.getNom());
        System.out.println("Âge de l'étudiant : " + etudiant.getAge());

        // Accéder à la dépendance Adresse
        Adresse adresse = etudiant.getAdresse();

        // Utiliser l'objet Adresse
        System.out.println("Adresse de l'étudiant : " + adresse.getRue() + ", " + adresse.getVille());
    }
}