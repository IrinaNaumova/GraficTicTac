
import javax.swing.*;
import java.awt.*;

/*
* 1. Полностью разобраться с кодом
* (попробовать полностью самостоятельно переписать одно из окон)
*
* 2. Составить список вопросов и приложить в виде комментария к домашней работе
*
* 3. * Расчертить панель Map на поле для игры, согласно fieldSize
* */

public class Map extends JPanel {
    public static final int MODE_HUM_VS_HUM = 0;
    public static final int MODE_HUM_VS_AI = 1;

    Map() {
        setBackground(Color.BLUE);
    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen) {
        System.out.printf("Mode: %d, Size: %d, Len: %d \n", mode, fieldSizeY, winLen);
    }

}
