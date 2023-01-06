package easy;

import java.util.Arrays;

/**
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.
 * Return the modified image after performing the flood fill.
 */
/*
0 ms Beats 100%
Memory 43.4 MB Beats 69.87%
 */
public class FloodFill733 {
    public static int colorOrig;

    public static void main(String[] args) {
        int[][] imageOrig = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        System.out.println("New array: " + Arrays.deepToString(floodFill(imageOrig, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        colorOrig = image[sr][sc];
        if (colorOrig != newColor)
            floodFillV(image, sr, sc, newColor);
        return image;
    }

    public static void floodFillV(int[][] img, int sr, int sc, int newColor) {

        if (img[sr][sc] != colorOrig) return;

        img[sr][sc] = newColor;

        if (sr + 1 < img.length) floodFillV(img, sr + 1, sc, newColor);
        if (sc + 1 < img[0].length) floodFillV(img, sr, sc + 1, newColor);
        if (sr > 0) floodFillV(img, sr - 1, sc, newColor);
        if (sc > 0) floodFillV(img, sr, sc - 1, newColor);

    }

}
