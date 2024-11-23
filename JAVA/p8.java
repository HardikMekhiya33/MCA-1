import java.util.Scanner;

class Matrix 
{
    private double[][] data;
    private int rows;
    private int cols;

    // constructor to initialize matrix
    public Matrix(int rows, int cols, double[][] inputData) 
	{
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];

        // if inputData is provided, use it to initialize matrix
        if (inputData != null) {
            for (int i = 0; i < rows; i++) {
                System.arraycopy(inputData[i], 0, this.data[i], 0, cols);
            }
        }
    }

    // Method to transpose the matrix
    public Matrix transpose()
	{
        Matrix transposed=new Matrix(cols, rows, null);
        for(int i=0;i<rows;i++)
		{
            for(int j=0;j<cols;j++)
			{
                transposed.data[j][i]=this.data[i][j];
            }
        }
        return transposed;
    }

    // Method to add two matrices
    public Matrix add(Matrix m)
	{
        if(this.rows != m.rows || this.cols != m.cols)
		{
            throw new IllegalArgumentException("Matrix dimensions do not match for addition.");
        }
        Matrix result=new Matrix(rows,cols,null);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result.data[i][j]=this.data[i][j]+m.data[i][j];
            }
        }
        return result;
    }

    // Static method for addition of two matrices
    public static Matrix addition(Matrix m1,Matrix m2){
        return m1.add(m2);
    }

    // Method to subtract two matrices
    public Matrix sub(Matrix m){
        if(this.rows != m.rows || this.cols != m.cols){
            throw new IllegalArgumentException("Matrix dimension do not match for subtraction.");
        }
        Matrix result=new Matrix(rows,cols,null);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result.data[i][j]=this.data[i][j]-m.data[i][j];
            }
        }
        return result;
    }

    // Static Method for subtraction of two matrices
    public static Matrix subtraction(Matrix m1, Matrix m2){
        return m1.sub(m2);
    }

    // Method to multiply two matrices
    public Matrix mul(Matrix m){
        if(this.cols != m.rows){
            throw new IllegalArgumentException("Matrix dimension do not match for multiplication");
        }
        Matrix result=new Matrix(this.rows,m.cols,null);
        for(int i=0;i<result.rows;i++){
            for(int j=0;j<result.cols;j++){
                for(int k=0;k<this.cols;k++){
                    result.data[i][j] += this.data[i][k] + m.data[k][j];
                }
            }
        }
        return result;
    }

    // Static method for multiplication of two matrices
    public static Matrix multiplication(Matrix m1,Matrix m2){
        return m1.mul(m2);
    }

    // Override toString() to print the matrix row by row
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(double[] row:data){
            for(double val:row){
                sb.append(val).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class p8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Input for Matrix 1
        System.out.println("Enter rows and columns for Matrix 1: ");
        int rows1=sc.nextInt();
        int cols1=sc.nextInt();

        double[][] data1=new double[rows1][cols1];
        System.out.println("Enter elements of Matrix 1:");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                data1[i][j]=sc.nextDouble();
            }
        }
        Matrix m1=new Matrix(rows1, cols1, data1);

        // Input for Matrix 2
        System.out.println("Enter rows and columns for Matrix 2: ");
        int rows2=sc.nextInt();
        int cols2=sc.nextInt();

        double[][] data2=new double[rows2][cols2];
        System.out.println("Enter elements of Matrix 2:");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                data2[i][j] = sc.nextDouble();
            }
        }
        Matrix m2 = new Matrix(rows2, cols2, data2);

        // Display matrics
        System.out.println("Matrix 1:");
        System.out.println(m1);
        System.out.println("Matrix 2:");
        System.out.println(m2);

        // Matrix Addition
        try{
            Matrix sum=Matrix.addition(m1, m2);
            System.out.println("sum of matrics:");
            System.out.println(sum);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Matrix Subtraction
        try{
            Matrix diff=Matrix.subtraction(m1, m2);
            System.out.println("Difference of matrices:");
            System.out.println(diff);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Matrix Multiplication
        try{
            Matrix product=Matrix.multiplication(m1, m2);
            System.out.println("Product of matrics:");
            System.out.println(product);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Transpose of Matrix 1
        System.out.println("Transpose of Matrix 1:");
        System.out.println(m1.transpose());

        sc.close();
    }
}