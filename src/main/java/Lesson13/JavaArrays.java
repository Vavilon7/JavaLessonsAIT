package Lesson13;

public class JavaArrays {
    public static void main(String[] args) {
            int [] salaryMax = {400, 350, 500, 200, 300};

            int[]salaryMaria = new int[7];
            salaryMaria[0] = 350;
            salaryMaria[1] = 400;
            salaryMaria[2] = 450;
            salaryMaria[3] = 470;
            salaryMaria[4] = 400;
            salaryMaria[5] = 490;
            salaryMaria[6] = 250;

            int salaryMaxFirstMonth = salaryMax[0];
            int sizeSalarymax = salaryMax.length;
            //System.out.println("salaryMaxFirstMonth " + salaryMaxFirstMonth);
            //System.out.println("sizeSalarymax " + sizeSalarymax);


            for(int i = 0; i < salaryMaria.length; i++ ){
                System.out.println(salaryMaria[i]);
            }

            for(int salary: salaryMaria){
                System.out.println(salary);
            }

        }
    }


