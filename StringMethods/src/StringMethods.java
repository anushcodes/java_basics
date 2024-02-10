public class StringMethods {
    private String string;

    public StringMethods(String string) {
        this.string = string;
    }

    public void subString(){
        char str[] = this.string.toCharArray();
        String newStr = "";
        for(int i=3;i<str.length;i++){
            newStr+=str[i];
        }
        System.out.println("Substring : "+newStr);
    }

    public char charAt(int index){
        char str[] = this.string.toCharArray();
        return str[index];
    }

    public boolean equalsIgnoreCase(StringMethods newString){
        if(this.string.length()!=newString.string.length()){
            return false;
        }
        for(int i=0;i<newString.string.length();i++){
            if((this.string.charAt(i)!=newString.charAt(i))&&((char)((int)this.string.charAt(i)+32)!=newString.charAt(i))&&((char)((int)this.string.charAt(i)-32)!=newString.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public void concat(StringMethods stringMethods){
        System.out.println("Concatenated string : "+this.string+stringMethods.string);
    }
    
}
