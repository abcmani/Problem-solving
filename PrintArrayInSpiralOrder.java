public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        int T=0,B=A.size()-1,L=0;
        int R=A.get(0).size()-1;
        int dir =0,i;
        
        ArrayList<Integer> AL = new ArrayList<Integer>();
        //one dimensonal array 1xN
        if(T==B)
        {
            for(i=L;i<=R;i++)
            {
                AL.add(A.get(T).get(i));
            }
            return AL;
        }
        //One dimensional Array Nx1
        if(L==R)
        {
            for(i=T;i<=B;i++)
            {
                AL.add(A.get(i).get(L));
            }
            return AL;
        }
        //2D array of size MxN
        while(T <=B && L<=R)
        {
            if(dir ==0)//Right direction
            {
                for(i =L; i<=R;i++ )
                {
                    AL.add(A.get(T).get(i));
                }
                T++;  
            }
            if(dir==1)//Down direction
            {
                for(i=T; i<=B; i++)
                {
                    AL.add(A.get(i).get(R));
                }
                R--;
            }
            if(dir ==2)//Left direction
            {
                for(i=R; i>=L;i--)
                {
                    AL.add(A.get(B).get(i));
                }
                B--;
            }
            if(dir ==3)//Upward direction
            {
                for(i=B;i>=T;i--)
                {
                    AL.add(A.get(i).get(L));
                }
                L++;
            }
            dir =(dir+1)%4;   //Change direction
        }
        return AL;
    }
}
