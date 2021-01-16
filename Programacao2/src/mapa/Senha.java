package mapa;

public class Senha {

    private int numero;
    private char tipo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Senha(int numero, char tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + "-" + numero;
    }

    public boolean isPreferencial() {
        return this.getTipo() == 'P';
    }

    public boolean isComum() {
        return this.getTipo() == 'C';
    }

    public boolean isRapido() {
        return this.getTipo() == 'R';
    }
}
