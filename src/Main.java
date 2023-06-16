package src;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("=====================Nas Areias do Sertão===========================");
        System.out.println("Antes de começarmos, qual idioma você gostaria de jogar?\n" +
        "Before we start, which language would you like to play?\n" + "Digite PT para Português e EN para Inglês\n"
        + "Type PT to Portuguese or EN to English");
        String pt = ("PT");
        String language = leitor .nextLine();

        if (language.equalsIgnoreCase(pt)){
            System.out.println("Em um futuro desértico, a água potável do planeta acabou\n" + 
                            "as calotas polares derreteram e o oceano inundou a maioria das cidades,\n" +
                             "matou bilhões e forçou o cidadão de esquerda a procurar no campo\n" +
                             "um jeito de viver. Numa cidade pequena, no sertão brasileiro,\n" +
                             "um herói tem que escolher entre amar e lutar.\n" +
                             "Bem-vindo ao Nas Areias dos Sertões");
            System.out.println("Nessa sessão vamos escolher alguns aspectos o seu personagem" +
                                " tais como nome, genero e arma favorita");
            System.out.println("Agora me fala, seu personagem é HOMEM ou MULHER?");
            String homem = ("HOMEM");
            String genero = leitor .nextLine();

            if (genero.equalsIgnoreCase(homem)){

            }
            else{

            }                                    
        }
        else{
            System.out.println("In a wasteland future, the potable water of the planet has gone\n" +
	                        "the polar ice caps melted and the ocean drowned most of the cities,\n" +
                            "killed billions and forced the left citizen to search in the countryside\n" +
                            "a way to live. In a small city, in Brazilian's Sertão,\n" +
                            "a hero has to choose between love and fight.\n" +
                            "Welcome to In Sertão's Sands");
            System.out.println("“In this section we're going to choose a few aspects\n" +
                            "of your character, as name, gender and favorite weapon. Let 's start.");
            System.out.println("Now tell me, your character is a MAN or a WOMAN?");
            String man = ("MAN");
            String gender = leitor .nextLine();

            if (gender.equalsIgnoreCase(man)){

            }
            else{
                
            }
        }
        leitor.close();
    }
}
