package src;

import src.CerclePoint.Circle;
import src.CerclePoint.Point;
import src.Hippopotamus.Hippopotamus;

public class Main {

    public static void main (String[] args){

        Hippopotamus hippopotamus1 = new Hippopotamus("hippopotamus1", 1500, 80);
        Hippopotamus hippopotamus2 = new Hippopotamus("hippopotamus2", 1700, 60);

        System.out.println("Resultat combat : " + hippopotamus1.fight(hippopotamus2));

        int semaines=3;
        int soirs=7;
        int heures=15;

        // Boucle cycle de vie
        for (int sem = 0; sem <semaines; sem++){
            for (int soir = 0; soir < soirs; soir ++){
                for (int heure = 0; heure < heures; heure++){
                    for(int i=0; i<2; i++){
                        hippopotamus1.eat();
                    }
                    for(int j=0; j<3; j++){
                        hippopotamus1.swim();
                    }
                }
                // pas besoin d'appeler toString sur l'hippopotame car java comprends qu'il faut appeler la méthode toString qu'on a redéfini par défaut
                System.out.println("Semaine : " + (sem+1) + ", Soir : " + (soir+1) + " " + hippopotamus1 );
            }
        }

        Point point = new Point(1,2);

        int radius = 3;

        Circle circle = new Circle(point, radius);

        System.out.println(circle);

        Point point1 = new Point(1,3);

        System.out.println(circle.containsPoint(point1));

        point1.setY(5);

        System.out.println(circle.containsPoint(point1));
    }
}
