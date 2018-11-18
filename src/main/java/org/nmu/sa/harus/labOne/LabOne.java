package org.nmu.sa.harus.labOne;

public class LabOne {
    public static void main(String[] args) {
        int rowsCount=5;
        int coloumnCount = 5;
        int[][] mass = new int[rowsCount][coloumnCount];
        int sum=0;

        for(int i = 0;i<rowsCount;i++){
            for(int j=0;j<coloumnCount;j++){
                mass[i][j]=i*j-1 ;
            }
        }
        for(int i = 0;i<rowsCount;i++){
            for(int j=0;j<coloumnCount;j++){
                sum+=mass[i][j];
            }
        }
        System.out.println(sum + " - сумма всех элементов");
        System.out.println();

        //Вар №1
        int min=mass[0][0];
        int max=min;
        for(int i = 0;i<rowsCount;i++){
            for(int j=0;j<coloumnCount;j++){
                if(mass[i][j]>max){
                    max=mass[i][j];
                }
                if(mass[i][j]<min){
                    min=mass[i][j];
                }
            }
        }

        System.out.println(max + " - максимальный элемент");
        System.out.println(min + " - минимальный элемент");

        //Вар №2
        min=mass[0][0]; max=mass[0][0];
        for(int i = 0;i<rowsCount;i++){
            for(int j=0;j<coloumnCount;j++){
                max=Math.max(max, mass[i][j]);
                min=Math.min(min, mass[i][j]);
            }
        }
        System.out.println();
        System.out.println(max + " - максимальный элемент");
        System.out.println(min + " - минимальный элемент");


        /*Вывод матрицы
        for(int i = 0;i<mass.length;i++){
            for(int j=0;j<mass.length;j++){
                System.out.print(mass[i][j]+" ");}
            System.out.println();} */

    }
}
