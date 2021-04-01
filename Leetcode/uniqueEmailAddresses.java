class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet();
        
        for(String email: emails){
            set.add(divideEmail(email));
        }
        
        return set.size();
    }
    
     public String divideEmail(String email){
        int atIdx = email.indexOf("@");
        String localName = email.substring(0, atIdx);
        String domainName = email.substring(atIdx, email.length());
        
        int plusIdx = localName.indexOf("+");
        if(plusIdx != -1){
            localName = localName.substring(0, plusIdx);
        }

        localName = localName.replaceAll("\\.", "");

        return localName + domainName;
    }
}