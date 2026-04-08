class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0 , i = 0 , j = people.length - 1;
        while(i <= j){
            int rem = limit - people[j--];
            count++;
            if(i <= j && people[i] <= rem)
                i++;
        }
        return count;
    }
}