import java.util.Scanner;
import java.util.Random;

class Matrix
{

    public static double[][] createMatrix(int rows, int columns)
    {
        Random rand = new Random();
        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = rand.nextInt(    5);
            }
        }

        return matrix;
    }

    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2)
    {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
        {
            System.out.println("Matrix addition cannot be performed since the matrices are not equal.");
            return null;
        }

        double[][] addmatrix = new double[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[0].length; j++)
            {
                addmatrix[i][j]  = matrix1[i][j] + matrix2[i][j];
            }
        }

        return addmatrix;
    }

    public static double[][] subMatrix(double[][] matrix1, double[][] matrix2)
    {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
        {
            System.out.println("Matrix subtraction cannot be performed since the matrices are not equal.");
            return null;
        }

        double[][] submatrix = new double[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[0].length; j++)
            {
                submatrix[i][j]  = matrix1[i][j] - matrix2[i][j];
            }
        }

        return submatrix;
    }

    public static double[][] mulMatrix(double[][] matrix1, double[][] matrix2)
    {
        double[][] zero= new double[0][0];

        if (matrix1.length != matrix2[0].length)
        {
            System.out.println("Multiplication cannot be performed since they arent compatible.");
            return zero;
        }

        double[][] resultmat = new double[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix2[0].length; j++)
            {
                int sum = 0;

                 for (int k = 0; k < matrix1[0].length; k++)
                 {
                     sum += (matrix1[i][k] * matrix2[k][j]);
                 }
                 resultmat[i][j] = sum;
            }
        }

        return resultmat;
    }

    public static double[][] transpose(double[][] matrix)
    {
        double[][] transmat = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0;j < matrix.length; j++)
            {
                transmat[i][j] = matrix[j][i];
            }
        }

        return transmat;
    }

    public static double det2d(double[][] matrix)
    {
        if (matrix.length != 2 || matrix[0].length != 2)
        {
            System.out.println("determinant cannot be performed since it is not a square matrix.");
            return 0;
        }

        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static double det3d(double[][] matrix)
    {
        if (matrix[0].length != 3 || matrix.length != 3)
        {
            System.out.println("determinant cannot be performed since it is not a 3x3 matrix.");
            return 0;
        }

         return ((matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))) - (matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))) + (matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]))));
    }


    public static double[][] adj2d(double[][] matrix)
    {
        return new double[][] { { (matrix[1][1]), (-(matrix[0][1]))},{ -(matrix[1][0]), matrix[0][0]}};
    }

    public static double[][] adj3d(double[][] matrix) 
    {
        if (matrix.length != 3 || matrix[0].length != 3)
        {
            System.out.println("Adjoint cannot be calculated since it is not a 3x3 matrix");
            return null;
        }

        double[][] cofmat = new double[3][3];
        
        cofmat[0][0] = (matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]);
        cofmat[0][1] = -((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]));
        cofmat[0][2] = (matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]);
        cofmat[1][0] = -((matrix[0][1] * matrix[2][2]) - (matrix[0][2] * matrix[2][1]));
        cofmat[1][1] = (matrix[0][0] * matrix[2][2]) - (matrix[0][2] * matrix[2][0]);
        cofmat[1][2] = -((matrix[0][0] * matrix[2][1]) - (matrix[0][1] * matrix[2][0]));
        cofmat[2][0] = (matrix[0][1] * matrix[1][2]) - (matrix[0][2] * matrix[1][1]);
        cofmat[2][1] = -((matrix[0][0] * matrix[1][2]) - (matrix[0][2] * matrix[1][0]));
        cofmat[2][2] = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

        double[][] adjoint3d = new double[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                adjoint3d[i][j] = cofmat[j][i];
            }
        }

        return adjoint3d;
    }


    public static double[][] inverse2d(double[][] adjmatrix, double determinant)
    {
        double[][] zero= new double[0][0];
        if (adjmatrix.length != 2 || adjmatrix[0].length != 2)
        {
            System.out.println("Inverse cannot be performed since it is not a 2x2 matrix");
            return zero;
        }

        double[][] inversemat2d = new double[adjmatrix.length][adjmatrix.length];

        for (int i = 0; i < adjmatrix.length; i++)
        {
            for (int j = 0; j < adjmatrix.length; j++)
            {
                inversemat2d[i][j] = (1.0/determinant) * adjmatrix[i][j];
            }
        }
        return inversemat2d;

    }

    public static double[][] inverse3d(double[][] adjmatrix, double determinant)
    {
        double[][] zero= new double[0][0];
        if (adjmatrix.length != 3 || adjmatrix[0].length != 3)
        {
            System.out.println("Inverse cannot be performed since it is not a 3x3 matrix");
            return zero;
        }

        double[][] inversemat3d = new double[adjmatrix.length][adjmatrix.length];

        for (int i = 0; i < adjmatrix.length; i++)
        {
            for (int j = 0; j < adjmatrix.length; j++)
            {
                inversemat3d[i][j] = (1.0/determinant) * adjmatrix[i][j];
            }
        }
        return inversemat3d;

    }
    
    public static void displaymat(double[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }



    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = s.nextInt();
        double[][] mat1 = createMatrix(rows, columns);
        double[][] mat2 = createMatrix(rows, columns);

        double[][] addmat = addMatrix(mat1, mat2);
        double[][] submat = subMatrix(mat1, mat2);
        double[][] mulmat = mulMatrix(mat1, mat2);
        double[][] transmat = transpose(mat1);


        System.out.println("Matrix 1: ");
        displaymat(mat1);
        System.out.println();

        System.out.println("Matrix 2: ");

        displaymat(mat2);
        System.out.println();

        System.out.println(" Added Matrix: ");

        displaymat(addmat);
        
        System.out.println();

        System.out.println(" Subracted Matrix: ");

        displaymat(submat);
        
        System.out.println();

        System.out.println(" Multiplied Matrix: ");

        displaymat(mulmat);

        System.out.println();

        System.out.println(" Transposed Matrix: ");

        displaymat(transmat);

        System.out.println();

        double determinant2d = det2d(mat1);
        System.out.println("The determinant of the 2x2 matrix is " + determinant2d);

        System.out.println();

        double determinant3d = det3d(mat1);
        System.out.println("The determinant of the 3x3 matrix is " + determinant3d);

        System.out.println();

        double[][] adjmat2d = adj2d(mat1);
        double[][] invmat2d = inverse2d(mat1, determinant2d);

        System.out.println("The Inverse of the 2x2 matrix is: ");

        displaymat(invmat2d);

        System.out.println();

        double[][] adjmat3d = adj3d(mat1);
        double[][] invmat3d = inverse3d(mat1, determinant3d);

        if(invmat3d.length>0)
        {System.out.println("The Inverse of the 3x3 matrix is: ");}
        displaymat(invmat3d);

    }
}