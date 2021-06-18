package sk.picmaus;

public class ArraysPractise {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 4;
        array[1] = 5;
        array[2] = 6;
        array[3] = 7;
        array[4] = 8;

        int[][] array2 = new int[2][];
        array2[0] = new int[]{5,6,7,8,9,10};
        array2[1] = new int[]{1,2,3,4,5,6};

        int[][] array3 = new int[3][];
        array3[0] = new int[]{1,2,3,4};
        array3[1] = new int[]{4,5,6};
        array3[2] = new int[]{8,9,1,2,3};

        sumNasobok1(array);
        System.out.println();
        sumNasobok2(array2);
        System.out.println();
        firstTwoNumbers(array3);
        System.out.println();

    }
    //metoda vypocita sucet a nasobok vsetkych prvkov v jednrozmernom poli
    public static void sumNasobok1(int[] pole){
        int sucet = 0;
        int nasobok = 1;
        for (int i=0; i<pole.length; i++){
            sucet = sucet + pole[i];
            nasobok = nasobok * pole[i];
        }
        System.out.println("Sucet vsetkych cisel v poli je " + sucet);
        System.out.println("Nasobok vsetkych cisel v poli je " + nasobok);
    }
    //metoda vypocita sucet a nasobok vsetkych prvkov v dvojrozmernom poli
    public static void sumNasobok2(int[][] pole){
        int sucet = 0;
        int nasobok = 1;
        for (int i=0; i<pole.length; i++){
            for (int j=0; j<pole[i].length; j++){
                sucet = sucet + pole[i][j];
                nasobok = nasobok * pole[i][j];
            }
        }
        System.out.println("Sucet vsetkych cisel v dvojrozmernom poli je " + sucet);
        System.out.println("Nasobok vsetkych cisel v dvojrozmernom poli je " + nasobok);
    }
    //metoda vypise prve dve cisla v poli z dvojrozmerneho pola
    public static void firstTwoNumbers(int[][] pole){
        for (int i=0; i<pole.length; i++){
            for (int j=0; j<2; j++){
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
    }
}
