import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.imageio.ImageIO;

public class Imagem {
    private BufferedImage imagem;

    public Imagem(String path) {
        try {
            this.imagem = ImageIO.read(new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarImagem(String outPath) {
        try {
            ImageIO.write(imagem, "png", new File(outPath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void floodFillPilha(int x, int y, Color corNova) {
        Pilha<Coord> pilha = new Pilha<>();
        Color corBase = new Color(imagem.getRGB(x, y));
        Color corBorda = Color.BLACK;

        pilha.push(new Coord(x, y));
        

        while (!pilha.isEmpty()) {
            Coord coord = new Coord(x,y);
            pilha.pop();

            if (coord.x >= 0 || coord.x >= imagem.getWidth() || coord.y >= 0 || coord.y >= imagem.getHeight()) {
                continue;
            }
            Color corSubs = new Color(imagem.getRGB(coord.x, coord.y));

            if (corSubs.equals(corBase) && !corSubs.equals(corBorda)) {
                imagem.setRGB(coord.x, coord.y, corNova.getRGB());

                pilha.push(new Coord(coord.x + 1, coord.y));
                pilha.push(new Coord(coord.x - 1, coord.y));
                pilha.push(new Coord(coord.x, coord.y + 1));
                pilha.push(new Coord(coord.x, coord.y - 1));
            }
        }
    }
}
