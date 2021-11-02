class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet();
        for(int i = 0; i < paths.size(); i++){
              set.add(paths.get(i).get(0));
        }
        
        System.out.println(set);
        for(int i = 0; i < paths.size(); i++) {
            if(!set.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}