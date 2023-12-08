public class LearnArray {
    public static void main(String[] args) {
        int martixArray[][] = new int[3][4];

        for (int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                martixArray[i][j] = (int)(Math.random()*10);
            }
        }

        System.out.println("Print values in array");
        for(int row[]: martixArray){
            for(int column:row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

// Array in Java is an object. It will be created inside the Heap Memory. It will occupy continuous memory locations
// The size of Array in Java is fixed. We cannot alter it later