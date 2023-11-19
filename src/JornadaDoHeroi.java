import java.util.Scanner;

public class JornadaDoHeroi {
    public static void main(String[] args) {
        personagem você = new personagem("você", 80); // Nome: Arthur, Energia inicial: 80
        personagem ancião = new personagem("Ancião", 90); // Nome: Ancião, Energia inicial: 90

        
        try (Scanner scanner = new Scanner(System.in)) {
            // Capítulo 1
            String capitulo1 = "Título: A Jornada do Herói\nCapítulo 1: O Chamado à Aventura\nVocê é um jovem camponês chamado Arthur, que vive em uma pequena vila.\nEm uma noite tempestuosa, você encontra um mapa antigo no celeiro da sua casa.\nEle mostra um caminho para a lendária Espada do Destino, dizendo que somente o verdadeiro herói poderá empunhá-la.\nO que você faz?";
            
            // Escolhas do Capítulo 1 
            String escolhaCapitulo1_1 = "1. Decide explorar o mapa imediatamente.";
            String escolhaCapitulo1_2 = "2. Mostra o mapa para o ancião da vila em busca de conselhos.";
            
            // Mostra o primeiro capítulo e as escolhas
            System.out.println(capitulo1);
            System.out.println(escolhaCapitulo1_1);
            System.out.println(escolhaCapitulo1_2);
            
            // Captura a escolha do usuário no Capítulo 1
            String escolhaUsuario = scanner.nextLine();

            if (escolhaUsuario.equals("1")) {
                // Capítulo 3
                String capitulo3 = "Título: A Caverna Misteriosa\n você segue o mapa e chega a uma caverna escura.\nHá duas passagens à sua frente.\nQual você escolhe?";
                
                // Escolhas do Capítulo 3
                String escolhaCapitulo3_1 = "1. Passagem à esquerda.";
                String escolhaCapitulo3_2 = "2. Passagem à direita";
                
                // Mostra a escolha e a energia 
                System.out.println("Você decide explorar o mapa imediatamente e...");
                int energiaAntes = você.getEnergia();
                você.setEnergia(você.getEnergia() - 15);
                int energiaDepois = você.getEnergia();
               
                System.out.println("Enquanto examina o mapa, você sente uma pontada de fome e cansaço.");
                System.out.println("Energia de Arthur: " + energiaAntes + " -> " + energiaDepois);
                // Reduz a energia de Arthur ao explorar imediatamente
                você.setEnergia(você.getEnergia() - 15);
                
                // Mostra o Capítulo 3 e as escolhas
                System.out.println(capitulo3);
                System.out.println(escolhaCapitulo3_1);
                System.out.println(escolhaCapitulo3_2);
                
                // Captura a escolha do usuário no Capítulo 3
                String escolhaUsuarioCap3 = scanner.nextLine();
                
                if (escolhaUsuarioCap3.equals("1")) {
                    // Capítulo 6
                    String capitulo6 = "O Desafio nas Profundezas\nA passagem à esquerda o leva a uma série de túneis estreitos.\nVocê ouve ruídos estranhos à distância. O que você faz?";
                    
                    // Escolhas do Capítulo 6
                    String escolhaCapitulo6_1 = "1. Investiga os ruídos.";
                    String escolhaCapitulo6_2 = "2. Evita os ruídos e segue em frente";
                    
                    // Mostra o Capítulo 6 e as escolhas
                    System.out.println(capitulo6);
                    System.out.println(escolhaCapitulo6_1);
                    System.out.println(escolhaCapitulo6_2);
                    
                    // Captura a escolha do usuário no Capítulo 6
                    String escolhaUsuarioCap6 = scanner.nextLine();
                } else if (escolhaUsuarioCap3.equals("2")) {
                    // Capítulo 7
                    String capitulo7 = "Título: A Escuridão à Direita\nAo escolher a passagem à direita, você se depara com uma sala ampla e escura.\nHá algo brilhante no centro. O que você faz?";
                    
                    // Escolhas do Capítulo 7
                    String escolhaCapitulo7_1 = "1. Investiga os ruídos.";
                    String escolhaCapitulo7_2 = "2. Evita os ruídos e segue em frente";
                    
                    // Mostra o Capítulo 7 e as escolhas
                    System.out.println(capitulo7);
                    System.out.println(escolhaCapitulo7_1);
                    System.out.println(escolhaCapitulo7_2);
                    
                    // Captura a escolha do usuário no Capítulo 7
                    String escolhaUsuarioCap7 = scanner.nextLine();
                } else {
                    System.out.println("Escolha incorreta");
                }
            } else if (escolhaUsuario.equals("2")) {
                // Capítulo 2
                String capitulo2 = "Título: Conselho do Ancião\nO ancião da vila examina o mapa com cuidado\ne diz que a Espada do Destino é guardada por um dragão temível.\nEle oferece uma poção mágica que pode ajudar na jornada.\nO que você faz?";
                
                // Escolhas do Capítulo 2
                String escolhaCapitulo2_1 = "1. Aceita a poção e parte imediatamente.";
                String escolhaCapitulo2_2 = "2. Decide treinar suas habilidades antes de enfrentar o dragão";
                
                // Mostra a escolha e a energia 
                System.out.println("Você decide mostrar o mapa para o ancião da vila...");
                // Armazena a energia antes da mudança
                int energiaAntes = você.getEnergia();
                // Reduz a energia de Arthur ao consultar o ancião
                você.setEnergia(você.getEnergia() - 52);
                // Armazena a energia após a mudança
                int energiaDepois = você.getEnergia();
                System.out.println("O ancião analisa o mapa com cuidado e oferece conselhos sobre sua jornada.");
                // Mostra quanto de energia atual ele tem                
                System.out.println("Energia de Arthur: " + energiaAntes + " -> " + energiaDepois);
                // Mostra o Capítulo 2 e as escolhas

                System.out.println(capitulo2);
                System.out.println(escolhaCapitulo2_1);
                System.out.println(escolhaCapitulo2_2);
                
                // Captura a escolha do usuário no Capítulo 2
                String escolhaUsuarioCap2 = scanner.nextLine();
                
                if (escolhaUsuarioCap2.equals("1")) {
                    // Capítulo 4
                    String capitulo4 = "Título: A Jornada Iniciada\nVocê parte imediatamente, confiante na poção mágica oferecida pelo ancião.\nEnquanto atravessa a floresta indicada no mapa, você encontra uma bifurcação.\nQual caminho você escolhe?";
                    
                    // Escolhas do Capítulo 4
                    String escolhaCapitulo4_1 = "1. Caminho da Montanha.";
                    String escolhaCapitulo4_2 = "2. Caminho da Floresta Negra.";
                    
                    // Mostra o Capítulo 4 e as escolhas
                    System.out.println(capitulo4);
                    System.out.println(escolhaCapitulo4_1);
                    System.out.println(escolhaCapitulo4_2);
                    
                    // Captura a escolha do usuário no Capítulo 42
                    String escolhaUsuarioCap4 = scanner.nextLine();
                } else {
                   
                
                }
            }
        }
    }
}
            
        

