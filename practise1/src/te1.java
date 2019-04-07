public class te1 {

    public static void main(String[] args) {
        int single_student_number = 0;

        int[] student_list={2,4,5,4,2};
        int i, j;
        int count;
        int x=0;
        boolean[] flag=new boolean[student_list.length];
        for(i=0; i<student_list.length; i++)
        {
            if(!flag[i])
            {
                count =1;
                for(j=i+1; j<student_list.length; j++)
                {
                    if(student_list[j]==student_list[i])

                    {
                        count++;
                        flag[j]=true;
                    }

                }

                if (count==1)
                {
                    System.out.println(student_list[i]);

                    x++;
                }
            }



        }


    }   //  public static int run(int[] student_list) {
        /*
         * Some work here; return type and arguments should be according to the problem's requirements
         */


     //  return student_list;
    }





