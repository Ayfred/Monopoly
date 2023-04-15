package Construction_Plateau;

import Monopoly_Sur_Console.Plateau;
import Cases.Case;
import Cases.CaseDepart;
import Famille_Terrain.Bleu;
import Famille_Terrain.Cyan;
import Famille_Terrain.Jaune;
import Famille_Terrain.Marron;
import Famille_Terrain.Orange;
import Famille_Terrain.Rouge;
import Famille_Terrain.Vert;
import Famille_Terrain.Violet;
import Cases.*;

/**
 *
 * @author maxime.mines-ales
 */
public class PlateauMonopoly {
    
    private Plateau plateau;

    /**
     *
     * @param plateau
     */
    public PlateauMonopoly(Plateau plateau){
        this.plateau = plateau;
    }
    
    /**
     *
     * @param i
     * @param c
     */
    public void setCase(int i, Case c){
        plateau.addCase(i, c);
    }
    
    /**
     *
     */
    public void construire(){
        setCase(0, new CaseDepart());
        setCase(2, new Communaute(2));
        setCase(4, new Impot("Impots sur le revenu", 4, 200));
        setCase(5, new Gare("Gare Montparnasse", 5));
        setCase(7, new Chance(7));
        setCase(10, new Prison());
        setCase(12, new ServicePublic("Compagnie d'électricité", 12, 150));
        setCase(15, new Gare("Gare de Lyon", 15));
        setCase(17, new Communaute(17));
        setCase(20, new ParcGratuit());
        setCase(22, new Chance(22));
        setCase(25, new Gare("Gare du Nord", 25));
        setCase(28, new ServicePublic("Compagnie des eaux", 28, 150));
        setCase(30, new AllerEnPrison());
        setCase(33, new Communaute(33));
        setCase(35, new Gare("Gare Saint-Lazare", 35));
        setCase(36, new Chance(36));
        setCase(38, new Impot("Taxe de Luxe", 38, 100));
    
        /* INITIALISATION DES TERRAINS */
        
        Marron bdb = new Marron(1, 50,"Marron", "Boulevard de Belleville", 
                                    60,new int[] {2, 10, 30, 90, 160, 250});
        setCase(1,bdb);
        setCase(3, new Marron(3, 50,"Marron", "Rue Lecourbe", 60,
                                        new int[]{4, 20, 60, 180, 320, 450}));

        setCase(6, new Cyan(6, 50,"Cyan", "Rue de Vaugirard", 100,
                                        new int[]{6, 30, 90, 270, 400, 550}));
        setCase(8, new Cyan(8, 50,"Cyan", "Rue de Courcelles", 100,
                                        new int[]{6, 30, 90, 270, 400, 550}));
        setCase(9, new Cyan(9, 50,"Cyan", "Avenue de la République", 120,
                                        new int[]{8, 40, 100, 300, 450, 600}));
    
        setCase(11, new Violet(11, 100, "Violet", "Boulevard la Villette", 140, 
                                        new int[]{10, 50, 150, 450, 625, 750}));
        setCase(13, new Violet(13, 100, "Violet", "Avenue de Neuilly", 140, 
                                        new int[]{10, 50, 150, 450, 625, 750}));
        setCase(14, new Violet(14, 100, "Violet", "Rue du Paradis", 160, 
                                        new int[]{12, 60, 180, 500, 700, 900}));
        
        setCase(16, new Orange(16, 100, "Orange", "Avenue Mozart", 180, 
                                        new int[]{14, 70, 200, 550, 750, 950}));
        setCase(18, new Orange(18, 100, "Orange", "Boulevard Saint-Victorien", 
                                    180, new int[]{14, 70, 200, 550, 750, 950}));
        setCase(19, new Orange(19, 100, "Orange", "Place Pigalle", 200, 
                                    new int[]{16, 80, 220, 600, 800, 1000}));
    
        setCase(21, new Rouge(21, 150, "Rouge", "Avenue Matignon", 220,
                                    new int[]{18, 90, 250, 700, 875, 1050}));
        setCase(23, new Rouge(23, 150, "Rouge", "Boulevard Malesherbes", 220,
                                    new int[]{18, 90, 250, 700, 875, 1050}));
        setCase(24, new Rouge(24, 150, "Rouge", "Avenue Henri-Martin", 240, 
                                    new int[]{20, 100, 300, 750, 925, 1100}));
    
        setCase(26, new Jaune(26, 150, "Jaune", "Faubourg Saint-Honoré", 260, 
                                    new int[]{22, 110, 330, 800, 975, 1150}));
        setCase(27, new Jaune(27, 150, "Jaune", "Place de la Bourse", 260, 
                                    new int[]{22, 110, 330, 800, 975, 1150}));
        setCase(29, new Jaune(29, 150, "Jaune", "Rue La Fayette", 280, 
                                    new int[]{24, 120, 360, 850, 1025, 1200}));
    
        setCase(31, new Vert(31, 200, "Vert", "Avenue de Breuteuil", 300, 
                                    new int[]{26, 130, 390, 900, 1100, 1275}));
        setCase(32, new Vert(32, 200, "Vert", "Avenue Foch", 300, 
                                    new int[]{26, 130, 390, 900, 1100, 1275}));
        setCase(34, new Vert(34, 200, "Vert", "Boulevard des Capucines", 320, 
                                    new int[]{28, 150, 450, 1000, 1200, 1400}));
        
        setCase(37, new Bleu(37, 200, "Bleu", "Avenue des Champs-Élysées", 350, 
                                    new int[]{35, 175, 500, 1100, 1300, 1500}));
        setCase(39, new Bleu(39, 200, "Bleu", "Rue de la Paix", 400, 
                                    new int[]{50, 200, 600, 1400, 1700, 2000}));
    
    
    /* INITIALISATION DES CARTES CHANCES */
        /*Chance.add(new CartePayerArgent("Amende", "Amende pour excès de vitesse : 15€.", 15));
        chance.add(new CartePayerArgent("Président du conseil d'administration", "Vous avez été élu président du conseil d'administration. \nVersez 50€ à chaque joueur.", 50));
        chance.add(new CartePayerArgent("Lanuel", "Vous avez manqué de respect à M. Lanuel. \nVersez 50€ de dédommagement.", 50));

        chance.add(new CarteRecevoirArgent("Versement", "La banque vous verse un dividende de 50€.", 50));
        chance.add(new CarteRecevoirArgent("Gain", "Vos terrains vous rapportent. Touchez 150€.", 150));
        chance.add(new CarteRecevoirArgent("Mots croisés", "Vous avez gagné le prix de mots-croisés ! \nRecevez 100€.", 100));*/
    
        /*chance.add(new CarteDeplacement("Case Départ", "Avancez jusqu'à la case départ. \n(Recevez 200€)", 0, false));
        chance.add(new CarteDeplacement("Rue de la Paix", "Rendez-vous Rue de la Paix.", 39, false));
        chance.add(new CarteDeplacement("Henri-Martin", "Rendez-vous à l'Avenue Henri-Martin. \nSi vous passez par la case départ, recevez 200€.", 24, false));
        chance.add(new CarteDeplacement("Boulevard de la Villette", "Avancez au Boulevard de la Vilette. \nSi vous passez par la case départ, recevez 200€.", 11, false));
        chance.add(new CarteDeplacement("Gare de Lyon", "Avancez à la gare de Lyon. \nSi vous passez par la case départ, recevez 200€.", 15, false));
        chance.add(new CarteDeplacement("Reculez", "Reculez de 3 cases.", -3, true));

        chance.add(new CarteDeplacement("Nv Depart", "Le joueur déménage et prend un \nnouveau départ au Technopole.", 0, false));
    
        chance.add(new CarteDeplacement("Prison", "Allez en prison. \nAvancez tout droit en prison. \nNe passez pas par la case départ, ne recevez pas 200€.", 10, false));
        chance.add(new CarteSortirPrison("Sortie", "Vous êtes libéré de prison. \n(Cette carte doit être conservée)"));
    
        /*Collections.shuffle(chance); //Mélange des cartes
    
    
        /* INITIALISATION DES CARTES COMMUNAUTÉS */
        /*communauté.add(new CartePayerArgent("Frais de scolarité", "Payez 150€ de frais de scolarité.", 150));
        communauté.add(new CartePayerArgent("Frais d'hospitalisation", "Payez 100€ de frais d'hospitalisation.", 100));
        communauté.add(new CartePayerArgent("Médecin", "Visite chez le médecin : payez 50€.", 50));
    
        communauté.add(new CarteRecevoirArgent("Remboursement", "Les impôts vous remboursent 20€.", 20));
        communauté.add(new CarteRecevoirArgent("Assurance vie", "Votre assurance vie vous rapporte 100€.", 100));
        communauté.add(new CarteRecevoirArgent("Anniversaire", "C'est votre anniversaire ! \nChaque joueur doit vous donner 10€.", 10));
        communauté.add(new CarteRecevoirArgent("Commission d'expert", "Commission d'expert immobilier. \nRecevez 25€.", 25));
        communauté.add(new CarteRecevoirArgent("Prix de beauté", "Vous avez gagné le deuxième prix de beauté. \nRecevez 10€.", 10));
        communauté.add(new CarteRecevoirArgent("Stock", "La vente de votre stock vous rapporte 50€.", 50));
        communauté.add(new CarteRecevoirArgent("Héritage", "Vous héritez de 100€.", 100));
        communauté.add(new CarteRecevoirArgent("Placement", "Votre placement vous rapporte. \nRecevez 100€.", 100));
        communauté.add(new CarteRecevoirArgent("Erreur de la Banque", "Erreur de la Banque en votre faveur. \nRecevez 200€.", 200));
    
        communauté.add(new CarteDeplacement("Prison", "Allez en prison. \nAvancez tout droit en prison. \nNe passez pas par la case départ, ne recevez pas 200€.", 10, false));
        communauté.add(new CarteSortirPrison("Sortie", "Vous êtes libéré de prison. \n(Cette carte doit être conservée)"));*/
    
    }
    
}
