/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matriz.model;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author pabloantoniolopezmartin
 */
public class MatrixGenerator {

    private int[][] matrix;
    private int min;
    private int max;
    
    public MatrixGenerator(int min, int max, int dim1, int dim2){
        this.min=min;
        this.max=max;
        matrix = new int[dim1][dim2];
        this.fill();
    }
    public int[][] getMatrix(){
        if(matrix ==null){
            matrix = new int[10][10];
            fill();
        }
        return matrix;
    }
    private void fill(){
     
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]= ThreadLocalRandom.current().nextInt(min, max + 1);
            }
      
        }
    }
}
