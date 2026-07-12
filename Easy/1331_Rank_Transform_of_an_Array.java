class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int rank[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rank[i]=arr[i];
        }
        Arrays.sort(rank);
        HashMap<Integer,Integer>map=new HashMap<>();
        int currentrank=1;
        for(int num:rank){
            if(!map.containsKey(num)){
                map.put(num,currentrank++);
            }
        } 
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
        
    }
}