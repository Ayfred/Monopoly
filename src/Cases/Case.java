package Cases;
import java.util.ArrayList;
import Monopoly_Sur_Console.Joueur;
import Monopoly_Sur_Console.Plateau;
import java.util.Scanner;

/**
 *
 * @author maxime.mines-ales
 */
public abstract class Case {
    
    private int prix;
    private String nom;
    private int id;
    private boolean reponseQuestion = false;
    private int[] loyers = new int[6];
    private ArrayList<Integer> idFamille = new ArrayList();
    
    /**
     *
     * @param nom
     * @param id
     * @param prix
     */
    public Case(String nom, int id, int prix) {
	this.nom = nom;
        this.id = id;
        this.prix = prix;
    }
    
    /**
     *
     * @return
     */
    public int getPrix() {
        return prix;
    }

    /**
     *
     * @return
     */
    public int[] getLoyers() {
        return loyers;
    }

    /**
     *
     * @param loyers
     */
    public void setLoyers(int[] loyers) {
        this.loyers = loyers;
    }

    /**
     *
     * @return
     */
    public String getNom() {
	return nom;
    }

    /**
     *
     * @return
     */
    public int getId(){
	return id;
    }

    /**
     *
     * @return
     */
    public ArrayList<Integer> getIdFamille() {
        return idFamille;
    }

    /**
     *
     * @param id
     */
    public void addIdFamille(int id) {
        this.idFamille.add(id);
    }

    void setId(int id){
        this.id = id;
    }

    /**
     *
     * @return
     */
    public boolean getReponseQuestion() {
        return reponseQuestion;
    }
    
    /**
     *
     * @param b
     */
    public void setReponseQuestion(boolean b){
        reponseQuestion = b;
    }
    
    /**
     *
     * @param s
     */
    public void question(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        System.out.println("entrez y si oui, n sinon : ");
        String reponse = sc.nextLine();
        reponseQuestion = reponse == "y";
    }
	
    /**
     *
     * @param joueur
     * @param plateau
     */
    public abstract void actionCase(Joueur joueur, Plateau plateau);
    
    /**
     *
     * @param valeur
     */
    public abstract void setValeurDes(int valeur);
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
	return "Case [nom=" + nom + ", id=" + id + "]";
    }
    
    /**
     *
     * @return
     */
    public abstract int getPrixMaison();
    
    /**
     *
     * @return
     */
    public abstract int getMaison();
    
    /**
     *
     * @param j
     * @param p
     */
    public abstract void construire(Joueur j, Plateau p);
    
    /**
     *
     * @return
     */
    public abstract boolean estConstructible();
    
    /**
     *
     * @param i
     */
    public abstract void setMaison(int i);
    
    /**
     *
     * @param j
     * @param p
     */
    public abstract void acheter(Joueur j, Plateau p);
}

