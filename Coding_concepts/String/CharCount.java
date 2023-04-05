public class CharCount{
public static void main(String[] args) {

String Str= "aaabcabcabcab";

char[] ch = Str.toCharArray(); 


for(int i=0;i<ch.length; i++){
  int count =1;

if(ch[i] != '\u0000'){

   for(int j=i+1;j<ch.length;j++){

  if(ch[i] == '\u0000'){
    continue;
} 

     if(ch[i] != '\u0000' ){
        
        if(ch[i] == ch[j]){

             count++;
         ch[j]='\u0000';
            
}
}

}


System.out.println("Char "+ch[i]  +" is Repeated "+ count +" Times");
}

}

}

}