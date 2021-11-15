package src.Hippopotamus;

public class Hippopotamus {

    //public car getter non demandé
    public String name;
    //en kilogramme
    private double weight;
    //en centimètre , public car getter non demandé
    public int tusksSize;

    public Hippopotamus(String name, int weight, int tusksSize) {
        this.name = name;
        this.weight = weight;
        this.tusksSize = tusksSize;
    }

    public void swim (){
        weight -=0.300;
    }

    public void eat (){
        weight +=1;
    }

    public String fight(Hippopotamus hippopotamus){
        String gagnant;
        if(hippopotamus.tusksSize > tusksSize)
            gagnant = hippopotamus.name;
        else if (hippopotamus.tusksSize < tusksSize)
            gagnant = name;
        else
            gagnant = "égalité";
        return gagnant;
    }

    //poids arrondi a l'entier supérieur lord de l'affichage.
    @Override
    public String toString(){
        return  "Nom : " + name + ", Weight : " + Math.round(weight) + ", Tusks Size : " + tusksSize;
    }
}
