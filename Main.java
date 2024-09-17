import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Imagem imagem = new Imagem("imagens/imagem.png");

        imagem.floodFillPilha(65, 55, Color.GREEN);
        imagem.salvarImagem("imagens/output/output.png");
    }
    
}
