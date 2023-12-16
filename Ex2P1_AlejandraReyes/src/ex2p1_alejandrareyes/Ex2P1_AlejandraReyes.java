
package ex2p1_alejandrareyes;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// fila 2 asiento 3
/**
 *
 * @author aleja
 */
public class Ex2P1_AlejandraReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);
        ArrayList <Items> mochila = new ArrayList<>();
        ArrayList <Personaje> party = new ArrayList<>();
        ArrayList <Personaje> reserva = new ArrayList<>();
        
        
       
        
         party.add(new Personaje("Sora",300, 300,75,15));
         party.add(new Personaje("Donald", 150,450,45,10));
         party.add(new Personaje("Goofy", 450,100,150,50));
         
         reserva.add(new Personaje("Mickey",100, 500,150,35));
         reserva.add(new Personaje("Roxas", 300,300,15,75));
         reserva.add(new Personaje("Kairi", 200,200,50,15));
        
         mochila.add(new Items ("Pocion", 50, 0));
         mochila.add(new Items ("Ether", 0, 50));
         mochila.add(new Items ("Elixir", 100, 100));
         
         
         
        
        char resp='s';
       
                int cuarto =1;
                System.out.println("Estas en el cuarto " + cuarto);
                System.out.println("- - - - - - - - - - - - - - - - - - -");
                
                while (cuarto <21|| !party.isEmpty()|| resp=='s' || resp=='S' || resp=='n' || resp=='N'){
                    
                    int ocurre = rand.nextInt(5)+1;
                    if (resp=='n' || resp=='N'){
                        
                        System.out.println("Estas en el cuarto " + cuarto);
                        System.out.println("- - - - - - - - - - - - - - - - - - -");
                    }

                    switch (ocurre){
                            case 1:
                                int cantheart = rand.nextInt(3)+1;
                                System.out.println("Te has encontrado a " + cantheart + " Heartless!");
                                double vidaheartless = cantheart*75;
                                double ataqueheartless = cantheart*25;


                                imprimirpersonajes(party);

                                while (vidaheartless>0 && !party.isEmpty()){ 
                                    System.out.print("Elije el personaje: ");
                                    int per = leer.nextInt();


                                    System.out.println();
                                    System.out.println("###### M e n u ######");
                                    System.out.println("   1.-  Attack +");
                                    System.out.println("   2.-  Magic  =");
                                    System.out.println("   3.-  Items  $");
                                    System.out.println("   4.-  Party  *");
                                    int op = leer.nextInt();


                                    switch (op){// menu attack
                                        case 1: 
                                            System.out.println((party.get(per)).getNombre() + " ataco!");
                                            System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                            party.get(per).setHP(party.get(per).getHP()-(ataqueheartless*(1-((party.get(per)).getDefensePoints())/100)));
                                            vidaheartless = vidaheartless-party.get(per).getAttackPoints();
                                            if (vidaheartless<0){
                                                vidaheartless=0;
                                            }
                                            System.out.println("Los heartless les queda: " + vidaheartless);

                                            break;

                                        case 2:
                                            System.out.println("    1. - Blizzard  50MP - 50DMG");
                                            System.out.println("    2. - Firaga    25MP - 25DMG");
                                            System.out.println("    3. - Gravity   75MP - 100DMG");
                                            int magic = leer.nextInt();
                                            switch(magic){
                                                case 1:
                                                    System.out.println( ((party.get(per)).getNombre()) + " uso Blizzard");
                                                    System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                    party.get(per).setMP(party.get(per).getMP()-50);
                                                    vidaheartless = vidaheartless - 50;
                                                    
                                                     if (vidaheartless<0){
                                                        vidaheartless=0;
                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                    }
                                                     else{
                                                         System.out.println("Los heartless les queda: " + (vidaheartless));
                                                     }

                                                    break; 
                                                    
                                                case 2:
                                                    System.out.println( ((party.get(per)).getNombre()) + " uso Firaga");
                                                    System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                    party.get(per).setMP(party.get(per).getMP()-25);
                                                     vidaheartless = vidaheartless - 25;
                                                    if (vidaheartless<0){
                                                        vidaheartless=0;
                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                    }
                                                    else {
                                                         System.out.println("Los heartless les queda: " + (vidaheartless));
                                                    }

                                                    break;

                                                case 3:
                                                    System.out.println( ((party.get(per)).getNombre()) + " uso Gravity");
                                                    System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                    party.get(per).setMP(party.get(per).getMP()-75);
                                                     vidaheartless = vidaheartless - 100;
                                                    if (vidaheartless<0){
                                                        vidaheartless=0;
                                                         System.out.println("Los heartless les queda: " + vidaheartless);
                                                    } else{
                                                    System.out.println("Los heartless les queda: " + (vidaheartless));
                                                    }
                                                    break;
                                                    
                                            }

                                            break; 

                                        case 3:
                                            imprimiritems(mochila);
                                            if (mochila.isEmpty()==false){
                                                System.out.println("Elige un item: ");
                                                int it = leer.nextInt();
                                                if (mochila.get(it).getNombre()=="Pocion"){

                                                    party.get(per).setHP(party.get(per).getHP()+50);
                                                    System.out.println( ((party.get(per)).getNombre()) + " uso Pocion");
                                                     System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                     if (vidaheartless<0){
                                                            vidaheartless=0;
                                                             System.out.println("Los heartless les queda: " + vidaheartless);
                                                        } else{
                                                        System.out.println("Los heartless les queda: " + (vidaheartless));
                                                        }
                                                    mochila.remove(it);
                                                }
                                                else if (mochila.get(it).getNombre()=="Ether"){

                                                    party.get(per).setMP(party.get(per).getMP()+50);
                                                     System.out.println( ((party.get(per)).getNombre()) + " uso Ether");
                                                      System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                      if (vidaheartless<0){
                                                            vidaheartless=0;
                                                             System.out.println("Los heartless les queda: " + vidaheartless);
                                                        } else{
                                                        System.out.println("Los heartless les queda: " + (vidaheartless));
                                                        }
                                                     mochila.remove(it);
                                                }
                                                else if (mochila.get(it).getNombre()=="Elixir"){

                                                    party.get(per).setHP(party.get(per).getHP()+100);
                                                    party.get(per).setMP(party.get(per).getMP()+100);
                                                     System.out.println( ((party.get(per)).getNombre()) + " uso Elixir");
                                                      System.out.println( ((party.get(per)).getNombre()) + " recibio el golpe!");
                                                      if (vidaheartless<0){
                                                            vidaheartless=0;
                                                             System.out.println("Los heartless les queda: " + vidaheartless);
                                                        } else{
                                                        System.out.println("Los heartless les queda: " + (vidaheartless));
                                                        }
                                                     mochila.remove(it);
                                                }
                                            }
                                            else if (mochila.isEmpty()==true){
                                                    System.out.println("No tienes items");
                                            }   
                                            

                                            break; // items

                                        case 4:
                                            imprimirpersonajes(reserva);
                                            System.out.println("Elige por quien cambiar: ");
                                            int in = leer.nextInt();
                                            party.remove(per);
                                            party.add((per),reserva.get(in));
                                            imprimirpersonajes(party);
                                            System.out.println("El personaje ha sido cambiado antes del ataque");
                                            System.out.println("");
                                            System.out.println("Los heartless les queda: " + (vidaheartless));
                                            break; // party 


                                    }
                                    if (party.get(per).getHP()==0 || party.get(per).getHP()<0){
                                                        party.remove(per);
                                                    }
                                    if (vidaheartless == 0 || vidaheartless<0) {
                                         break;
                                    }
                                    System.out.println();
                                    imprimirpersonajes(party);

                                    }

                                break;



                            case 2:
                                System.out.println("Te has encontrado un cofre que contiene una Pocion!");
                                mochila.add(new Items ("Pocion", 50, 0));
         
                                break;

                            case 3:
                                System.out.println("Te has encontrado un cofre que contiene un Ether!");
                                mochila.add(new Items ("Ether", 0, 50));
         
                                break;

                            case 4:
                                System.out.println("Te has encontrado un cofre que contiene un Elixir!");
                                mochila.add(new Items ("Elixir", 100, 100));
                                break;

                            case 5:
                                System.out.println("Te has encontrado a amigos que ocupan tu ayuda y decides darles Items!");
                                System.out.println("Quedan:");
                                
                                imprimiritems(mochila);
                                mochila.remove(0);
                                if (mochila.isEmpty()==true){
                                    System.out.println("No tienes items");
                                }
                                // amigos
                                break; 
                                



                    }
                    cuarto++;
                    
                    System.out.println("Deseas continuar? ");
                    resp =leer.next().charAt(0);
                    System.out.println();
                    
                    
                }
            
        }
    
    
    
       
    
    public static void imprimirpersonajes (ArrayList<Personaje> lista){
        for(int i=0; i<lista.size(); i++){
            Personaje temp = lista.get(i);
            System.out.println((i) + ". "+ temp.toString());
        }   
    }
    
    
    public static void imprimiritems (ArrayList<Items> lista){
         for(int i=0; i<lista.size(); i++){
            Items temp = lista.get(i);
             System.out.println((i) + ". " + temp.toString());
        }    
    }
    
    
    
    
    
    
    
}
