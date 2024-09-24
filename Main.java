import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Imagem imagem = new Imagem("imagens/imagem2.png");

        imagem.floodFillPilha(145, 224, Color.GREEN);
        imagem.floodFillFila(145, 224, Color.GRAY);
    }
    
}
