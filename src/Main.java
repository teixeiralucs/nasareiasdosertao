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
        }
        else{
            System.out.println("In a wasteland future, the potable water of the planet has gone\n" +
	                        "the polar ice caps melted and the ocean drowned most of the cities,\n" +
                            "killed billions and forced the left citizen to search in the countryside\n" +
                            "a way to live. In a small city, in Brazilians Sertão,\n" +
                            "a hero has to choose between love and fight.\n" +
                            "Welcome to In Sertãos Sands");
        }
        leitor.close();
    }
}
