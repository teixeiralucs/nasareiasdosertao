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
                             "matou bilhões e forçou os cidadãos que restaram a procurar no interior\n" +
                             "um jeito de viver. Numa cidade pequena, no sertão brasileiro,\n" +
                             "um herói tem que escolher entre amar e lutar.\n" +
                             "Bem-vindo ao Nas Areias dos Sertões");
            System.out.println("Nessa sessão vamos escolher alguns aspectos o seu personagem" +
                                " tais como nome, gênero e arma favorita");
            System.out.println("Seu personagem é HOMEM ou MULHER?");
            String homem = ("HOMEM");
            String genero = leitor .nextLine();

            if (genero.equalsIgnoreCase(homem)){
                System.out.println("Qual nome seu personagem terá?");
                String nome = leitor .nextLine();
                System.out.println("Ok, vamos chamá-lo de " + nome);
                System.out.println("Agora vamos escolher sua a arma favorita, você tem três escolhas: \n"+
                "A CARABINA é uma arma de fogo de longo alcance, medindo 1 metro e equipada com balas de 5mm, "+
                "foi muito utilizada no século XX por Cangaceiros e Vaqueiros,\n" +
                "A PEIXEIRA será sua arma de corpo a corpo, trazendo uma lâmina e 30cm presa a um cabo de feito de " +
                "restos de crânio de Jaguatirica, essa arma poderá te ajudar em momentos de conflito direto com os "+
                "inimigos que surgirão na sua aventura.\n"+
                "Nossa ultima arma é a MANDALA, uma armamento místico com escritas antigas "+
                "que canaliza as energia dos elementos naturais "+
                "como as águas do São Francisco e a areia escaldante do sertão e libera como" +
                "rajadas de água congelante ou energia quente como sol.");
                System.out.println("Qual arma você prefere? CARABINA, PEIXEIRA ou MANDALA?");
                String arma = leitor .nextLine();
            }
            else{
                System.out.println("Qual nome seu personagem terá?");
                String nome = leitor .nextLine();
                System.out.println("Ok, vamos chamá-la de " + nome);
                System.out.println("Agora vamos escolher sua a arma favorita, você tem três escolhas: \n"+
                "A CARABINA é uma arma de fogo de longo alcance, medindo 1 metro e equipada com balas de 5mm, "+
                "foi muito utilizada no século XX por Cangaceiros e Vaqueiros,\n" +
                "A PEIXEIRA será sua arma de corpo a corpo, trazendo uma lâmina e 30cm presa a um cabo de feito de " +
                "restos de crânio de Jaguatirica, essa arma poderá te ajudar em momentos de conflito direto com os "+
                "inimigos que surgirão na sua aventura.\n"+
                "Nossa ultima arma é a MANDALA, uma armamento místico com escritas antigas "+
                "que canaliza as energia dos elementos naturais "+
                "como as águas do São Francisco e a areia escaldante do sertão e libera como" +
                "rajadas de água congelante ou energia quente como sol.");
                System.out.println("Qual arma você prefere? CARABINA, PEIXEIRA ou MANDALA?");
                String arma = leitor .nextLine();
            }
        }
        else{
            System.out.println("In a wasteland future, the potable water of the planet has gone\n" +
	                        "the polar ice caps melted and the ocean drowned most of the cities,\n" +
                            "killed billions and forced the left citizen to search in the countryside\n" +
                            "a way to live. In a small city, in Brazilian's Sertão,\n" +
                            "a hero has to choose between love and fight.\n" +
                            "Welcome to In Sertão's Sands");
            System.out.println("In this section we're going to choose a few aspects\n" +
                            "of your character, as name, gender and favorite weapon. Let 's start.");
            System.out.println("Is your character a MAN or a WOMAN?");
            String man = ("MAN");
            String gender = leitor .nextLine();

            if (gender.equalsIgnoreCase(man)){
                System.out.println("What will be the name of your character?");
                String name = leitor .nextLine();
                System.out.println("Okay, will call him " + name);
                System.out.println("Now we're going to chose your favorite weapon, you have three choices: \n"+
                "The CARABINA is a long distance fire gun, with a size of 3ft2 and and 2.1 inc bullets "+
                "was spread used in 20th Century by Cangaceiros and Vaqueiros,\n" +
                "The PEIXEIRA will be your hand-to-hand weapon, with a 11.8 inc blade stuck in a handle made of" +
                "Jaguatirica's left skull, this one can help you in close combat with the several enemies "+
                "your journey.\n"+
                "Your last choice is the MANDALA, a mystical weapon with ancient writting "+
                "that channel the natural element's energy "+
                "as the São Francisco's waters and the sertão's scorching sand and releases as " +
                "torrentials freezing waterror energy as hot as the sun.");
                System.out.println("Which weapon would you rather? CARABINA, PEIXEIRA or MANDALA?");
                String weapon = leitor .nextLine();
            }
            else{
                System.out.println("What will be the name of your character?");
                String name = leitor .nextLine();
                System.out.println("Okay, will call her " + name);
                System.out.println("Now we're going to chose your favorite weapon, you have three choices: \n"+
                "The CARABINA is a long distance fire gun, with a size of 3ft2 and and 2.1 inc bullets "+
                "was spread used in 20th Century by Cangaceiros and Vaqueiros,\n" +
                "The PEIXEIRA will be your hand-to-hand weapon, with a 11.8 inc blade stuck in a handle made of" +
                "Jaguatirica's left skull, this one can help you in close combat with the several enemies "+
                "your journey.\n"+
                "Your last choice is the MANDALA, a mystical weapon with ancient writting "+
                "that channel the natural element's energy "+
                "as the São Francisco's waters and the sertão's scorching sand and releases as " +
                "torrentials freezing waterror energy as hot as the sun.");
                System.out.println("Which weapon would you rather? CARABINA, PEIXEIRA or MANDALA?");
                String weapon = leitor .nextLine(); 
            }
        leitor.close();
        }
        
        
    }
}