public class test {

    public static void  main (String args[]) {

        int[] student_list={2,4,5,4,2};
        System.out.println(run(student_list));
    }

        public static int run(int[] student_list) {

            int single_student_number = 0;
            int i, j;
            int count;
         //  int[] student_list={2,4,5,4,2};

            boolean[] flag=new boolean[student_list.length];
            for(i=0; i<student_list.length; i++) {
                if (!flag[i]) {
                    count = 1;

                    for (j = i + 1; j < student_list.length; j++) {
                        if (student_list[j] == student_list[i]) {
                            count++;
                            flag[j] = true;
                        }
                    }
                    if (count == 1)
                    {
                        int x=0;

                        x++;
                    }
                }
            }
                return single_student_number;
        }
    }









