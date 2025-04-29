class Main
{
    public static void main(String[] args) {
        int[] i_p_arr=new int[]{2,1,2,5,7,1,9,3,6,8,8};
        int[] pattern = new int[]{2,1,8,3};
        int [] o_p_arr= new int[i_p_arr.length];
        int k=0;
        for(int i=0;i<pattern.length;i++){
            for(int j=0;j<i_p_arr.length;j++){
                if(pattern[i]==i_p_arr[j]){
                    o_p_arr[k++]=i_p_arr[j];
                }
            }
        }
        for(int j=0;j<i_p_arr.length;j++){
            int flag2=0,flag1=0,flag8=0,flag3=0;
            if(i_p_arr[j]==pattern[0]){
                flag2=1;
            }
            else if(i_p_arr[j]==pattern[1]){
                flag1=1;
            }
            else if(i_p_arr[j]==pattern[2]){
                flag8=1;
            }
            else if(i_p_arr[j]==pattern[3]){
                flag3=1;
            }
            if(flag1==0 && flag2==0 && flag3==0 && flag8==0){
                o_p_arr[k++]=i_p_arr[j];
            }
        }
        for(int i=0;i<o_p_arr.length;i++){
            System.out.print(o_p_arr[i]+" ");
        }
    }
}