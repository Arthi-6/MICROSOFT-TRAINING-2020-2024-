class Solution {
    public int countStudents(int[] students, int[] sandwiches) { 
        int ones=0;
        int zeros=0;
        for(int i=0;i<students.length;i++)
        {
            if(students[i]==0)
            {
                zeros++;
            } 
            else 
            {
                ones++;
            }
        } 
        for(int i=0;i<sandwiches.length;i++)
        {
            if(sandwiches[i]==0)
            { 
                if(zeros==0)
                {
                return ones;
                } 
                zeros--;
            } 
            else
            {
                if(ones==0)
                {
                    return zeros;
                } 
                ones--;
            }
        }
        return 0;
    }
}
