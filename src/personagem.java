public class personagem {
    private String nome;
    private int energia;
    private final int ENERGIA_MAXIMA = 100;
     // Define a energia máxima do personagem

    public personagem(String nome, int energia) {
        this.nome = nome;
        if (energia > ENERGIA_MAXIMA) {
            this.energia = ENERGIA_MAXIMA;
        } else {
            this.energia = energia;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia > ENERGIA_MAXIMA) {
            this.energia = ENERGIA_MAXIMA;
        } else if (energia < 0) {
            this.energia = 0;
        } else {
            this.energia = energia;
        }
    }
}

